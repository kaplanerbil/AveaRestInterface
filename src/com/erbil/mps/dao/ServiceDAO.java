package com.erbil.mps.dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.naming.NamingException;
import javax.sql.DataSource;

import com.erbil.mps.model.SubscriberVO;
import com.erbil.mps.model.UserTransactionsVO;


public class ServiceDAO {
	
	static DataSource ds = null;
	static CallableStatement cstmt = null;
	static Connection connection = null;
	
	static{
		try {
			Properties h = new Properties();
			h.put(javax.naming.Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
//			h.put(javax.naming.Context.PROVIDER_URL, "t3://10.248.67.240:8001"); // oim dev
			h.put(javax.naming.Context.PROVIDER_URL, "t3://localhost:8001");
			javax.naming.Context ic = new javax.naming.InitialContext(h);
			ds = (javax.sql.DataSource) ic.lookup("mps.oracle.dbsource");
			connection = ds.getConnection();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> allLogsMock() {
		List<String> logs = new ArrayList<String>();
		logs.add("2017-03-01 16:46:36  05012631549  123456");
		logs.add("2017-03-01 16:17:34  05012631548  123456");
		logs.add("2017-03-01 16:46:36  05012631549  123456");
		logs.add("2017-03-01 16:17:34  05012631548  123456");
		logs.add("2017-03-01 16:46:36  05012631549  123456");
		logs.add("2017-03-01 16:17:34  05012631548  123456");
		return logs;
	}

	public static List<SubscriberVO> getLogs(int fromRowNumber, int toRowNumber) {
		
//		String sql = "select l.INSERT_DATE, l.USER_NAME, u.password, "
//				+ "(CASE WHEN u.password='8E81F0CC5096BB055884C79AEA201A6ABDA0F5F6' THEN '001234' "
//				+ "WHEN u.password='7C4A8D09CA3762AF61E59520943DC26494F8941B' THEN '123456' " + "ELSE 'tanimsiz' END)  as sifre "
//				+ "from login_log l, aaa_user u " + "where l.isloggedin='S' "
////				+ "and INSERT_DATE between add_months(trunc(sysdate, 'MM'), -1) and sysdate " // son 1 ay islemlerini alalim"
//				+ "and INSERT_DATE between sysdate-" + daysBefore + "  and sysdate-" + tillDaysBefore // verilen gun kadar oncesine ait islemler
//				+ " and  l.user_name=u.user_name " + "and (u.password='8E81F0CC5096BB055884C79AEA201A6ABDA0F5F6' " // 001234 sha1 hash
//				+ "or u.password='7C4A8D09CA3762AF61E59520943DC26494F8941B' " // 123456 sha1 hash
//				+ ") order by insert_date desc";
		
		String sql = 
				"select * from\r\n" + 
				"(select k.*,     rownum as rnum    from \r\n" + 
				"(SELECT  u.user_name, \r\n" + 
				"(CASE WHEN u.password='8E81F0CC5096BB055884C79AEA201A6ABDA0F5F6' THEN '001234' \r\n" + 
				"WHEN u.password='7C4A8D09CA3762AF61E59520943DC26494F8941B' THEN '123456' ELSE 'tanimsiz' END)  as sifre,\r\n" + 
				"insert_date as islem_tarihi\r\n" + 
				"from\r\n" + 
				"(select user_name, password from aaa_user \r\n" + 
				"--where   password='8E81F0CC5096BB055884C79AEA201A6ABDA0F5F6' or password='7C4A8D09CA3762AF61E59520943DC26494F8941B' \r\n" + 
				" ) u ,\r\n" + 
				"(SELECT insert_date, user_name, isloggedin from  login_log l \r\n" + 
				"WHERE \r\n" + 
				"--INSERT_DATE between sysdate-40  and sysdate and \r\n" + 
				"ROWID IN \r\n" + 
				"( SELECT MAX(ROWID) FROM login_log GROUP BY user_name )   ) l\r\n" + 
				"where u.user_name=l.user_name\r\n" + 
				"and isloggedin='S'\r\n" + 
				"order by insert_date desc\r\n" + 
				")  k\r\n" + 
				")\r\n" + 
				"where rnum >"+fromRowNumber+" and rnum<="+toRowNumber;

		ResultSet rs = null;
		CallableStatement cstmt = null;
		List<SubscriberVO> allLogs = new ArrayList<>();
		
		try {
			cstmt = connection.prepareCall(sql);
			cstmt.setFetchSize(48);
			rs = cstmt.executeQuery();
			
			while (rs.next()) {
//				String row = rs.getString(1) + "&nbsp;&nbsp;" + rs.getString(2) + "&nbsp;&nbsp;" + rs.getString(4) + " <br/>";
				SubscriberVO subscriber = new SubscriberVO();
				subscriber.setMsisdn(rs.getString(1));
				subscriber.setPassword(rs.getString(2));
				UserTransactionsVO log = new UserTransactionsVO();
				Date insertDate = rs.getDate(3);
				log.setOperationDate(insertDate);
				subscriber.setLog(log);
				allLogs.add(subscriber);
			}
		} catch (Exception e) {
			// row = "hata olustu=" + e.getMessage();
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				cstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return allLogs;
	}

	
}

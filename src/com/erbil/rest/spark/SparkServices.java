package com.erbil.rest.spark;

import static spark.Spark.get;
import static spark.Spark.port;

import com.erbil.mps.FormUtils;
import com.erbil.mps.InfoBus;
import com.erbil.mps.ServiceBean;
import com.erbil.mps.model.SubscriberVO;
import com.google.gson.Gson;


public class SparkServices {
	
	public SparkServices() {
		
		port(7777);
		
		//routes
		
		get("/allLogsMockList", (req, res) -> {
			return ServiceBean.allLogsMock();
		});
		
		get("/hello", (req, res) -> "Hello World");

		get("/abone/:msisdn", (req, res) -> {
			String msisdn = req.params(":msisdn");
			return FormUtils.returnSubscriber(msisdn);
		});

		get("/aktifmi/:msisdn", (req, res) -> {
			String msisdn = req.params(":msisdn");
			Object o = FormUtils.returnSubscriber(msisdn);
			if (o instanceof SubscriberVO) {
				String lineStatus = ((SubscriberVO) o).getLineStatus();
				if (lineStatus.equals("a")) {
					return "aktif";
				} else {
					return "aktif degil:" + lineStatus;
				}
			} else
				return o;
		});
		
		get("/guncelFaturaTutar/:msisdn", (req, res) -> {
			String msisdn = req.params(":msisdn");
			String result = InfoBus.getCurrentInvoiceBillAmount(msisdn);
			return result;
		});
		
		get("/logs/:fromIndex/:toIndex", (req, res) -> {
			int fromIndex = Integer.parseInt(req.params(":fromIndex"));
			int toIndex = Integer.parseInt(req.params(":toIndex"));
			return new Gson().toJson(ServiceBean.getLogs(fromIndex, toIndex));
		});

		get("/logsMock", (req, res) -> {
			return ServiceBean.allLogsMock();
		});

     }
	
	public static void main(String[] args) {
		Object o = ServiceBean.getLogs(0, 10);
		System.out.println(o);
	}
	
	
}

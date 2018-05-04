package com.erbil.mps;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLConnection;
//import java.net.URLEncoder;
//
//import javax.net.ssl.HttpsURLConnection;
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;
//
//import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
//import org.apache.commons.httpclient.HostConfiguration;
//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.HttpStatus;
//import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
//import org.apache.commons.httpclient.NameValuePair;
//import org.apache.commons.httpclient.methods.GetMethod;
//import org.apache.commons.httpclient.methods.PostMethod;
//import org.apache.commons.httpclient.methods.StringRequestEntity;
//import org.apache.commons.httpclient.params.HttpMethodParams;
//import org.slf4j.LoggerFactory;
//
///**
// * @author 000161
// *
// *         TODO To change the template for this generated type comment go to
// *         Window - Preferences - Java - Code Style - Code Templates
// */
//public class HTTPMultiThreaded {
//
//    private final static org.slf4j.Logger log_ = LoggerFactory.getLogger(HTTPMultiThreaded.class);
//
//    /**
//     * connectionStaleCheckingEnabled
//     * The connectionStaleCheckingEnabled flag to set on all created connections.
//     * This value should be left true except in special circumstances.
//     * 
//     * maxConnectionsPerHost
//     * The maximum number of connections that will be created for any particular HostConfiguration. Defaults to 2
//     * 
//     * maxTotalConnections
//     * The maximum number of active connections. Defaults to 20.
//     */
//    public static String getFromHttp(String url, String encoding, int connectionTimeout, int readTimeout) throws IOException {
//	StringBuffer resultBuf = new StringBuffer();
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	String responseBody = "";
//	GetMethod method = new GetMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	    client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	    client.executeMethod(method);
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		BufferedReader in = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), encoding));
//		while(in.ready())
//		    resultBuf.append(in.readLine());
//		responseBody = resultBuf.toString();
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :getFromHttp(String url : " + url + ",String encoding,int connectionTimeout,int readTimeout)" + e, e);
//	}finally{
//	    method.releaseConnection();
//	}
//	return responseBody;
//    }
//
//    public static String getFromHttp(String url, String encoding) throws IOException {
//	return getFromHttp(url, encoding, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT);
//    }
//
//    public static String getFromHttp(String url, boolean isProxyNeeded, String encoding) throws IOException {
//	return getFromHttp(url, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT, isProxyNeeded, encoding);
//    }
//
//    public static String getFromHttp(String url, int connectionTimeout, int readTimeout) throws IOException {
//	return getFromHttp(url, connectionTimeout, readTimeout, false);
//    }
//
//    public static String getFromHttp(String url, int connectionTimeout, int readTimeout, boolean isProxyNeeded) throws IOException {
//	return getFromHttp(url, connectionTimeout, readTimeout, isProxyNeeded, null);
//    }
//
//    public static String getFromHttp(String url, int connectionTimeout, int readTimeout, boolean isProxyNeeded, String encoding) throws IOException {
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	String responseBody = "";
//	GetMethod method = new GetMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	    client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	    if(isProxyNeeded){
//		HostConfiguration config = new HostConfiguration();
//		String proxy = "10.1.240.50"; // "pristgup1",
//		int port = 8080;
//		config.setProxy(proxy, port);
//		client.setHostConfiguration(config);
//	    }
//	    log_.debug("getFromHttp before executeMethod completeUrl:" + url);
//	    client.executeMethod(method);
//	    log_.debug("getFromHttp after executeMethod completeUrl:" + url);
//	    // if (method.getStatusCode() == HttpStatus.SC_OK) {
//	    BufferedReader br = null;
//	    if(encoding != null && !encoding.equalsIgnoreCase(""))
//		br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), encoding));
//	    else
//		br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream()));
//	    String line = null;
//	    StringBuffer respBuf = new StringBuffer();
//	    while((line = br.readLine()) != null){
//		respBuf.append(line);
//	    }
//	    responseBody = respBuf.toString();
//	    // }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :getFromHttp(String url : " + url + ",int connectionTimeout,int readTimeout)" + e, e);
//	}finally{
//	    method.releaseConnection();
//	}
//	return responseBody;
//    }
//
//    public static String getFromHttpThrowsAllException(String url, int connectionTimeout, int readTimeout, boolean isProxyNeeded) throws Exception {
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	String responseBody = "";
//	GetMethod method = new GetMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	    client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	    if(isProxyNeeded){
//		HostConfiguration config = new HostConfiguration();
//		String proxy = "10.1.240.50"; // "pristgup1",
//		int port = 8080;
//		config.setProxy(proxy, port);
//		client.setHostConfiguration(config);
//	    }
//	    log_.debug("getFromHttp before executeMethod completeUrl:" + url);
//	    client.executeMethod(method);
//	    log_.debug("getFromHttp after executeMethod completeUrl:" + url);
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		BufferedReader br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream()));
//		String line = null;
//		StringBuffer respBuf = new StringBuffer();
//		while((line = br.readLine()) != null){
//		    respBuf.append(line);
//		}
//		responseBody = respBuf.toString();
//	    }else{
//		throw new Exception("Status code not OK:" + method.getStatusCode());
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :getFromHttp(String url : " + url + ", int connectionTimeout,int readTimeout)" + e, e);
//	    throw new Exception(e.getMessage());
//	}finally{
//	    method.releaseConnection();
//	}
//	return responseBody;
//    }
//
//    public static String getFromHttpThrowsAllException2(String url, int connectionTimeout, int readTimeout, boolean isProxyNeeded) throws Exception {
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	String responseBody = "";
//	GetMethod method = new GetMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	    client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	    if(isProxyNeeded){
//		HostConfiguration config = new HostConfiguration();
//		String proxy = "10.1.240.50"; // "pristgup1",
//		int port = 8080;
//		config.setProxy(proxy, port);
//		client.setHostConfiguration(config);
//	    }
//	    log_.debug("getFromHttp before executeMethod completeUrl:" + url);
//	    client.executeMethod(method);
//	    log_.debug("getFromHttp after executeMethod completeUrl:" + url);
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		BufferedReader br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream()));
//		String line = null;
//		StringBuffer respBuf = new StringBuffer();
//		while((line = br.readLine()) != null){
//		    respBuf.append(line);
//		}
//		responseBody = respBuf.toString();
//	    }else{
//		throw new Exception("Status code not OK:" + method.getStatusCode());
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :getFromHttp(String url : " + url + ", int connectionTimeout,int readTimeout)" + e, e);
//	    throw e;
//	}finally{
//	    method.releaseConnection();
//	}
//	return responseBody;
//    }
//
//    public static String getFromHttp(String url) throws IOException {
//	return getFromHttp(url, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT, false);
//    }
//
//    public static String getFromHttp(String url, boolean isProxyNeeded) throws IOException {
//	return getFromHttp(url, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT, isProxyNeeded);
//    }
//
//    public static String postFromHttp(String url, String XML, int connectionTimeout, int readTimeout, boolean isProxyNeeded) throws IOException {
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	if(isProxyNeeded){
//	    HostConfiguration config = new HostConfiguration();
//	    String proxy = "10.1.240.50"; // "pristgup1",
//	    int port = 8080;
//	    config.setProxy(proxy, port);
//	    client.setHostConfiguration(config);
//	}
//	String responseBody = "";
//	PostMethod method = new PostMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    method.setRequestEntity(new StringRequestEntity(XML));
//	    client.executeMethod(method);
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		BufferedReader br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream()));
//		String line = null;
//		StringBuffer respBuf = new StringBuffer();
//		while((line = br.readLine()) != null){
//		    respBuf.append(line);
//		}
//		responseBody = respBuf.toString();
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :postFromHttp(String url : " + url + ",String XML,int connectionTimeout,int readTimeout)" + e, e);
//	}finally{
//	    method.releaseConnection();
//	}
//	return responseBody;
//    }
//
//    public static String postFromHttp(String url, String XML) throws IOException {
//	return postFromHttp(url, XML, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT, false);
//    }
//
//    public static String postFromHttp(String url, String XML, boolean isProxyNeeded) throws IOException {
//	return postFromHttp(url, XML, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT, isProxyNeeded);
//    }
//
//    public static String postFromHttp(String url, String XML, String encoding, int connectionTimeout, int readTimeout) throws IOException {
//	StringBuffer resultStr = new StringBuffer();
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	PostMethod method = new PostMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	method.setRequestHeader("Content-Type", "text/xml");
//	try{
//	    method.setRequestEntity(new StringRequestEntity(XML));
//	    client.executeMethod(method);
//	    InputStream in = null;
//	    InputStreamReader is = null;
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		in = method.getResponseBodyAsStream();
//		is = new InputStreamReader(in, encoding);
//		BufferedReader resultPage = new BufferedReader(is);
//		String resultCode;
//		resultCode = resultPage.readLine();
//		while(resultCode != null){
//		    if((resultCode.length() != 0)){
//			resultStr.append(resultCode.trim());
//		    }
//		    resultCode = resultPage.readLine();
//		}
//		resultPage.close();
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :postFromHttp(String url : " + url + ",String XML:" + XML + ",String encoding,int connectionTimeout,int readTimeout)" + e, e);
//	}finally{
//	    method.releaseConnection();
//	}
//	return resultStr.toString();
//    }
//
//    public static String postFromHttp(String url, String XML, String encoding) throws IOException {
//	return postFromHttp(url, XML, encoding, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT);
//    }
//
//    public static void main(String[] args) {
//	try{
//	    postFromHHTPWithContentType("https://sms.avea.com.tr/kurumsalsms/prepaidbulksmsbaremlist?username=USER_AVEACOMTR&password=827ccb0eea8a706c4c34a16891f84e7b&type=3", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><PREPAID_BULK_SMS_BAREMS><RESULT><STATUS>0</STATUS><DESCRIPTION>Success</DESCRIPTION><PID>45018ff5</PID></RESULT><BAREMLIST><BAREM_UNIT><PACKAGE_ID>Y10000</PACKAGE_ID><SMS_BAREM>10000</SMS_BAREM><AMOUNT>800</AMOUNT><EXPIRE_PERIOD>365</EXPIRE_PERIOD><EXPIRE_PERIOD_DESCRIPTION>YILLIK</EXPIRE_PERIOD_DESCRIPTION><TYPE>3</TYPE></BAREM_UNIT><BAREM_UNIT><PACKAGE_ID>Y25000</PACKAGE_ID><SMS_BAREM>25000</SMS_BAREM><AMOUNT>1875</AMOUNT><EXPIRE_PERIOD>365</EXPIRE_PERIOD><EXPIRE_PERIOD_DESCRIPTION>YILLIK</EXPIRE_PERIOD_DESCRIPTION><TYPE>3</TYPE></BAREM_UNIT><BAREM_UNIT><PACKAGE_ID>Y50000</PACKAGE_ID><SMS_BAREM>50000</SMS_BAREM><AMOUNT>3500</AMOUNT><EXPIRE_PERIOD>365</EXPIRE_PERIOD><EXPIRE_PERIOD_DESCRIPTION>YILLIK</EXPIRE_PERIOD_DESCRIPTION><TYPE>3</TYPE></BAREM_UNIT><BAREM_UNIT><PACKAGE_ID>Y100000</PACKAGE_ID><SMS_BAREM>100000</SMS_BAREM><AMOUNT>6300</AMOUNT><EXPIRE_PERIOD>365</EXPIRE_PERIOD><EXPIRE_PERIOD_DESCRIPTION>YILLIK</EXPIRE_PERIOD_DESCRIPTION><TYPE>3</TYPE></BAREM_UNIT><BAREM_UNIT><PACKAGE_ID>Y250000</PACKAGE_ID><SMS_BAREM>250000</SMS_BAREM><AMOUNT>14250</AMOUNT><EXPIRE_PERIOD>365</EXPIRE_PERIOD><EXPIRE_PERIOD_DESCRIPTION>YILLIK</EXPIRE_PERIOD_DESCRIPTION><TYPE>3</TYPE></BAREM_UNIT><BAREM_UNIT><PACKAGE_ID>Y500000</PACKAGE_ID><SMS_BAREM>500000</SMS_BAREM><AMOUNT>26500</AMOUNT><EXPIRE_PERIOD>365</EXPIRE_PERIOD><EXPIRE_PERIOD_DESCRIPTION>YILLIK</EXPIRE_PERIOD_DESCRIPTION><TYPE>3</TYPE></BAREM_UNIT><BAREM_UNIT><PACKAGE_ID>Y1000000</PACKAGE_ID><SMS_BAREM>1000000</SMS_BAREM><AMOUNT>50000</AMOUNT><EXPIRE_PERIOD>365</EXPIRE_PERIOD><EXPIRE_PERIOD_DESCRIPTION>YILLIK</EXPIRE_PERIOD_DESCRIPTION><TYPE>3</TYPE></BAREM_UNIT><BAREM_UNIT><PACKAGE_ID>Y2000000</PACKAGE_ID><SMS_BAREM>2000000</SMS_BAREM><AMOUNT>98000</AMOUNT><EXPIRE_PERIOD>365</EXPIRE_PERIOD><EXPIRE_PERIOD_DESCRIPTION>YILLIK</EXPIRE_PERIOD_DESCRIPTION><TYPE>3</TYPE></BAREM_UNIT><BAREM_UNIT><PACKAGE_ID>Y5000</PACKAGE_ID><SMS_BAREM>5000</SMS_BAREM><AMOUNT>450</AMOUNT><EXPIRE_PERIOD>365</EXPIRE_PERIOD><EXPIRE_PERIOD_DESCRIPTION>YILLIK</EXPIRE_PERIOD_DESCRIPTION><TYPE>3</TYPE></BAREM_UNIT></BAREMLIST></PREPAID_BULK_SMS_BAREMS>", "ISO-8859-9");
//	}catch(Exception e){
//	    // TODO Auto-generated catch block
//	    e.printStackTrace();
//	}
//    }
//
//    public static int postFromHHTPWithContentType(String url, String XML, String contentType) throws Exception {
//	int result = 0;
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	client.getHttpConnectionManager().getParams().setConnectionTimeout(MPSConstants.HTTP_CONNECTION_TIMEOUT);
//	client.getHttpConnectionManager().getParams().setSoTimeout(MPSConstants.HTTP_READ_TIMEOUT);
//	PostMethod method = new PostMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	method.setRequestHeader("Content-Type", contentType);
//	try{
//	    method.setRequestEntity(new StringRequestEntity(XML));
//	    client.executeMethod(method);
//	    result = method.getStatusCode();
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :postFromHttp(String url : " + url + ",String XML,String encoding,int connectionTimeout,int readTimeout)" + e, e);
//	    throw e;
//	}finally{
//	    method.releaseConnection();
//	}
//	return result;
//    }
//
//    public static int postFromHHTPWithContentType(String url, String url2, String XML, String contentType) throws Exception {
//	int result = 0;
//	try{
//	    result = HTTPMultiThreaded.postFromHHTPWithContentType(url, XML, contentType);
//	    if(result != HttpStatus.SC_OK){
//		result = HTTPMultiThreaded.postFromHHTPWithContentType(url2, XML, contentType);
//	    }
//	}catch(IOException e){
//	    log_.error(e.getMessage(), e);
//	    try{
//		result = HTTPMultiThreaded.postFromHHTPWithContentType(url2, XML, contentType);
//	    }catch(Exception e2){
//		log_.error("postFromHHTPWithContentType-->" + e);
//	    }
//	}
//	return result;
//    }
//
//    public static String postFromHttpWithContentTypeEncoding(String url, String XML, String encoding, String contentType) throws IOException {
//	return postFromHttpWithContentTypeEncoding(url, XML, encoding, contentType, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT);
//    }
//
//    public static String sendPostRequestForCRM(String url, String XML, String encoding, int connectionTimeout, int readTimeout) throws IOException {
//	StringBuffer resultStr = new StringBuffer();
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	PostMethod method = new PostMethod(url);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	method.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
//	try{
//	    method.setRequestEntity(new StringRequestEntity(XML, "text/xml", encoding));
//	    client.executeMethod(method);
//	    InputStream in = null;
//	    InputStreamReader is = null;
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		in = method.getResponseBodyAsStream();
//		is = new InputStreamReader(in, encoding);
//		BufferedReader resultPage = new BufferedReader(is);
//		String resultCode;
//		resultCode = resultPage.readLine();
//		while(resultCode != null){
//		    if((resultCode.length() != 0)){
//			resultStr.append(resultCode.trim());
//		    }
//		    resultCode = resultPage.readLine();
//		}
//		resultPage.close();
//	    }
//	}catch(Exception e){
//	}finally{
//	    method.releaseConnection();
//	}
//	return resultStr.toString();
//    }
//
//    public static String postFromHttpWithContentTypeEncoding(String url, String XML, String encoding, String contentType, int connectionTimeout, int readTimeout) throws IOException {
//	StringBuffer resultStr = new StringBuffer();
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	PostMethod method = new PostMethod(url);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	if(encoding != null && encoding.equalsIgnoreCase("utf-8"))
//	    method.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
//	try{
//	    method.setRequestEntity(new StringRequestEntity(XML, contentType, encoding));
//	    client.executeMethod(method);
//	    InputStream in = null;
//	    InputStreamReader is = null;
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		in = method.getResponseBodyAsStream();
//		is = new InputStreamReader(in, encoding);
//		BufferedReader resultPage = new BufferedReader(is);
//		String resultCode;
//		resultCode = resultPage.readLine();
//		while(resultCode != null){
//		    if((resultCode.length() != 0)){
//			resultStr.append(resultCode.trim());
//		    }
//		    resultCode = resultPage.readLine();
//		}
//		resultPage.close();
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :postFromHttpWithContentTypeEncoding(String url : " + url + ",String XML:" + XML + ",String encoding,int connectionTimeout,int readTimeout)" + e, e);
//	}finally{
//	    method.releaseConnection();
//	}
//	return resultStr.toString();
//    }
//
//    public static String postFromHttpIWIS(String url, String XML, String encoding, String contentType) throws IOException {
//	StringBuffer resultStr = new StringBuffer();
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	client.getHttpConnectionManager().getParams().setConnectionTimeout(MPSConstants.HTTP_CONNECTION_TIMEOUT);
//	client.getHttpConnectionManager().getParams().setSoTimeout(MPSConstants.HTTP_READ_TIMEOUT);
//	PostMethod method = new PostMethod(url);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    // method.setRequestBody(XML);
//	    method.setRequestEntity(new StringRequestEntity(XML));
//	    method.setRequestHeader("Content-type", "text/xml; charset=" + encoding);
//	    client.executeMethod(method);
//	    InputStream in = null;
//	    InputStreamReader is = null;
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		in = method.getResponseBodyAsStream();
//		is = new InputStreamReader(in);
//		BufferedReader resultPage = new BufferedReader(is);
//		String resultCode;
//		resultCode = resultPage.readLine();
//		while(resultCode != null){
//		    if((resultCode.length() != 0)){
//			resultStr.append(resultCode.trim());
//		    }
//		    resultCode = resultPage.readLine();
//		}
//		resultPage.close();
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :postFromHttpWithContentTypeEncoding(String url : " + url + ",String XML:" + XML + ",String encoding,int connectionTimeout,int readTimeout)" + e, e);
//	}finally{
//	    method.releaseConnection();
//	}
//	return resultStr.toString();
//    }
//
//    public static String basicPostFormWithParameterNameValues(String url, NameValuePair[] nameValuePairs, boolean isProxyNeeded, String encoding) throws IOException {
//	return basicPostFormWithParameterNameValues(url, nameValuePairs, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT, isProxyNeeded, encoding);
//    }
//
//    public static String basicPostFormWithParameterNameValues(String url, NameValuePair[] nameValuePairs, boolean isProxyNeeded) throws IOException {
//	return basicPostFormWithParameterNameValues(url, nameValuePairs, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT, isProxyNeeded);
//    }
//
//    public static String basicPostFormWithParameterNameValues(String url, NameValuePair[] nameValuePairs, int connectionTimeout, int readTimeout, boolean isProxyNeeded) throws IOException {
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	if(isProxyNeeded){
//	    HostConfiguration config = new HostConfiguration();
//	    String proxy = "10.1.240.50"; // "pristgup1",
//	    int port = 8080;
//	    config.setProxy(proxy, port);
//	    client.setHostConfiguration(config);
//	}
//	String responseBody = "";
//	PostMethod method = new PostMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    // method.setRequestEntity(new StringRequestEntity(XML));
//	    /*
//	     * NameValuePair action = new NameValuePair("action", "login");
//	     * NameValuePair url = new NameValuePair("url", "/index.html");
//	     * NameValuePair userid = new NameValuePair("UserId", "userid");
//	     * NameValuePair password = new NameValuePair("Password", "password");
//	     * new NameValuePair[] {action, url, userid, password}
//	     */
//	    method.setRequestBody(nameValuePairs);
//	    client.executeMethod(method);
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		BufferedReader br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), "UTF-8"));
//		String line = null;
//		StringBuffer respBuf = new StringBuffer();
//		while((line = br.readLine()) != null){
//		    respBuf.append(line);
//		}
//		responseBody = respBuf.toString();
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :postFromHttp(String url : " + url + ",String XML,int connectionTimeout,int readTimeout)" + e, e);
//	}finally{
//	    method.releaseConnection();
//	}
//	return responseBody;
//    }
//
//    public static String basicPostFormWithParameterNameValues(String url, NameValuePair[] nameValuePairs, int connectionTimeout, int readTimeout, boolean isProxyNeeded, String encoding) throws IOException {
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	if(isProxyNeeded){
//	    HostConfiguration config = new HostConfiguration();
//	    String proxy = "10.1.240.50"; // "pristgup1",
//	    int port = 8080;
//	    config.setProxy(proxy, port);
//	    client.setHostConfiguration(config);
//	}
//	String responseBody = "";
//	PostMethod method = new PostMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    // method.setRequestEntity(new StringRequestEntity(XML));
//	    /*
//	     * NameValuePair action = new NameValuePair("action", "login");
//	     * NameValuePair url = new NameValuePair("url", "/index.html");
//	     * NameValuePair userid = new NameValuePair("UserId", "userid");
//	     * NameValuePair password = new NameValuePair("Password", "password");
//	     * new NameValuePair[] {action, url, userid, password}
//	     */
//	    method.setRequestBody(nameValuePairs);
//	    client.executeMethod(method);
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		BufferedReader br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), encoding));
//		String line = null;
//		StringBuffer respBuf = new StringBuffer();
//		while((line = br.readLine()) != null){
//		    respBuf.append(line);
//		}
//		responseBody = respBuf.toString();
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :postFromHttp(String url : " + url + ",String XML,int connectionTimeout,int readTimeout)" + e, e);
//	}finally{
//	    method.releaseConnection();
//	}
//	return responseBody;
//    }
//
//    public static String getMobileAdvertisement(String url, String cid, String uid, String userAgent, int timeout) throws Exception {
//	/*
//	 * http://uk-go.adinfuse.com/wbrs/inject2?cid=12358412&pid=aveacp&uid=9999999999&ua=NokiaN95%2F1%2E0
//	 * cid is identifier for the banner request, each request will use different cid
//	 * uid is Unique user identification, here encrypted msisdn information is used
//	 * pid is standart identifier for Avea
//	 * ua is url encoded user agent information
//	 */
//	userAgent = URLEncoder.encode(userAgent, "UTF-8");
//	url = url + "?cid=" + cid + "&pid=aveacp&uid=" + uid + "&ua=" + userAgent;
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	String responseBody = "";
//	GetMethod method = new GetMethod(url);
//	method.addRequestHeader("user-agent", userAgent);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    client.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
//	    client.getHttpConnectionManager().getParams().setSoTimeout(timeout);
//	    client.executeMethod(method);
//	    log_.debug("method.getStatusCode()" + method.getStatusCode());
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		BufferedReader br = null;
//		br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), "UTF-8"));
//		String line = null;
//		StringBuffer respBuf = new StringBuffer();
//		while((line = br.readLine()) != null){
//		    respBuf.append(line);
//		}
//		responseBody = respBuf.toString();
//		log_.debug("result:" + responseBody);
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :getFromHttp(String url : " + url + ",String encoding,int connectionTimeout,int readTimeout)" + e, e);
//	    throw e;
//	}finally{
//	    method.releaseConnection();
//	}
//	return responseBody;
//    }
//
//    public static String getMobileAdvertisementMAP(String url, String msisdn, String queryStr, String publisherId, String size, String userAgent, int timeout) throws IOException {
//	// http://192.168.13.152:8080/api/wap?blindid=905547462846&publisherId=1&size=170x30
//	userAgent = URLEncoder.encode(userAgent, "UTF-8");
//	url = url + "?blindid=" + msisdn + "&publisherId=" + publisherId + "&size=" + size + "&queryStr=" + queryStr;
//	log_.debug("MAP request url:" + url);
//	return getFromHttp(url);
//    }
//
//    /*
//     * public static String getMobileAdvertisementMAP(String url,String msisdn,String publisherId,String size,String userAgent,int timeout) throws Exception {
//     * // http://192.168.13.152:8080/api/wap?blindid=905547462846&publisherId=1&size=170x30
//     * userAgent = URLEncoder.encode(userAgent,"UTF-8");
//     * url=url+"?blindid="+msisdn+"&publisherId="+publisherId+"&size=" + size;
//     * MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//     * connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//     * connectionManager.getParams().setMaxTotalConnections(20);
//     * HttpClient client = new HttpClient(connectionManager);
//     * HostConfiguration config = new HostConfiguration();
//     * String proxy = "10.1.240.50"; //"pristgup1",
//     * int port = 8080;
//     * config.setProxy(proxy, port);
//     * client.setHostConfiguration(config);
//     * String responseBody="";
//     * GetMethod method = new GetMethod(url);
//     * method.addRequestHeader("user-agent", userAgent);
//     * method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//     * try {
//     * client.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
//     * client.getHttpConnectionManager().getParams().setSoTimeout(timeout);
//     * client.executeMethod(method);
//     * log_.debug("method.getStatusCode()"+method.getStatusCode());
//     * if (method.getStatusCode() == HttpStatus.SC_OK) {
//     * BufferedReader br =null;
//     * br = new BufferedReader(new InputStreamReader( method.getResponseBodyAsStream(),"UTF-8"));
//     * String line = null;
//     * StringBuffer respBuf = new StringBuffer();
//     * while ((line = br.readLine()) != null) {
//     * respBuf.append(line);
//     * }
//     * responseBody = respBuf.toString();
//     * log_.debug("result:"+responseBody);
//     * }
//     * }catch (Exception e) {
//     * log_.error("HTTPMultiThreaded :getFromHttp(String url : "+url+",String encoding,int connectionTimeout,int readTimeout)"+e,e);
//     * throw e;
//     * } finally {
//     * method.releaseConnection();
//     * }
//     * return responseBody;
//     * }
//     */
//    public static String postFromHttpWithParams(String url, NameValuePair[] nameValuePairs) throws Exception {
//	try{
//	    return postFromHttpWithParams(url, nameValuePairs, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT);
//	}catch(Exception e){
//	    log_.error(e.getMessage(), e);
//	    return postFromHttpWithParams(url, nameValuePairs, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT);
//	}
//    }
//
//    public static String postFromHttpWithParams(String url, NameValuePair[] nameValuePairs, int connectionTimeout, int readTimeout) throws Exception {
//	MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//	connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
//	connectionManager.getParams().setMaxTotalConnections(20);
//	HttpClient client = new HttpClient(connectionManager);
//	// DefaultMethodRetryHandler retry=new DefaultMethodRetryHandler();
//	// retry.setRetryCount(0);
//	client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
//	client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
//	String responseBody = "";
//	PostMethod method = new PostMethod(url);
//	// method.setMethodRetryHandler(retry);
//	method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
//	try{
//	    // method.setRequestEntity(new StringRequestEntity(XML));
//	    /*
//	     * NameValuePair action = new NameValuePair("action", "login");
//	     * NameValuePair url = new NameValuePair("url", "/index.html");
//	     * NameValuePair userid = new NameValuePair("UserId", "userid");
//	     * NameValuePair password = new NameValuePair("Password", "password");
//	     * new NameValuePair[] {action, url, userid, password}
//	     */
//	    method.setRequestBody(nameValuePairs);
//	    client.executeMethod(method);
//	    if(method.getStatusCode() == HttpStatus.SC_OK){
//		BufferedReader br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream()));
//		String line = null;
//		StringBuffer respBuf = new StringBuffer();
//		while((line = br.readLine()) != null){
//		    respBuf.append(line);
//		}
//		responseBody = respBuf.toString();
//		log_.debug("result:" + responseBody);
//	    }else{
//		analyzeHttpResponse(method.getStatusCode());
//	    }
//	}catch(Exception e){
//	    log_.error("HTTPMultiThreaded :postFromHttp(String url : " + url + ",String XML,int connectionTimeout,int readTimeout)" + e, e);
//	}finally{
//	    method.releaseConnection();
//	}
//	return responseBody;
//    }
//
//    public static void analyzeHttpResponse(int responseCode) throws Exception {
//	if(responseCode >= MPSConstants.HTTP_LIMIT_SUCCESS && responseCode < MPSConstants.HTTP_LIMIT_CLIENT_ERROR){
//	    throw new Exception();
//	}else if(responseCode >= MPSConstants.HTTP_LIMIT_CLIENT_ERROR){
//	    throw new Exception();
//	}
//    }
//}

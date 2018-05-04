package com.erbil.mps;



import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;



/**
 * @author 001153
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PaymentInfoParser extends DefaultHandler {
    
    HashMap map;
    private String rootNode;
    private String rootNodeSch;    
    private String rootNodeName;
    private String nodeMessageName;
    private String nodeDataName;
    private Document doc;
    String period;
    String debit;
    private String mainNode;
    private static PaymentInfoParser info;

    
    protected PaymentInfoParser() {
        map = new HashMap();
        mainNode = "IWIS_OUT_DATA_UNIT";
        rootNode = "IWIS_SERVICE_RETURN";
        rootNodeSch = "sch:PostpaidGetBillsProcessResponse";
        rootNodeName = "BILLINFO";
        period = "PAYMENTPERIOD";
        debit = "DEBIT";
        nodeMessageName = "MESSAGE";
        nodeDataName = "DATA";
    }
    
    public ArrayList getPayments(String xml) {
        Node root = null;
        ArrayList paymentList = new ArrayList();
        XMLParser parser = new XMLParser();
        
        try {
            //xml="<IWIS_OUT_DATA_UNIT><IWIS_OUT_HEADER version='1.0'><IWIS_RETURN_CODE>0</IWIS_RETURN_CODE><IWIS_DETAIL_CODE>0</IWIS_DETAIL_CODE><TID>12345678901234567890ABCD</TID></IWIS_OUT_HEADER><IWIS_SERVICE_RETURN><sch:PostpaidGetBillsProcessResponse><BPM_RESPONSE_HEADER><RETURNCODE>0</RETURNCODE><RETURNMESSAGE>Islem icin gerekli butun kontroller basari ile yapilmistir.</RETURNMESSAGE></BPM_RESPONSE_HEADER><STATUS>0</STATUS><STAN>154</STAN><NUMBEROFRECORDS>2</NUMBEROFRECORDS><BILLINFO><ACCESSTYPE>1</ACCESSTYPE><TELEPHONENUMBER>5051000222</TELEPHONENUMBER><CUSTOMERNUMBER>0206501</CUSTOMERNUMBER><NAME>OMER TASTEPE</NAME><BILLTYPE>0</BILLTYPE><PAYMENTPERIOD>200309</PAYMENTPERIOD><DUEDATE>20031022</DUEDATE><REFERENCENO>1607382610</REFERENCENO><BILLNO>2003090073826</BILLNO><BILLSEQNO>00</BILLSEQNO><DEBIT>10.600000</DEBIT></BILLINFO><BILLINFO><ACCESSTYPE>1</ACCESSTYPE><TELEPHONENUMBER>5051000222</TELEPHONENUMBER><CUSTOMERNUMBER>0206501</CUSTOMERNUMBER><NAME>OMER TASTEPE</NAME><BILLTYPE>0</BILLTYPE><PAYMENTPERIOD>200311</PAYMENTPERIOD><DUEDATE>20031223</DUEDATE><REFERENCENO>2156126710</REFERENCENO><BILLNO>2003110071260</BILLNO><BILLSEQNO>00</BILLSEQNO><DEBIT>10.700000</DEBIT></BILLINFO></sch:PostpaidGetBillsProcessResponse></IWIS_SERVICE_RETURN></IWIS_OUT_DATA_UNIT>";
            InputStream is=new ByteArrayInputStream(xml.getBytes());         
            doc = parser.parse("",is);        
            
            if (doc != null) {
                Node node;
                NodeList list;
                int numNodes;
                list = doc.getChildNodes();
                numNodes = list.getLength();

                for (int i = 0; i < numNodes; i++) {
                    node = list.item(i);
                    if (mainNode.equals(node.getNodeName())) //IWIS_OUT_DATA_UNIT
                    {
                        root = node;
                        break;
                    }
                } //end for

                if (root != null) {
                    NodeList subList;
                    int subNumNodes;
                    
                    subList = root.getChildNodes();
                    subNumNodes = subList.getLength();

                    for (int x = 0; x < subNumNodes; x++) {
                        Node nPaymentInfoDoc = subList.item(x);
                        
                        if (nPaymentInfoDoc.getNodeName().equals(rootNode)) {//IWIS_SERVICE_RETURN

                            NodeList endchildList = nPaymentInfoDoc.getChildNodes();
                            int endchildNumNodes = endchildList.getLength();
                            
                            for (int y = 0; y < endchildNumNodes; y++) {
		                        Node nPostpaidProcess = endchildList.item(y);
		                        if (nPostpaidProcess.getFirstChild() != null) {
		                            if (nPostpaidProcess.getNodeName().equals(rootNodeSch)) //sch:PostpaidGetBillsProcessResponse
                                    {
		                                NodeList endchildschList = nPostpaidProcess.getChildNodes();
		                                int endchildSchNumNodes = endchildschList.getLength();
		                                for (int z = 0; z < endchildSchNumNodes; z++) {
		                                    Node nBillInfo = endchildschList.item(z);
		    		                        if (nBillInfo.getFirstChild() != null) {
		    		                            if (nBillInfo.getNodeName().equals(rootNodeName)) //sch:PostpaidGetBillsProcessResponse BILLINFO
		                                        {
		    		                                NodeList nPaymentsChildList = nBillInfo.getChildNodes();
		    		                                
		    		                                Node accessType = nPaymentsChildList.item(0);
		    		                                Node phoneNumber = nPaymentsChildList.item(1);
		    		                                Node custNumber = nPaymentsChildList.item(2);
		    		                                Node name = nPaymentsChildList.item(3);
		    		                                Node billType = nPaymentsChildList.item(4);	
		    		                                Node period = nPaymentsChildList.item(5);
		    		                                Node dueDate = nPaymentsChildList.item(6);
		    		                                Node referenceNo = nPaymentsChildList.item(7);
		    		                                Node billNo = nPaymentsChildList.item(8);
		    		                                Node billSeqNo = nPaymentsChildList.item(9);
		    		                                Node debit = nPaymentsChildList.item(10);
		    		                                
		    		                                PaymentInfoVO paymentInfoVO = new PaymentInfoVO();
		    		                                paymentInfoVO.setAccessType(accessType.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setPhoneNumber(phoneNumber.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setCustNumber(custNumber.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setName(name.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillType(billType.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillPeriod(period.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setDueDate(dueDate.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setReferenceNo(referenceNo.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillNo(billNo.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillSeqNo(billSeqNo.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillAmount(debit.getFirstChild().getNodeValue());

		    		                                paymentList.add(paymentInfoVO);
		                                        }
		    		                        }//if (n2.getFirstChild() != null) {
		                                }
                                    }
		                        }//if (n2.getFirstChild() != null) {
		                    }
                        }//if (nPaymentInfoDoc.getNodeName().equals(rootNode))
                    }//for ( int x = 0; x < subNumNodes; x++)
                }//if ( root != null)
            }//if( doc != null) 
            //log_.debug("[PaymentInfoParser] processDoc ending successfully."); 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hata");
        }
        return paymentList;
    }
    
    public ArrayList getPaymentsForDeactiveLines(String xml) {
        Node root = null;
        ArrayList paymentList = new ArrayList();
        XMLParser parser = new XMLParser();
        
        try {
            //xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?><IWIS_OUT_DATA_UNIT><IWIS_OUT_HEADER version=\"1.0\"><IWIS_RETURN_CODE>0</IWIS_RETURN_CODE><IWIS_DETAIL_CODE>0</IWIS_DETAIL_CODE><TID>000000000000000585491564</TID></IWIS_OUT_HEADER><IWIS_SERVICE_RETURN><MESSAGE MT=\"0210\" PC=\"091\" VER=\"1.1\"><HEADER><RESPONSECODE>00</RESPONSECODE><STAN>469603</STAN><INSTITUTIONID>2714</INSTITUTIONID><ORIGINATORINFO><CITYID>034</CITYID><BRANCHID>AVEA</BRANCHID><TELLERID>AVEA</TELLERID><USERID>AVEA</USERID></ORIGINATORINFO><BILLERID>0555</BILLERID><CURRENCY>949</CURRENCY><OPERATIONSOURCE>46</OPERATIONSOURCE><TRANSACTIONDATE>20120324</TRANSACTIONDATE><TRANSACTIONTIME>000148</TRANSACTIONTIME></HEADER><DATA><SUN TYPE=\"1\" NUMBER=\"5078115312\" /><NOR>01</NOR><BILLINFO><ACCESSTYPE>1</ACCESSTYPE><TELEPHONENUMBER>5078115312</TELEPHONENUMBER><CUSTOMERNUMBER>B009253461</CUSTOMERNUMBER><NAME>RA****LA****</NAME><BILLTYPE>0</BILLTYPE><PAYMENTPERIOD>201202</PAYMENTPERIOD><DUEDATE>20120316</DUEDATE><REFERENCENO>3749312149</REFERENCENO><BILLNO>20120305664779</BILLNO><BILLSEQNO>00</BILLSEQNO><DEBIT>148.750000</DEBIT></BILLINFO></DATA></MESSAGE></IWIS_SERVICE_RETURN></IWIS_OUT_DATA_UNIT>";
            InputStream is=new ByteArrayInputStream(xml.getBytes());         
            doc = parser.parse("",is);        
            
            if (doc != null) {
                Node node;
                NodeList list;
                int numNodes;
                list = doc.getChildNodes();
                numNodes = list.getLength();

                for (int i = 0; i < numNodes; i++) {
                    node = list.item(i);
                    if (mainNode.equals(node.getNodeName())) //IWIS_OUT_DATA_UNIT
                    {
                        root = node;
                        break;
                    }
                } //end for

                if (root != null) {
                    NodeList subList;
                    int subNumNodes;
                    
                    subList = root.getChildNodes();
                    subNumNodes = subList.getLength();

                    for (int x = 0; x < subNumNodes; x++) {
                        Node nPaymentInfoDoc = subList.item(x);
                        
                        if (nPaymentInfoDoc.getNodeName().equals(rootNode)) {//IWIS_SERVICE_RETURN
                        	
                        	NodeList subList2 = nPaymentInfoDoc.getChildNodes();
                        	int subNumNodes2 = subList2.getLength();
                        	
                        	for (int w = 0; w < subNumNodes2; w++) {
                        		Node nodeMessage = subList2.item(w);
                        		
                        		if (nodeMessage.getNodeName().equals(nodeMessageName)) {//MESSAGE

                            NodeList endchildList = nodeMessage.getChildNodes();
                            int endchildNumNodes = endchildList.getLength();
                            
                            for (int y = 0; y < endchildNumNodes; y++) {
		                        Node nPostpaidProcess = endchildList.item(y);
		                        if (nPostpaidProcess.getFirstChild() != null) {
		                            if (nPostpaidProcess.getNodeName().equals(nodeDataName)) //DATA
                                    {
		                                NodeList endchildschList = nPostpaidProcess.getChildNodes();
		                                int endchildSchNumNodes = endchildschList.getLength();
		                                for (int z = 0; z < endchildSchNumNodes; z++) {
		                                    Node nBillInfo = endchildschList.item(z);
		    		                        if (nBillInfo.getFirstChild() != null) {
		    		                            if (nBillInfo.getNodeName().equals(rootNodeName)) //BILLINFO
		                                        {
		    		                                NodeList nPaymentsChildList = nBillInfo.getChildNodes();
		    		                                
		    		                                Node accessType = nPaymentsChildList.item(0);
		    		                                Node phoneNumber = nPaymentsChildList.item(1);
		    		                                Node custNumber = nPaymentsChildList.item(2);
		    		                                Node name = nPaymentsChildList.item(3);
		    		                                Node billType = nPaymentsChildList.item(4);	
		    		                                Node period = nPaymentsChildList.item(5);
		    		                                Node dueDate = nPaymentsChildList.item(6);
		    		                                Node referenceNo = nPaymentsChildList.item(7);
		    		                                Node billNo = nPaymentsChildList.item(8);
		    		                                Node billSeqNo = nPaymentsChildList.item(9);
		    		                                Node debit = nPaymentsChildList.item(10);
		    		                                
		    		                                PaymentInfoVO paymentInfoVO = new PaymentInfoVO();
		    		                                paymentInfoVO.setAccessType(accessType.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setPhoneNumber(phoneNumber.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setCustNumber(custNumber.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setName(name.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillType(billType.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillPeriod(period.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setDueDate(dueDate.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setReferenceNo(referenceNo.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillNo(billNo.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillSeqNo(billSeqNo.getFirstChild().getNodeValue());
		    		                                paymentInfoVO.setBillAmount(debit.getFirstChild().getNodeValue());

		    		                                paymentList.add(paymentInfoVO);
		                                        }
		    		                        }//if (n2.getFirstChild() != null) {
		                                }
                                    }
		                        }//if (n2.getFirstChild() != null) {
		                    }
                        		}}//buraya
                        }//if (nPaymentInfoDoc.getNodeName().equals(rootNode))
                    }//for ( int x = 0; x < subNumNodes; x++)
                }//if ( root != null)
            }//if( doc != null) 
            //log_.debug("[PaymentInfoParser] processDoc ending successfully."); 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hata");
        }
        return paymentList;
    }
    
    public static synchronized PaymentInfoParser getInstance() {
        if (info == null)
            info = new PaymentInfoParser();
        return info;
    }
    
    public static void main(String[] args) {
    	PaymentInfoParser p = getInstance();
    	p.getPayments("");
    }
}

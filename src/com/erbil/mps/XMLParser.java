package com.erbil.mps;



import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class XMLParser
{
	private final static org.slf4j.Logger log_ = LoggerFactory.getLogger(InfoBus.class);
	
	public class XMLSunErrorHandler implements ErrorHandler
	{
		public void error(SAXParseException e)
		{
			m_parserErrors++;
			//fireParserError(e.getMessage());
		}
		public void fatalError(SAXParseException e)
		{
			m_parserErrors++;
			//fireParserError(e.getMessage());
		}
		public void warning(SAXParseException e)
		{
			m_parserWarnings++;
			//fireParserWarning(e.getMessage());
		}
		public XMLSunErrorHandler()
		{
		}
	}
	public XMLParser()
	{
		m_parserErrors = 0;
		m_parserWarnings = 0;
	}
	public int getParserErrors()
	{
		return m_parserErrors;
	}
	public int getParserWarnings()
	{
		return m_parserWarnings;
	}
	public synchronized Document parse(String fileName, InputStream inputStream)
	{
		InputSource inputSource = new InputSource(inputStream);
		Document document = parse(inputSource);
		return document;
	}
	public synchronized Document parse(String fileName, Reader reader)
	{
		InputSource inputSource = new InputSource(reader);
		Document document = parse(inputSource);
		return document;
	}
	public Document parse(String fileName, String string)
	{
		return parse(fileName, ((Reader) (new StringReader(string))));
	}

	protected synchronized Document parse(InputSource inputSource)
	{
		DocumentBuilderFactory factory = null;
		DocumentBuilder docBuilder = null;
		try
		{
			factory = DocumentBuilderFactory.newInstance();
			//CREATE NEW DocumentBuilder from DocumentBuilderFactory
			docBuilder = factory.newDocumentBuilder();
			docBuilder.setErrorHandler(new XMLSunErrorHandler());
		}
		catch (ParserConfigurationException pce)
		{
			log_.debug("ParserConfiguarationException");
		}
		try
		{
			log_.debug("ABOUT TO BUILD DOCUMENT");
			Document document = docBuilder.parse(inputSource);
			if (document == null)
			{
				log_.debug("RETURNING NULL");
				return null;
			}
			log_.debug("RETURNING DOCUMENT");
			return document;
		}
		catch (SAXException se)
		{
			log_.error(se.getMessage(), se);
			return null;
		}
		catch (IOException se)
		{
			log_.error(se.getMessage(), se);
			return null;
		}
	}
	protected int m_parserErrors;
	protected int m_parserWarnings;
}

package com.madhav.saxparserexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserHandler extends DefaultHandler{

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		SAXParserFactory.newInstance().newSAXParser().parse(new File("D://employee.xml"), new SAXParserHandler());
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("document starts here");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("document ends here");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.print(new String(ch,start,length));
	}
}

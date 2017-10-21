package com.madhav.domparserexamples;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLFile {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("D://employee.xml");
		
		Element e =doc.getDocumentElement();
		System.out.println(e.getNodeType());
		System.out.println(e.getElementsByTagName("empNo").item(0).getNodeName());
		System.out.println(e.getElementsByTagName("name").item(0).getNodeName());
		System.out.println(e.getElementsByTagName("salary").item(0).getNodeName());
	}

}

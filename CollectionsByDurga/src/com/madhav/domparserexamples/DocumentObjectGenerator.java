package com.madhav.domparserexamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DocumentObjectGenerator {

	public static void main(String...args) throws ParserConfigurationException, TransformerFactoryConfigurationError, FileNotFoundException, TransformerException {
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		
		Element e1 = doc.createElement("employee");
		Element e2 = doc.createElement("empNo");
		Element e3 = doc.createElement("name");
		Element e4 = doc.createElement("salary");
		
		e2.appendChild(doc.createTextNode("101"));
		e3.appendChild(doc.createTextNode("madhav"));
		e4.appendChild(doc.createTextNode("40000"));
		
		e1.appendChild(e2);
		e1.appendChild(e3);
		e1.appendChild(e4);
		
		doc.appendChild(e1);
		
		Transformer t =TransformerFactory.newInstance().newTransformer();
		t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("D://employee.xml")));
		System.out.println("XML file generated !!!");
	}
}

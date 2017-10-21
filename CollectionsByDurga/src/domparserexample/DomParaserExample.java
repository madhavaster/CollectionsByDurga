package domparserexample;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParaserExample {
	
	public static void main(String...args) {
	try {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("C://Users/User/git/CollectionsByDurga/CollectionsByDurga/src/employee.xml"));
		Element element = document.getDocumentElement();
		System.out.println(element.getNodeName());
		NodeList nodeList = element.getChildNodes();
		for(int i=0;i<nodeList.getLength();i++) {
			Node node = nodeList.item(i);
			System.out.println(node.getNodeName()+"-----"+node.getTextContent());
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
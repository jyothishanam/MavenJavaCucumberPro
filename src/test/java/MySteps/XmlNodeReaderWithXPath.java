package MySteps;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlNodeReaderWithXPath {
	
	private static NamespaceContext toNsContext(final Map<String,String> ns){
		  NamespaceContext ctx=new NamespaceContext(){
		    public String getNamespaceURI(    String prefix){
		      String u=ns.get(prefix);
		      if (null == u) {
		        return XMLConstants.NULL_NS_URI;
		      }
		      return u;
		    }
		    public String getPrefix(    String namespaceURI){
		      for (      String k : ns.keySet()) {
		        if (ns.get(k).equals(namespaceURI)) {
		          return k;
		        }
		      }
		      return null;
		    }
		    public Iterator<String> getPrefixes(    String namespaceURI){
		      return null;
		    }
		  }
		;
		  return ctx;
		}

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {

		ArrayList<String> bookNames = new ArrayList<String>();
		 
		//Parse XML file
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new FileInputStream(new File("C:\\Users\\yogendar\\workspace-jyothi\\com.CucumberProject.MavenProject\\src\\test\\java\\MySteps\\XMLWithNameSample.xml")));
		 
		//Get XPath expression
		XPathFactory xpathfactory = XPathFactory.newInstance();
		XPath xpath = xpathfactory.newXPath();
		xpath.setNamespaceContext(new XMLNamespaceResolver(doc));
		XPathExpression expr = xpath.compile("//ns2:bookStore/ns2:book/ns2:name/text()");
		 
		//Search XPath expression
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		 
		//Iterate over results and fetch book names
		NodeList nodes = (NodeList) result;
		for (int i = 0; i < nodes.getLength(); i++) {
		    bookNames.add(nodes.item(i).getNodeValue());
		}
		 
		//Verify book names
		System.out.println(bookNames);
	

}
}

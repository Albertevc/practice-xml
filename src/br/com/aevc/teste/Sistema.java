package br.com.aevc.teste;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Sistema {
	public static void main(String[] args) throws XPathExpressionException {
		String xpath = "/venda/produtos/produto[2]";
		XPath path = XPathFactory.newInstance().newXPath();
		XPathExpression expression = path.compile(xpath);
		InputSource document = null;
		NodeList produtos = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
	}
}

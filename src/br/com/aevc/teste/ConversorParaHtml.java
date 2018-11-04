package br.com.aevc.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class ConversorParaHtml {
	public static void main(String[] args) throws FileNotFoundException, TransformerFactoryConfigurationError, TransformerException {
		InputStream xsl = new FileInputStream("src/xmlParaHtml.xsl");
		StreamSource xslSource = new StreamSource(xsl);
		InputStream dados = new FileInputStream("src/vendas.xml");
		
		Transformer transformer = TransformerFactory.newInstance().newTransformer(xslSource);
		StreamSource xmlSource = new StreamSource(dados);
		
		StreamResult saida = new StreamResult("src/vendas.html");
		transformer.transform(xmlSource , saida);
		System.out.println("Conversão Cconcluída");
	}
}

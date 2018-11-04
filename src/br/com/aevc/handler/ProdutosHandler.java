package br.com.aevc.handler;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import br.com.aevc.teste.Produto;

public class ProdutosHandler extends DefaultHandler {
	private List<Produto> produtos = new ArrayList<>();
	private StringBuilder conteudo = new StringBuilder();
	private Produto produto;
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println(qName);
		if(qName.equals("produtos")) {
			produto = new Produto();
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		conteudo.append(new String(ch, start, length));
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("produtos")) {
			produtos.add(produto);
		}
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	

}

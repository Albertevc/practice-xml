package br.com.aevc.teste;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import br.com.aevc.model.Venda;

public class MapeiaXml {
	public static void main(String[] args) {
		JAXBContext jaxbContext = JAXBContext.newInstance(Venda.class);
		
		xmlParaObjeto(jaxbContext);
		objetoParaXml();
	}
	
	private static void xmlParaObjeto(JAXBContext jaxbContext) {
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		Venda venda = (Venda) unmarshaller.unmarshal(new File("src/vendas.xml"));
		
		System.out.println(venda);
	}
	
	private static void objetoParaXml(JAXBContext jaxbContext) {
		Marshaller marshaller = jaxbContext.CreateMarshaller();
		Venda venda = new Venda();
		venda.setFormaDePagamento("Crediário");
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Java", 59.9));
		
		StringWriter writer = new StringWriter();
		
		marshaller.marshal(venda, new Produto("Java", 59.9));
		
		System.out.println(writer.toString());
	}
}

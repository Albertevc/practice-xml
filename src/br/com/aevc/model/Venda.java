package br.com.aevc.model;

import java.util.List;

import br.com.aevc.teste.Produto;

@XmlRootElemet
@XMLAcessorType(XMLAccessType.FIELD)
public class Venda {
	private String formaDePagamento;
	
	@XmlElementWrapper(name="produtos")
	@XMLElement(name="produto")
	private List<Produto> produtos;
	
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}

package modelo;

import java.util.Calendar;

public abstract class Veiculo {

	private int anoFabricacao;
	private String fabricante;
	private Calendar dataEmplacamento;
	private Proprietario proprietario;
		
	public abstract Combustivel getCombustivel();
	public abstract int getQuantidadeRodas();
	public abstract String imprimirTipo();
	
	protected final String adicionarCabecalho(){
		return "#" + this.getClass() + "#";
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Calendar getDataEmplacamento() {
		return dataEmplacamento;
	}
	public void setDataEmplacamento(Calendar dataEmplacamento) {
		this.dataEmplacamento = dataEmplacamento;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	

}

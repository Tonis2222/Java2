package modelo;

import javax.lang.model.element.QualifiedNameable;

public class Reboque implements ITributavel{
	private int qtdRodas;
	private float durabilidadePneus;
	private int anoFabricacao;
	private String fabricante;

	public Reboque(int qtdRodas, float durabilidadePneus, int anoFabricacao, String fabricante) {
		super();
		this.qtdRodas = qtdRodas;
		this.durabilidadePneus = durabilidadePneus;
		this.anoFabricacao = anoFabricacao;
		this.fabricante = fabricante;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public float getDurabilidadePneus() {
		return durabilidadePneus;
	}

	public void setDurabilidadePneus(float durabilidadePneus) {
		this.durabilidadePneus = durabilidadePneus;
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

	@Override
	public float getValorImposto() {
		
		return qtdRodas * Constantes.VALOR_IMPOSTO_RODA_REBOQUE;
	}

}

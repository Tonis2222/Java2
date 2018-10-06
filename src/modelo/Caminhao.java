package modelo;

import java.util.List;

public class Caminhao extends Veiculo implements ITributavel {

	private int quantidadeRodasCabine;

	private List<Reboque> reboques;
	private float capacidadeTanque;
	private float peso;

	public List<Reboque> getReboques() {
		return reboques;
	}

	public void setReboques(List<Reboque> reboques) {
		this.reboques = reboques;
	}

	@Override
	public Combustivel getCombustivel() {
		return Combustivel.Diesel;
	}

	@Override
	public int getQuantidadeRodas() {
		return calcularTotalRodas();
	}

	public int getQuantidadeRodasCabine() {
		return quantidadeRodasCabine;
	}

	public void setQuantidadeRodasCabine(int quantidadeRodasCabine) {
		this.quantidadeRodasCabine = quantidadeRodasCabine;
	}

	private int calcularTotalRodas() {
		int acumulador = 0;
		acumulador += quantidadeRodasCabine;
		for (int i = 0; i < reboques.size(); i++) {
			acumulador += reboques.get(i).getQtdRodas();
		}
		return acumulador;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	@Override
	public String imprimirTipo() {
		String retorno = adicionarCabecalho();
		retorno += " Caminhão com " + reboques.size() + " reboques.";
		return retorno;
	}

	@Override
	public float getValorImposto() {
		float valorTotalImposto = 0;

		valorTotalImposto += quantidadeRodasCabine * Constantes.VALOR_IMPOSTO_RODA_PADRAO;

		for (int i = 0; i < reboques.size(); i++) {
			valorTotalImposto += reboques.get(i).getValorImposto();
		}

		return valorTotalImposto;
	}
}

package modelo;

public class Carro extends Veiculo{
	
	public Carro(Combustivel combustivel) {
		super();
		this.combustivel = combustivel;
	}

	private Combustivel combustivel;	
	private float potencia;
	private float torque;
	private boolean possuiArCondicionado;
	
	@Override
	public Combustivel getCombustivel() {
		return combustivel;
	}

	@Override
	public int getQuantidadeRodas() {
		return Constantes.QUANTIDADE_RODAS_CARRO;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getTorque() {
		return torque;
	}

	public void setTorque(float torque) {
		this.torque = torque;
	}

	public boolean isPossuiArCondicionado() {
		return possuiArCondicionado;
	}

	public void setPossuiArCondicionado(boolean possuiArCondicionado) {
		this.possuiArCondicionado = possuiArCondicionado;
	}

	@Override
	public String imprimirTipo() {
		String retorno = adicionarCabecalho();
		retorno += " Carro com " + potencia + " cavalos.";
		return retorno;
	}

}

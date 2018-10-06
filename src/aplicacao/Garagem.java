package aplicacao;

import java.util.Vector;
import modelo.Veiculo;;

public class Garagem {
	private static Vector<Veiculo> automoveis;

	public Vector<Veiculo> getCaminhoes() {
		Vector<Veiculo> retorno = new Vector<Veiculo>();

		for (int i = 0; i < automoveis.size(); i++) {
			if (automoveis.get(i).getClass() == modelo.Caminhao.class) {
				retorno.addElement(automoveis.get(i));
			}
		}

		return retorno;
	}

	public void addCaminhao(modelo.Caminhao caminhao) {
		automoveis.addElement(caminhao);
	}

	public float calcularTotalImposto() {
		float total = 0;
		for (int i = 0; i < automoveis.size(); i++) {
			if (automoveis.get(i) instanceof modelo.ITributavel) {
				total += ((modelo.ITributavel) automoveis.get(i)).getValorImposto();
			}
		}
		return total;
	}

}

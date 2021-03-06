package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import modelo.Caminhao;
import modelo.Carro;
import modelo.Proprietario;
import modelo.Reboque;
import modelo.Veiculo;

public class AutomovelTest {

	@Test
	public void testaCarro() {

		modelo.Proprietario proprietario = new Proprietario();
		proprietario.setCpf("123.456.789-01");

		modelo.Carro carro = new Carro(modelo.Combustivel.Flex);
		carro.setAnoFabricacao(2018);
		carro.setDataEmplacamento(Calendar.getInstance());
		carro.setFabricante("Fiat");
		carro.setPossuiArCondicionado(true);
		carro.setPotencia(88);
		carro.setTorque(11);
		carro.setProprietario(proprietario);

		modelo.Reboque reboque1 = new Reboque(8, (float) .75, 2010, "Scania");
		modelo.Reboque reboque2 = new Reboque(6, (float) .45, 2007, "Scania");

		List<modelo.Reboque> reboques = new ArrayList<modelo.Reboque>();
		reboques.add(reboque1);
		reboques.add(reboque2);

		modelo.Caminhao caminhao = new Caminhao();
		caminhao.setAnoFabricacao(2018);
		caminhao.setDataEmplacamento(Calendar.getInstance());
		caminhao.setFabricante("Mercedes");
		caminhao.setCapacidadeTanque(800);
		caminhao.setPeso(4355);
		caminhao.setQuantidadeRodasCabine(6);
		caminhao.setProprietario(proprietario);
		caminhao.setReboques(reboques);

		List<modelo.Veiculo> veiculos = new ArrayList<modelo.Veiculo>();
		veiculos.add(carro);
		veiculos.add(caminhao);

		proprietario.setVeiculos(veiculos);

		System.out.println("CPF: " + proprietario.getCpf());
		System.out.println("Total veiculos: " + proprietario.getVeiculos().size());
		for (int i = 0; i < proprietario.getVeiculos().size(); i++) {
			System.out.println("Tipo: " + proprietario.getVeiculos().get(i).imprimirTipo());
		}
		
		assertTrue(proprietario.getVeiculos().size() == 2);

	}

}

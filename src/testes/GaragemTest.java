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

public class GaragemTest {

	@Test
	public void garagemTest() {

		modelo.Proprietario proprietario = new Proprietario();
		proprietario.setCpf("123.456.789-01");

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
		veiculos.add(caminhao);

		proprietario.setVeiculos(veiculos);
		aplicacao.Garagem g = new aplicacao.Garagem();
		g.addCaminhao(caminhao);
		
		assertTrue(g.calcularTotalImposto() == (float) 1306.9199);

	}

}

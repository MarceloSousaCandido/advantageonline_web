package steps;

import static utils.Utils.driver;

import java.util.List;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.GestorPage;

public class GestorSteps {
	
	GestorPage g = new GestorPage(driver);
	
	@Dado("que o usuario acione o botao adicionar")
	public void queOUsuarioAcioneOBotaoAdicionar() throws Exception {
		g.incluirItem();
	}

	@Quando("selecionar o tipo de transacao {string}")
	public void selecionarOTipoDeTransacao(String string) throws Exception {
		g.visualizandoPassoAPasso();
	}

	@Quando("informar o valor de {string}")
	public void informarOValorDe(String string) throws Exception {
		g.adicionarValorItem(string);
	}

	@Quando("informar a categoria {string}")
	public void informarACategoria(String string) throws Exception {
		g.adicionarCategoria(string);
	}

	@Quando("informar a data de {string}")
	public void informarADataDe(String string) throws Exception {
		g.selecionarData(string);
	}

	@Quando("clicar no botao {string}")
	public void clicarNoBotao(String string) throws Exception {
		g.adicionarItem();
	}

	@Entao("o app adiciona uma nova despesa com as informacoes:")
	public void oAppAdicionaUmaNovaDespesaComAsInformacoes(List<String> dados) {
		g.validarInformacoes(dados);
	}

}

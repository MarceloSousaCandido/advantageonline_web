package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GestorPage {
	
	public GestorPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Continuar sem criar uma conta")
	private MobileElement botaoContinuarSemConta;
	
	@AndroidFindBy(accessibility = "Começar")
	private MobileElement botaoComecar;
	
	@AndroidFindBy(accessibility = "Próximo")
	private MobileElement botaoProximo;
	
	@AndroidFindBy(accessibility = "Próximo")
	private MobileElement botaoProximo2;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
	private MobileElement botaoAddItem;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Selecionar o tipo de transação')]")
	private MobileElement passo1;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Insira o valor')]")
	private MobileElement passo2;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Selecione a moeda da transação')]")
	private MobileElement passo3;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Especificar conta')]")
	private MobileElement passo4;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Selecionar um ícona para a categoria')]")
	private MobileElement passo5;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Caso necessário, adicione uma categoria')]")
	private MobileElement passo6;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Selecione uma data')]")
	private MobileElement passo7;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Adicionar comentário')]")
	private MobileElement passo8;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Você pode adicionar uma foto')]")
	private MobileElement passo9;


	@AndroidFindBy(xpath = "//android.widget.EditText")
	private MobileElement botaoAdicionarValor;

	@AndroidFindBy(accessibility = "Compras de mercado")
	private MobileElement botaoCategoria;

	@AndroidFindBy(accessibility = "hoje")
	private MobileElement botaoSelecionarData;

	@AndroidFindBy(accessibility = "adicionar")
	private MobileElement botaoAdicionar;

	public void incluirItem() throws Exception {
		botaoContinuarSemConta.click();
		botaoComecar.click();
		botaoProximo.click();
		botaoProximo2.click();
		System.out.println("Incluindo Item");
		botaoAddItem.click();
	}
	
	public void adicionarTipoItem(String tipo) {
		MobileElement botaoTipoItem = (MobileElement) driver.findElement(MobileBy.AccessibilityId(tipo));
		System.out.println("Adicionando Tipo do Item");
		botaoTipoItem.click();
	}
	
	public void visualizandoPassoAPasso() {
		System.out.println("Pulando Passos");
		passo1.click();
		passo2.click();
		passo3.click();
		passo4.click();
	}

	public void adicionarValorItem(String valor) throws Exception {
		MobileElement clickValor = (MobileElement) driver.findElement(MobileBy.AccessibilityId(valor));
		clickValor.click();
		System.out.println("Adicionando Valor ao Item");
		clickValor.sendKeys(valor);
	}

	public void adicionarCategoria(String categoria) throws Exception {
		System.out.println("Clicando na Categoria de Compra");
		botaoCategoria.click();
	}

	public void selecionarData(String data) throws Exception {
		System.out.println("Escolhendo a Data");
		botaoSelecionarData.click();
	}
	
	public void adicionarItem() throws Exception {
		System.out.println("Escolhendo a Data");
		botaoAdicionar.click();
	}
	
	public void validarInformacoes(List<String> dados) {
		
		MobileElement infos;
		
		for (String info : dados) {
			
			infos = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='"+info+"']"));
			System.out.println("Infos Tela: " + infos.getText());
			assertEquals(info, infos.getText());
		}
	}
}

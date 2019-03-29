package Teste;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Page.cadastrarUsuario;
import Suporte.Generator;
import Suporte.screenShot;
import Suporte.web;
import suporte.Screenshot;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "testeBompracredito.csv")
	public class testeBompracredito {
		
		private WebDriver navegador; 
		
		@Before
		public void setUp() {
		navegador= web.creatChrome();
		}
		
		@Test
		public void cadastrarProposta(
				@Param(name="valor")String valor,
				@Param(name="nome")String nome,
				@Param(name="email")String email,
				@Param(name="cpf")String cpf,
				@Param(name="dataNascimento")String dataNascimento,				
				@Param(name="renda")String renda,
				@Param(name="tipoprofissao")String tipoprofissao,
				@Param(name="profissao")String profissao,
				@Param(name="grauinstrucao")String grauinstrucao,
				@Param(name="conta")String conta,
				@Param(name="cep")String cep,
				@Param(name="numero")String numero,
				@Param(name="complemento")String complemento,
				@Param(name="cel")String cel,
				@Param(name="fonecomercial")String fonecomercial,
				@Param(name="objemprestimo")String objemprestimo) throws Exception
		{
			new cadastrarUsuario(navegador)
			.informeOutroValor()
			.informeValor(valor)
			.informePrazo()
			.informeNome(nome)
			.informeEmail(email)
			//.informeConcordo()
			.clickContinuar()
			.informeCpf(cpf)
			.informeDatadeNascimento(dataNascimento)
			.informeRenda(renda)
			.informeSexo()
			.informeEstadoCivil()
			.informeOcupacao(tipoprofissao)
			.informeProfissao(profissao)
			.informeGraudeInstrucao(grauinstrucao)
			.informeConta(conta)
			.informePossuiChequeS()
			.informePossuiAutoS()
			.informePossuiImovelS()
			.informePossuiRestricaoS()	
			.selecioneContinuar()
			.informeCep(cep)
			.informeNumero(numero)
			.informeComplemento(complemento)
			.informeCel(cel)
			.informeFoneComercial(fonecomercial)
			.informeObejetivoEmprestimo(objemprestimo)
			//.selecioneAceite()
			.selecioneAceiteWzp()
			.selecioneContinuarEnd();
			Thread.sleep(1000);
			 navegador.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS); 
			 navegador.findElement(By.className("filled-register")).click();
			   WebElement cadastroprrenchido = navegador.findElement(By.className("filled-register"));
			   String validaMsg = cadastroprrenchido.getText();
			   assertEquals(validaMsg, "Cadastro preenchido",validaMsg);
			   Thread.sleep(5000);
			   screenShot.tirar(navegador, "C:/Users/emoisess/eclipse-workspace/bomPracredito/test-reports/"+ Generator.dataHoraparaArq()+ "cadastraproposta.png");
			    Thread.sleep(2000);
							 
		}
			
			@After
			public void EncerrarApp() {
				navegador.quit();
				
			}
			

	}
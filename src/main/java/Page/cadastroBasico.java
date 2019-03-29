package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class cadastroBasico {
	private WebDriver navegador;
	public cadastroBasico (WebDriver navegador) {
		this.navegador = navegador;	
}
	
public cadastroBasico informeCpf (String cpf) {
		
		navegador.findElement(By.id("borrower.cpf")).sendKeys(cpf);
		
		return this;
	
}

public cadastroBasico informeDatadeNascimento (String dataNascimento) {
	
	navegador.findElement(By.id("borrower.dateOfBirth")).sendKeys(dataNascimento);
	
	return this;

}

public cadastroBasico informeRenda (String renda) {
	
	navegador.findElement(By.id("borrower.monthlyGrossIncome")).sendKeys(renda);
	
	return this;

}

public cadastroBasico informeSexo () {
	
	navegador.findElement(By.id("borrower.gender")).click();
	
	return this;

}
public cadastroBasico informeEstadoCivil () {
	
	navegador.findElement(By.id("borrower.maritalStatus")).click();
	
	return this;

}


public cadastroBasico informeOcupacao (String tipoprofissao) throws Exception {
	WebElement comboTipoprofissao = navegador.findElement(By.id("borrower.jobType"));
	new Select(comboTipoprofissao).selectByVisibleText(tipoprofissao.toString().trim());
	Thread.sleep(5000);
	return this;

}
public cadastroBasico informeProfissao (String profissao) throws Exception {
	WebElement comboprofissao = navegador.findElement(By.id("borrower.profession"));
	new Select(comboprofissao).selectByVisibleText(profissao.toString().trim());
	Thread.sleep(5000);
	return this;
	
}
public cadastroBasico informeGraudeInstrucao (String graudeestrucao) throws Exception {
     navegador.findElement(By.id("borrower.educationLevel")).click();;
	WebElement combograudeestrucao = navegador.findElement(By.id("borrower.educationLevel"));
	new Select(combograudeestrucao).selectByVisibleText(graudeestrucao.toString().trim());
	Thread.sleep(5000);
	return this;
}

	public cadastroBasico informeConta (String conta) throws Exception {
		navegador.findElement(By.id("borrower.bankingData.bankNumber")).click();
		WebElement comboConta = navegador.findElement(By.id("borrower.bankingData.bankNumber"));
		new Select(comboConta).selectByVisibleText(conta.toString().trim());		
		navegador.findElement(By.id("borrower.bankingData.bankNumber")).sendKeys(conta);
		Thread.sleep(5000);
		return this;

	
	}
	
	public cadastroBasico informePossuiChequeS () {
		
		navegador.findElement(By.id("borrower.bankingData.hasCheckbook")).click();
		
		return this;

	
	}
	
	public cadastroBasico informePossuiRestricaoS () {
		
		navegador.findElement(By.id("borrower.hasNegativeCreditRecord")).click();
		
		return this;

	
	}

	public cadastroBasico informePossuiImovelS () {
		
		navegador.findElement(By.id("hasProperty")).click();
		
		return this;

	
	}
	
	public cadastroBasico informePossuiAutoS () {
		
		navegador.findElement(By.id("hasVehicle2")).click();
		
		return this;
	
	}
	
	public cadastroEndereco selecioneContinuar () throws Exception {

		
		navegador.findElement(By.id("button-borrower-info")).click();
		Thread.sleep(5000);
		return new cadastroEndereco(navegador);
	
	}

}

package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class cadastroEndereco {
	private WebDriver navegador;
	public cadastroEndereco (WebDriver navegador) {
		this.navegador = navegador;	
}
	
public cadastroEndereco informeCep (String cep) throws Exception {
		
		navegador.findElement(By.id("homeAddress.cep")).sendKeys(cep);
		Thread.sleep(5000);
		return this;
}
	
public cadastroEndereco informeNumero (String numero) {
	
	navegador.findElement(By.id("homeAddress.number")).sendKeys(numero);
	
	return this;
}

public cadastroEndereco informeComplemento (String complemento) {
	
	navegador.findElement(By.id("homeAddress.additionalData")).sendKeys(complemento);
	
	return this;	
}	

public cadastroEndereco informeCel (String cel) {
	navegador.findElement(By.id("mobilePhone")).click();
	navegador.findElement(By.id("mobilePhone")).sendKeys(cel);
	
	return this;	
}	
	
public cadastroEndereco informeFoneComercial (String fonecomercial) {
	navegador.findElement(By.id("homePhone")).click();
	navegador.findElement(By.id("homePhone")).sendKeys(fonecomercial);
	
	return this;	
}	
	
	
public cadastroEndereco informeObejetivoEmprestimo (String objemprestimo) {
	WebElement comboConta = navegador.findElement(By.id("loanObjective"));
	new Select(comboConta).selectByVisibleText(objemprestimo.toString().trim());	
	
	

	return this;	
}	
		
	
public cadastroEndereco selecioneAceite () {
	
	navegador.findElement(By.id("agree")).click();
	
	return this;	
}	
public cadastroEndereco selecioneAceiteWzp () {
	
	navegador.findElement(By.id("agreeWhatsApp")).click();
	
	return this;	
}		
public cadastroEndereco selecioneContinuarEnd () throws Exception {
	
	navegador.findElement(By.id("button-borrower-info")).click();
	Thread.sleep(5000);
	return this;	
}		
	

	
}

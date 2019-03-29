package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class cadastrarUsuario {
	private WebDriver navegador;
	public cadastrarUsuario (WebDriver navegador) {
		this.navegador = navegador;	
}

	public cadastrarUsuario informeOutroValor () {
		
		navegador.findElement(By.id("btnOtherValue")).click();
		
		return this;
	}
	
public cadastrarUsuario informeValor (String valor) {
		
		navegador.findElement(By.id("amount")).sendKeys(valor);
		
		return this;
	}

public cadastrarUsuario informePrazo () {
	
	navegador.findElement(By.id("btnNineTerm")).click();
	
	return this;	

}
public cadastrarUsuario informeNome (String nome) {
	
	navegador.findElement(By.id("name")).sendKeys(nome);
	
	return this;	
	
}
	
public cadastrarUsuario informeEmail (String email) {
	
	navegador.findElement(By.id("email")).sendKeys(email);
	navegador.findElement(By.id("email")).sendKeys(Keys.TAB);
	
	return this;	
}
public cadastrarUsuario informeConcordo () {
	
	navegador.findElement(By.id("optin")).click();
	
	return this;	
	


}

public cadastroBasico clickContinuar () throws Exception {
	
	navegador.findElement(By.id("btnContinue")).click();
	Thread.sleep(5000);
	
	return new cadastroBasico(navegador);	
}
}

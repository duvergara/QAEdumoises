package Suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
	

		public static WebDriver creatChrome() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\emoisess\\eclipse-workspace\\bomPracredito\\driver\\chromedriver.exe");
			WebDriver navegador = new ChromeDriver();
			navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			navegador.manage().window().maximize();
			//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--start-maximized");
	        //navegador = new ChromeDriver(chromeOptions);
			
					
			//Navegando para a página 
			navegador.get("https://demo.bompracredito.com.br/emprestimo-pessoal/");	
			
			return navegador;
			
		}

	}




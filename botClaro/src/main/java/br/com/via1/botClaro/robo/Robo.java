package br.com.via1.botClaro.robo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robo {

	// ChromeDriver driver;
	// https://contaonline.claro.com.br/webbow/login/initPJ_oqe.do
	// ChromeOptions options = new ChromeOptions().addArguments("--headless");
	// options.addArguments("--headless");
	// WebDriver driver = new ChromeDriver(options);

	ChromeDriver driver;

	public void login() throws InterruptedException {
		System.out.println("teste");

		WebDriverManager.chromedriver().setup();
		// Criar o driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://contaonline.claro.com.br");
		Thread.sleep(2000);
		driver.findElement(By.name("userVO.loginCode")).sendKeys("");
		driver.findElement(By.name("userVO.password")).sendKeys("");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[3]/input")).click();
		// driver.get("https://contaonline.claro.com.br");
		// WebDriverManager.chromedriver().setup();
		//

		// driver.findElement(By.name("")).sendKeys("");

		// System.setProperty("webdriver.chrome.driver","D:\List_of_Jar\chromedriver.exe");
		// WebDriver wd =new ChromeDriver();
		// String baseUrl = "https://www.google.com";
		// wd.get(baseUrl);"
	}
}

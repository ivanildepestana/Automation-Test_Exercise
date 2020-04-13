
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CampoTreinamento {
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "//home/ivanilde/Automation Environment/Driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		//driver.quit();

}
	
	@Test
	public void deveIntegarirField(){
		System.setProperty("webdriver.gecko.driver", "//home/ivanilde/Automation Environment/Driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Isadora");
		Assert.assertEquals("Isadora", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		
		//driver.quit();
	}
	
	@Test
	public void deveIntegarirComTextArea(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("teste\n\naasldjdlks\nUltima linha");
		Assert.assertEquals("teste\n\naasldjdlks\nUltima linha", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		
		
		driver.quit();
	}
	
	@Test
	public void deveIntegarirComRadioButton(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		driver.quit();
	}
	
	@Test
	public void deveIntegarirComCheckbox(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
		driver.quit();
	}
	
	@Test
	public void deveIntegarirComCheckbox1(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		org.openqa.selenium.support.ui.Select combo = new org.openqa.selenium.support.ui.Select(element);
		combo.selectByIndex(2);
		combo.selectByValue("superior");
		combo.selectByVisibleText("2o grau completo");
		
	Assert.assertEquals("2o grau completo",combo.getFirstSelectedOption().getText());
	//	driver.quit(
}
	
	
	
	@Test
		public void deveIntegarirComButton(){
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().setSize(new Dimension(1200, 765));
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			driver.findElement(By.id("buttonSimple")).click();

}
}



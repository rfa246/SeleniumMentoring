package Common;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utilities  {
  public WebDriver driver;
  @Parameters({"browser","website"})
  
  @BeforeClass
 
	  public void Ibrowsers(String NameofBrowser , String wb) {
	  if(NameofBrowser.equals("Chrome")) {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get(wb);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }else if(NameofBrowser.equals("Edge")) {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get(wb);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
	  }
		  
		  
	  }
  

  @AfterClass
  public void afterClass() {
	 
  }
  public void ScreenShot() throws IOException {
	  String jk = System.getProperty("user.dir");
	  System.out.println(jk);
	  File pages= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(pages,new File(jk+"\\pictures\\"+jk+"Home1.jpg"));
  }

}

package Demo.SeleniumMentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
@FindBy(id = "twotabsearchtextbox")WebElement sreach;
@FindBy(id= "nav-search-submit-button")WebElement sreachicon;

public void Sreach() {
	sreach.sendKeys("Iphones");
}
public void Srechbox() {
	sreachicon.click();
}
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}

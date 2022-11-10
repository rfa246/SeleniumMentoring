package Demo.SeleniumMentoring;

import org.testng.annotations.Test;

import Common.Utilities;

public class AmazonTest extends Utilities{
  @Test
  public void f() {
	  Home home = new Home(driver);
	  home.Sreach();
	  home.Srechbox();
  }
}

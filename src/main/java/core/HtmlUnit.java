package core;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnit {

	public static void main(String[] args) {
		
		String url = "http://facebook.com";
		String userAgent = "Mozilla/5.0 (iPhone; CPU OS 10_1_1 like Mac OS X) AppleWebKit/602.2.14 "
				+ "(KHTML, like Gecko) Version/10.0 Mobile/14B100 Safari/602.1";
		WebDriver driver = new HtmlUnitDriver();
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(userAgent);
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		Logger l = Logger.getLogger("");
		l.setLevel(Level.OFF);
		driver.get(url);
		Object output = ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");
		System.out.println(output.toString());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}

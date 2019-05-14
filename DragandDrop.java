package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pooji\\Desktop\\TESTING TUTORIAL\\Selenium Eclipse\\Drivers\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("http://jqueryui.com/droppable/");
		 d.findElements(By.tagName("iframe")).size();
		 
		 d.switchTo().frame(d.findElement(By.cssSelector("iframe[class='demo-frame']")));
		 //d.findElement(By.id("draggable")).click();
		 Actions a=new Actions(d);
		 WebElement source=d.findElement(By.id("draggable"));
		 WebElement target=d.findElement(By.id("droppable"));
		 a.dragAndDrop(source, target).build().perform();
		 //To bring the default window we need to switch from iframes as shown below
		 d.switchTo().defaultContent();
	}

}

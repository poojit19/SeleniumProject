package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pooji\\Desktop\\TESTING TUTORIAL\\Selenium Eclipse\\Drivers\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("https://www.spicejet.com/");
		 d.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		 System.out.println(d.findElements(By.xpath("//input[@type='checkbox']")).size());
		 System.out.println(d.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	}

}
this is for my knowledge

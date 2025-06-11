package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_DomainLibrary
{
    //Greyy Technologies UI locators
    @FindBy(xpath = "//*[@id=\"menu\"]/ul/li[1]/a")
    public static WebElement homeTab;
    @FindBy(xpath = "//*[@id=\"menu\"]/ul/li[3]/a")
    public static WebElement services;
    @FindBy(xpath = "//*[@id=\"menu\"]/ul/li[2]/a")
    public static WebElement aboutUsTab;

    @FindBy(xpath = "//*[@id=\"menu\"]/ul/li[5]/a")
    public static WebElement contactUs;

    @FindBy(xpath = "//*[@id=\"subject\"]")
    public static WebElement mailSubject;
    @FindBy(xpath = "//*[@id=\"first-name\"]")
    public static WebElement customerName;


    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    public static WebElement customerEmailField;


}

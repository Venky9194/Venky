package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains elements and respective business libraries of skillrary home page
 * @author venky
 *
 */
public class SkillraryHomePage 
{
	//Declaration
	
	@FindBy(xpath="//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath="//ul/descendant::a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
	
	@FindBy(xpath="//ul[contains(@class,'home_menu')]/li[1]")
	private WebElement language;
	
	@FindBy(xpath="//ul[contains(@class,'home_menu')]/descendant::a[text()=' English']")
	private WebElement english;
	
	//Initialization
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	/**
	 * This method returns Skillrary home page logo
	 */
	public WebElement getLogo()
	{
		return logo;
	}
	
	/**
	 * This method is used to click on gears Tab
	 */
	public void clickGearsTab()
	{
		gearsTab.click();
	}
	
	/**
	 * This metghod is used to click on skillrary Demo App link
	 */
	public void clickSkillraryDemoApp()
	{
		skillraryDemoAppLink.click();
	}
	
	/**
	 * This method is used to select English as default language 
	 */
	public void chooseEnglish()
	{
		language.click();
		english.click();
	}
}

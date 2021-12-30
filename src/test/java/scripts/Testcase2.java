package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.FaceBookPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{

	@Test
	public void tc2() throws IOException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gerasButton();
	s.skillraryDemoapp();
	
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	utilies.switchTabs(driver);
	utilies.dropDown(sd.getCoursedd(),pdata.getdata("ddvalue"));
	
	TestingPage t=new TestingPage(driver);
	utilies.draganaddrop(driver,t.getSelenium(),t.getCart());
	WebElement ele = t.getFacebook();
	Point loc = ele.getLocation();
	int x = loc.getX();
	int y=loc.getY();
	utilies.scrollBar(driver, x, y);
	t.facebookIcon();


	
	FaceBookPage fb=new FaceBookPage(driver);
	fb.likeButton();
	
	
	}
	
}

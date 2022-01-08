package scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testacse1 extends BaseClass {
	@Test
	public void tc1() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillraryDemoapp();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilies.switchTabs(driver);
		utilies.mouseHover(driver,sd.getCoursetab());
		sd.seleniumTriainig();
		
		AddtocartPage ad=new AddtocartPage(driver);
		utilies.doubleClick(driver,ad.getPlusbtn());
		ad.addtocart();
		utilies.alertPopup(driver);
		Assert.assertEquals(driver.getTitle(),pdata.getdata("title"));
		
		
	}
	

}

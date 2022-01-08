package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.TwitterPage;

public class Testcase4 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.serachtextbox(pdata.getdata("courseName"));
	s.serachbtn();
	
	CorejavaPage c=new CorejavaPage(driver);
	c.corejavaimg();
	
	TwitterPage t=new TwitterPage(driver);
	utilies.switchtoFrame(driver);
	t.playbtn();
	Thread.sleep(10000);
	t.pausebtn();
	utilies.switchbackframe(driver);
    t.twitterbtn();	
	
	
	
	}

}

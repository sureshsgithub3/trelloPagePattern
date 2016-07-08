package Action_Tests;

import org.junit.Before;
import org.junit.Test;

import Browsers.Browser;
import Loginpage.GoogleForTrello;
import Loginpage.Login;

public class DragdropTest {
	
	
	@Before
	public void Launchgoogle(){
		Browser.openupbrowser();
	}
	
	@Test
	public void Actionsfortello() throws InterruptedException{
		GoogleForTrello.Goto();
		GoogleForTrello.Searchtrello();
		Login.TrelloLogin("idboapp@gmail.com","pass@word2");
	}

}

package palindrome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidPalindrome {
	Testpalindrome tp;
@Before
public void beforeEverything()
{
tp=new Testpalindrome();

}
@Test
public void testertableau()
{
	int [] arr = new int [] {4,2,2,4};
Assert.assertEquals(true, tp.teste(arr));	

}
}

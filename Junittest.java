
public class Junittest {
	
	@Before
	
	public void beforeTest()
	{
		System.out.println("Running before test");
	}
	
	@Test
	
	public void junitTest()
	{
		Sysytem.out.println("Running junit test");
		
	}
	
	@After
	
	public void AfterMethod()
	{
		System.out.println("Running after junit test");
	}

}

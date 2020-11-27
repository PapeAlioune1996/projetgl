package test.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculatrices.Calculator;
import junit.framework.TestCase;

public class TestUnitaire extends TestCase {
   
	Calculator calc=new Calculator();
	//test sumition
	@Before
	public void setUp()
	{
		calc=new Calculator();
	}
	@Test
	public void testSum()
	{
		int a=-4,b=4;
		if(a<0 && b>0)
		{
			assertFalse("Vous ne pouvez appplique la somme dans ce cas",false);
			
		}
		 assertEquals(5, calc.sum(3, 2));
    }
	//test soustraction
	@Test
	public void testMunis() {
		int a=-2,b=3;
		if((a<0 && b>0) || (a>0 && b<0))
		{
			assertFalse("Vous ne pouvez appplique la soustraction dans ce cas",false);
			
		}
		assertEquals(8, calc.munis(12, 4));
	}
	//test multiplication
	@Test
	public void testMutilply() {
		assertEquals(15, calc.multiply(3, 5));
	}
	//test devide
	@Test
	public void testdevide() {
		int a=3,b=4;
		if(a==0 || b==0 )
		{
			assertFalse("Division par zero impossible",false);
		}
		
		assertEquals(5, calc.divide(15, 3));
	}
	//minimum
	@Test
	public void testMin(){
		int min = calc.min(10,20);
		if (min != 10) Assert.fail();
	}
   //max
	@Test 
	public void testMax(){
		int max = calc.max(2000, -2000);
		Assert.assertEquals(2000,max);
	}
	//min tab
	@Test
	public void testMinElement(){
		int tab[]= {2,0,8};
		int min = calc.minElement(tab);
		if (min != 0) Assert.fail();
	}
    //max tab
	@Test 
	public void testMaxElement(){
		int tab[]= {2,1,5};
		int max = calc.maxElement(tab);
		if (max != 5) Assert.fail();
	}

}

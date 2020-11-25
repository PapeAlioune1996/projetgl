package calculatrices;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestUnitaire {

	Calculator calc=new Calculator();
	//test sumition
	@Test
	public void testsum()
	{
		
		int a, b, res;
		a = 5; 
	    b  = 5;
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("a et b positif");
	        }
		a = 0; 
	        b  = 5; 
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("a nul");
	        }
		a = 5; 
	        b  = 0; 
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("b nul");
	        }
		a = 0; 
	        b  = 0; 
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("a et b nuls");
		}
	}
	//Test unitaire munis
	@Test
	public void tstMunis()
	{
		int a,b,res;
		a = 3; 
	    b  = 3;
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("a et b positif");
	        }
		a = 0; 
	        b  = 5; 
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("a nul");
	        }
		a = 5; 
	        b  = 0; 
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("b nul");
	        }
		a = 0; 
	        b  = 0; 
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("a et b nuls");
	        }
		a = -5; 
	        b  = 5; 
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("a negatif");
	        }
		a = 5; 
	        b  = -5; 
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("b negatif");
	        }
		a = -5; 
	        b  = -5; 
	        res = a + b;
		if (calc.sum(a, b) != res) {
			fail("a et b negatif");
	        }
	}
	//Test unitaire mutiplication
	@Test
	public void testMulty()
	{
		int a,b,mult;
		a=3;
		b=3;
		mult=a*b;
		if(calc.multiply(a, b)!=mult)
		{
			fail("Multiplication ok");
		}
			
	}
	//Test unitaire divide
	@Test
	public final void testDivide() {
		
		int a, b, res;
		a = 5; 
	        b  = 5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b positif");
	        }
		a = 0; 
	        b  = 5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a nul");
	        }
		a = -5; 
	        b  = 5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a negatif");
	        }
		a = 5; 
	        b  = -5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("b negatif");
	        }
		a = -5; 
	        b  = -5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b negatif");
	        }
	}
	//Test minimum
	@Test
	public void testMin()
	{
		int a = 0,b=5,min;
		min=a;
		if(calc.min(a, b)==b)
		{
			fail("Error");
		}
		a=6;
		b=10;
		min=a;
		if(calc.min(a, b)==min) {
		assertTrue("Le resultat est Ok",true);
		}
		a=5;
		b=5;
		min=a=b;
		if(calc.min(a, b)>min)
		{
			fail("Les deux valeurs donne sont identique");
		}
	}
	//Test max
	public void testMax()
	{
		int a = 0,b=5,max;
		max=a;
		if(calc.max(a, b)==b)
		{
			fail("Error");
		}
		a=6;
		b=10;
		max=b;
		if(calc.min(a, b)==max) {
			assertTrue("Resultat OK",true);
		}
		a=5;
		b=5;
		max=a=b;
		if(calc.min(a, b)>max)
		{
			fail("Les deux valeurs donne sont identique");
		}
	}
	

}

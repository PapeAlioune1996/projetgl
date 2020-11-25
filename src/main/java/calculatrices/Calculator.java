package calculatrices;

public class Calculator {
  private int a;
  private int b;
  private int som;
//Constructeur

public Calculator(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
 ///methoode somme
public int sum(int a, int b)
{
	
	som=a+b;
	return som;
}
///methoode munis
public int munis(int a, int b)
{
	
	som=a-b;
	return som;
}
///methoode division
public int divide(int a, int b)
{
	
	som=a/b;
	return som;
}
///methoode multiplication
public int multiply(int a, int b)
{
	
	som=a*b;
	return som;
}
//minimum
 public int min(int a, int b)
 {
	 int min;
	 if(a<b && a!=b)
	 {
		 min=a;
		 return min;
	 }else if(b<a && a!=b)
	 {
		 min=b;
		 return min;
	 }
	return 0;
	 
 }
//minimum
public int max(int a, int b)
{
	 int max;
	 if(a>b && a!=b)
	 {
		 max=a;
		 return max;
	 }else if(b>a && a!=b)
	 {
		 max=b;
		 return max;
	 }
	return 0;
	 
}
//
 
 public static void main(String[] args)
 {
	 Calculator c=new Calculator(2, 3);
	int s= c.sum(4,5);
	int d= c.munis(4,5);
	int e= c.min(4,5);
	int m= c.max(4,5);
	System.out.println(s);
	System.out.println(d);
	System.out.println(e);
	System.out.println(m);
 }
  
}

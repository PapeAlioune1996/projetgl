package calculatrices;

public class Calculator {
  private int a;
  private int b;
  private int som;
//Constructeur

public Calculator() {
	
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
//recherche du min dans le tableau
 public int minElement(int[] list) 
 {
	 
  
	 int[] tab = {2,7,9,3};
	 int min = Integer.MIN_VALUE;
	 for(int i=0;i<list.length;i++)
	 {
		 if(tab[i]>min)
		 {
			 min=tab[i];
		 }
		 
	 }
	return min;
 }
//recherche du max dans le tableau
public int maxElement(int[] list) 
{
	 int[] tab = {2,7,9,3};
	 int max = Integer.MAX_VALUE;
	 for(int i = 0; i < tab.length; i++){
         if(tab[i] < max)
           max = tab[i];
       }
	
  
  
	return max;
}
 
 
  
}

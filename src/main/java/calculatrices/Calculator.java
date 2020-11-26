package calculatrices;

import java.util.Arrays;

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
	int som = a+b;
	
	return som;
}
///methoode munis
public int munis(int a, int b)
{
	
	som=a-b;
	return som;
}
//methode multiplication
public int multiply(int a, int b)
   {
       return a*b;
   }
//division
public int divide(int a,int b)
{
	return a/b;
	
}
  ///Minimum 
   public int min(int a, int b)
   {
       if(a<=b)
          return a;
       else 
           return b;
   }
   //Maximum
   public int max(int a, int b)
   {
        if(a<=b)
          return b;
       else 
           return a;
   }
   //Minimum tableau
   public int minElement(int[] list)
   {
      Arrays.sort(list);
      return list[0];
   }
   //Maximum tableau
   public int maxElement(int[] list)
   {
      Arrays.sort(list);
      return list[list.length-1];
   } 
  
}

package calculatrices;

public class Test {
	public static void main(String[] args)
	 {
		int[] t= {2,7,9,3};
		 Calculator c=new Calculator(); 
		int s= c.sum(4,5);
		int d= c.munis(4,5);
		int p= c.multiply(4,5);
		int div= c.divide(9,3);
		int min= c.munis(4,5);
		int max= c.munis(4,5);
		int e= c. minElement(t);
		int m= c. maxElement(t);
		System.out.println("La somme est:"+s);
		System.out.println("le reste est:"+d);
		System.out.println("Le produit est:"+p);
		System.out.println("Le quotient est:"+div);
		System.out.println("Le minmum est:"+min);
		System.out.println("Le maximum est:"+max);
		System.out.println("Le minmum du tableau est:"+e);
		System.out.println("Le maximum du tableau est:"+m);
	 }
}

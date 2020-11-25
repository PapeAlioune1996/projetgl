package calculatrices;

public class Test {
	public static void main(String[] args)
	 {
		 Calculator c=new Calculator(); 
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

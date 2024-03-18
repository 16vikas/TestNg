package nov7;

public class Ifcondition3 {
	

	public static void main(String[] args) {
           
		int a = 10;
		int b = 20;
		int c = 30;
		if (a == b && b==c && c==a )
			System.out.println("All are equels");
		else {
		
		if (a>b)
		{if (a > c)
			System.out.println("a is gretest");
		}
		else if(b>c)
			System.out.println("b is gretest");
		else if(c>b)
			System.out.println("c is gretest");
		}
	}

}

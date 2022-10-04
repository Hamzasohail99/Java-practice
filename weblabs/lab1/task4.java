import java.util.*;

class task4{
	public static void main(String[] args){
		int a,b;
		int c=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter first number");
		a = in.nextInt();

		System.out.println("enter second number");
		b = in.nextInt();
		
		if(args[0].equals("+")){
			c = a+b;
		}
				
		else if(args[0].equals("-")){
			c = a-b;
		}
		
		else if(args[0].equals("x")){
			c = a*b;
		}
		
		else if(args[0].equals("/")){
			c = a/b;
		}
		System.out.println(c);




}




}
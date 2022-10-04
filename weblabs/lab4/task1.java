import java.util.*;
import javax.swing.*;

class NegativeArraySizeException extends Exception{
 	int value;
 	NegativeArraySizeException(int n){
 		value = n;
 	}
 	public String toString()
    	{
        	return "NegativeArraySizeException" + value;
    	}
	
}
class indexOccupiedException extends Exception{
	int value;
 	indexOccupiedException(int i){
 		value = i;
 	}
 	public String toString()
    	{
        	return "index is out of bound";
    	}
}
class indexException extends Exception{
	int value;
 	indexException(int in){
 		value = in;
 	}
 	public String toString()
    	{
        	return "indexException" + value;
    	}
}
class health{
	string name;
	double height;
	double weight;
	double BMI;
}
class driver{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int size;
		try{
			System.out.println("enter index");
			System.out.println("enter size of array");
			
			index = in.nextInteger;
			size = in.nextInteger;
			if (index<0){
				throw new NegativeArraySizeException(index);
			}
			
			else{
				System.out.println("press '1' to add value in array");
				System.out.println("press '2' to Retrieve and print the information");
				System.out.println("press '3' to exit");
				
			}
		}
		catch(indexOccupiedException i){
			System.out.println("not in array"+i)
		}
		catch(indexException in){
			System.out.println("not in array"+in)
		}
	void save(int index) throws indexOccupiedException{
		int index=Integer.parseInt(JOptionPane.showInputDialog("enter index"));
		
	
	}
	void retrieve(int value) throws indexException{
		if 
	
	
	}
	
	
	
	
	}



}

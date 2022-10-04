import javax.swing.*;
class indexoccupiedexception extends Exception{
	indexoccupiedexception() {}
	public String toString(){
		return "Index is occupied";
	}
}
class indexexception extends Exception{
	indexexception(){}
	public String toString(){
		return "index is out of range";
	}
}
class nonpositiveexception extends Exception{
	nonpositiveexception() {}
	public String toString(){
		return "Value is not positive";
	}
}
public class driver1{
	public static void store(int a[], int s) throws indexexception, nonpositiveexception, indexoccupiedexception
	{
		int index = Integer.parseInt(JOptionPane.showInputDialog("Enter Index: "));
		int value = Integer.parseInt(JOptionPane.showInputDialog("Enter Value: "));
		int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter Weight: "));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Enter height: "));
		if(value < 0)
			{throw new nonpositiveexception();}
		if(index < 0)
			{throw new indexexception();}
		if(index >=s)
			{throw new indexoccupiedexception();}
		a[index] = value;
	}

	public static void retrieve(int a[], int s) throws indexexception
	{	
		int index = Integer.parseInt(JOptionPane.showInputDialog("Enter Index: "));
		if (index<0 || index>=s){
			throw new indexexception();
		}
		System.out.println(a[index]);
	}

	public static void main(String args[])
	{
		int array[] = {0,0,0,0,0};
		int size = array.length;
			try{
			store(array,size);
			retrieve(array,size);
		}
		catch(indexexception e){
			System.out.println(e);
		}
		catch(nonpositiveexception e){
			System.out.println(e);
		}
		catch(indexoccupiedexception e){
			System.out.println(e);
		}
	}
}

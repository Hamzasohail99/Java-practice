import java.util.*;
import java.io.*;

class AccountRecordSerializable implements Serializable{
	private int accountno, balance;
	private string firstname, lastname; 
	
	public void set(int no, int bal, string fname, string lname){
		accountno = no;
		bal = balance;
		firstname = fname;
		lastname = lname;
	}
	public int getno(){
		return accountno;
	} 
	public int getno(){
		return balance;
	} 
	public string getno(){
		return firstname;
	} 
	public string getno(){
		return lastname;
	} 
	public void openAccount(){	
		String name = firstname + lastname +" "+accountno +" "+ balance + " " +"/n" ;
		String filename="bank.txt";
		try
		{
		BufferedWriter out=new BufferedWriter(new FileWriter(filename,true));
		out.write(name);
		out.close();
		}
		catch(IOException e)
		{
		System.out.println(e);	}
			}
	

}



public class bank{
	public static void main(String args[])
	{	
		bank a=new bank();
		
		a.firstname=JOptionPane.showInputDialog("enter firstname");
		a.lastname=JOptionPane.showInputDialog("enter last name");
		a.accountno=Integer.parseInt(JOptionPane.showInputDialog("enter account no"));
		a.balance=Integer.parseInt(JOptionPane.showInputDialog("enter balance"));
		a.openAccount();	
		
	}
}	




}

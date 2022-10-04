import java.util.*;
import java.io.*;
import javax.swing.*;

class AccountRecordSerializable implements Serializable{
	private int accountno, balance;
	private String firstname, lastname; 
	
	public void set(String fname, String lname, int no, int bal){
		accountno = no;
		bal = balance;
		firstname = fname;
		lastname = lname;
	}
	public int getno(){
		return accountno;
	} 
	public int getbal(){
		return balance;
	} 
	public String getfname(){
		return firstname;
	} 
	public String getlname(){
		return lastname;
	} 

}



public class bank{
	static Scanner in;
	AccountRecordSerializable person;
	public void openAccount(){
		String firstname, lastname;
		int accountno, balance;
			
		person = new AccountRecordSerializable();
		System.out.print("\tEnter First Name: ");
		firstname = in.nextLine();
		System.out.print("\tEnter Last Name: ");
		lastname = in.nextLine();
		System.out.print("\tEnter Account Number: ");
		accountno = in.nextInt();
		System.out.print("\tEnter Balance: ");
		balance = in.nextInt();
		in.nextLine();
		person.set(firstname, lastname, accountno, balance);
		try {
			FileOutputStream fos = new FileOutputStream("bank.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fos);

			out.writeObject(person);

			out.close();
			fos.close();
		} 
		catch (Exception e){
			System.out.println(e);
		}
	}
	public void Retrieve(){
		int an;
		System.out.print("\tEnter Account Number: ");
		an = in.nextInt();	
		try{	
			FileInputStream fis = new FileInputStream("bank.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			AccountRecordSerializable p = (AccountRecordSerializable) in.readObject();

			int s = p.getno();

			if(an == s) {
				System.out.println(p);
			}

			in.close();
			fis.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public void retrieveall(){
		try{
		FileInputStream fis = new FileInputStream("bank.txt");
		ObjectInputStream in = new ObjectInputStream(fis);
		
		in.close();
		fis.close();
		}
		catch(Exception e){
		}
	}
	public static void main(String args[])
	{	
		bank a = new bank();
		in = new Scanner(System.in);
		while(true){
			System.out.println("\n press 1 to add account");
			System.out.println("press 2 to check details of an account");
			System.out.println("press 3 to check details of all accounts");
			System.out.println("press 4 to add exit");
			int i = in.nextInt();
			in.nextLine();
			if(i == 1) {
				a.openAccount();
			}
			else if(i == 2) {
				a.Retrieve();
			}
			else if(i == 3) {
				a.retrieveall();
			}
			else if(i == 4) {
				System.out.println("");
			}
		}
		
		
	}
}	






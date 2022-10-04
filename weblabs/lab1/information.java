import javax.swing.*;

public class information{
	public static void main(String[] args){
		String name, rollno, age;
		
		
		name = JOptionPane.showInputDialog("enter your name");
		rollno = JOptionPane.showInputDialog("enter your rollno");
		age = JOptionPane.showInputDialog("enter your age");
		JOptionPane.showMessageDialog(null, "your name is:" +name);
		JOptionPane.showMessageDialog(null, "your rollno is:" +rollno);
		JOptionPane.showMessageDialog(null, "your age is:" +age);		


}




}
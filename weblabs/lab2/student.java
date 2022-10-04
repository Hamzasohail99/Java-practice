import javax.swing.*;

public class student{
	String ID, name, age, gender, cgpa;
	static int index = 0;
	int addstudent(){
		//String ID, age, gender;
		//String name, cgpa;
		
		this.ID = JOptionPane.showInputDialog("enter your ID");
		
		this.name = JOptionPane.showInputDialog("enter your name");
	
		this.cgpa = JOptionPane.showInputDialog("enter your cgpa");
		
		this.age = JOptionPane.showInputDialog("enter your age");
		
		this.gender = JOptionPane.showInputDialog("enter your gender");
		
		index = index + 1;
		return index-1;
		
	}
	void viewstudent(){
		JOptionPane.showMessageDialog(null, "your name is:" +name);
		
		JOptionPane.showMessageDialog(null, "your rollno is:" +ID);
		
		JOptionPane.showMessageDialog(null, "your age is:" +age);
		
		JOptionPane.showMessageDialog(null, "your cgpa is:" +cgpa);
		
		JOptionPane.showMessageDialog(null, "your cgpa is:" +gender);		

	}
	void deletestudent(){
		this.ID = null;
		this.name = null;
		this.age = null;
		this.gender = null;
		this.cgpa = null;	
	}
	void updatestudent(){
		this.ID = JOptionPane.showInputDialog("enter the ID");
		this.name = JOptionPane.showInputDialog("enter the name");
		this.age = JOptionPane.showInputDialog("enter the age");
		this.gender = JOptionPane.showInputDialog("enter the gender");
		this.cgpa = JOptionPane.showInputDialog("enter the cgpa");
	}
	void option(){
		this.ID = JOptionPane.showInputDialog("enter the ID");
		this.name = JOptionPane.showInputDialog("enter the name");
		this.age = JOptionPane.showInputDialog("enter the age");
		this.gender = JOptionPane.showInputDialog("enter the gender");
		this.cgpa = JOptionPane.showInputDialog("enter the cgpa");
	}
	static int index(){
		return index;	
	}
	
	public static void main(String[] args){
		int size;
		String strength;
		strength = JOptionPane.showInputDialog("enter class strength");
		size = Integer.parseInt(strength);
		
		student s[] = new student[size];
	
		while(index< size){
			String Option;
			Option = JOptionPane.showInputDialog("enter 1 to add student \n enter 2 to view student \n enter 3 to delete student \n enter 4 to update student ");
		
			int option = Integer.parseInt(Option);
			int index = index();
			if (option == 1)
			{
				
				s[index] = new student();
				s[index].addstudent();
			}
			else if (option == 2)
			{
				String ID = JOptionPane.showInputDialog("enter the ID");
				int id = Integer.parseInt(ID);
				s[index].viewstudent();
			}
			else if (option == 3)
			{
				String ID = JOptionPane.showInputDialog("enter the ID");
				int id = Integer.parseInt(ID);
				s[index].deletestudent();
			}
			else if (option == 4)
			{
				String ID = JOptionPane.showInputDialog("enter the ID");
				int id = Integer.parseInt(ID);
				s[index].updatestudent();
			}
				

		}
	}




}

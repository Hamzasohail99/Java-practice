import java.util.*;

class student{
	
	String name, rollno, degree, cgpa;
	void set(String name, String rollno, String degree, String cgpa){
		this.name = name;
		this.rollno = rollno;
		this.degree = degree;
		this.cgpa = cgpa;

	}
	String getname(){
		return name;
	}
	String getrollno(){
		return rollno;
	}	
	String getdegree(){
		return degree;
	}
	String getcgpa(){
		return cgpa;
	}
	void print(){
		System.out.println("name = " +getname());
		System.out.println("rollno = " +getrollno());
		System.out.println("degree = " +getdegree());
		System.out.println("cgpa = " +getcgpa());
	}
}
	
public class driver{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int size;
		String input;
		System.out.println("enetr size");
		input = in.nextLine();
		size = Integer.parseInt(input);
		student s[] = new student[size];
		String name,rollno,degree,cgpa;
		for(int i =0 ; i<size ; i++){
			s[i] = new student();
			System.out.println("enter your name");
			name = in.nextLine();

			System.out.println("enter your rollno");
			rollno = in.nextLine();

			System.out.println("enter your degree");
			degree = in.nextLine();

			System.out.println("enter your cgpa");
			cgpa = in.nextLine();
			s[i].set(name, rollno, degree ,cgpa);
			
		}
	for(int i=0 ; i<size; i++){
		//System.out.println(" " +(i+1) +" - ");
		s[i].print();
	}
	in.close();

}
}



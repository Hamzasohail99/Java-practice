import java.util.*;

abstract class threedimensionalshape{
	public abstract double getarea(double r);
	public abstract double getvolume(double r);


}
class sphere extends threedimensioanlshape{
	
	public double getarea(double r){
		return 4 * 3.14 * r * r;
	}
	public double getvolume(double r){
		return 4/3 * 3.14 * r * r * r;
	}


}
class cube extends threedimensioanlshape{
	
	public double getarea(double r){
		return 6 * r * r;

	}
	public double getvolume(double a){
		return r * r * r;
	}
}
class tetrahedron extends threedimensioanlshape{
	
	public double getarea(double r){
		return Math.sqrt(3) * r * r;

	}
	public double getvolume(double r){
		return (r * r * r)/(6 * Math.sqrt(2));
	}
}
public class driver{
	public static void main(String[] args){
		threedimensionalshape s[3];
		
		s[0] = new sphere();
		s[1] = new cube();
		s[2] = new tetrahedron();
		Scanner in = new Scanner(System.in);
		double r = in.nextdouble();
		for(int i = 0 ; i<3 ; i++){
			if(s[i] instanceof sphere){
				System.out.println(s[i]);
				System.out.println("area of sphere = " + s[i] + getarea(r));
				System.out.println("volume of sphere = " + s[i] + getvolume(r));
			
			}
			else if(s[i] instanceof cube){
				System.out.println(s[i]);
				System.out.println("area of cube = " + s[i] + getarea(r));
				System.out.println("volume of cube = " + s[i] + getvolume(r));
			
			}
			else if(s[i] instanceof tetrahedron){
				System.out.println(s[i]);
				System.out.println("area of tetrahedron = " + s[i] + getarea(r));
				System.out.println("volume of tetrahedron = " + s[i] + getvolume(r));
			
			}
		
		}
	}

} 

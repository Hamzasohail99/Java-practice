import java.util.*;

abstract class threedimensionalshape{
	public abstract double getarea(double r);
	public abstract double getvolume(double r);


}
class sphere extends threedimensionalshape{
	
	public double getarea(double r){
		return 4 * 3.14 * r * r;
	}
	public double getvolume(double r){
		return 4/3 * 3.14 * r * r * r;
	}
	public String toString() {
		return "sphere";
	}

}
class cube extends threedimensionalshape{
	
	public double getarea(double r){
		return 6 * r * r;

	}
	public double getvolume(double r){
		return r * r * r;
	}
	public String toString() {
		return "cube";
	}
}
class tetrahedron extends threedimensionalshape{
	
	public double getarea(double r){
		return Math.sqrt(3) * r * r;

	}
	public double getvolume(double r){
		return (r * r * r)/(6 * Math.sqrt(2));
	}
	public String toString() {
		return "tetrahedron";
	}
}
public class driver{
	public static void main(String[] args){
		threedimensionalshape s[] = {new sphere() , new cube() , new tetrahedron()};
		
		
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		for(int i = 0 ; i<3 ; i++){
			if(s[i] instanceof sphere){
				
				System.out.println(s[i]);
				System.out.println("area of sphere = " + s[i].getarea(r));
				System.out.println("volume of sphere = " + s[i].getvolume(r));
			
			}
			else if(s[i] instanceof cube){
				System.out.println(s[i]);
				System.out.println("area of cube = " + s[i].getarea(r));
				System.out.println("volume of cube = " + s[i].getvolume(r));
			
			}
			else if(s[i] instanceof tetrahedron){
				System.out.println(s[i]);
				System.out.println("area of tetrahedron = " + s[i].getarea(r));
				System.out.println("volume of tetrahedron = " + s[i].getvolume(r));
			
			}
		
		}
	}

} 

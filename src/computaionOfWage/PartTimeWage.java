package computaionOfWage;

public class PartTimeWage {
public static void main(String[] args) {
		
		byte Full_time=2;
		byte part_time=1;
		byte WagePerHour=20;
		byte EmpHr=0;
		
		double empcheck = Math.floor(Math.random()*10) % 3 ;
		
		if (empcheck == +part_time)
		EmpHr=4;
		else if (empcheck==+Full_time)
		EmpHr=8;
		else 
			EmpHr=0;
		
		int totalwageis= WagePerHour * EmpHr;
			System.out.println("Employe daily wage is .."+totalwageis);
		
		 		

	

}
}

package computaionOfWage;

public class WageOfMonth {
public static void main(String[] args) {
		
		byte Full_time=2;
		byte part_time=1;
		byte WagePerHour=20;
		byte EmpHr=0;
		byte Total_Day_Of_Month=20;
		
		double empcheck = Math.floor(Math.random()*10) % 3 ;
		
		if (empcheck == +part_time)
		{		EmpHr=4;
		System.out.println("employe is part time");
		}
		else if (empcheck==+Full_time)
		{
			EmpHr=8;
			System.out.println("employe is full time");
		}
		else 
		{	EmpHr=0;
		System.out.println("employe is absent");
		}
		int totalwageis= WagePerHour * EmpHr;
		int WageOfMonth= totalwageis * Total_Day_Of_Month;
			System.out.println("Employe daily wage is .."+totalwageis);
			System.out.println("Employe Wage of month is .."+WageOfMonth);
}
}
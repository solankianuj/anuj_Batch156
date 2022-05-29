package computaionOfWage;

public class MaxWorking {
	public static void main(String[] args) {
		byte Full_time=2;
		byte part_time=1;
		byte WagePerHour=20;
		byte EmpHr=0;
		byte Total_Day_Of_Month=20;
		byte i=0;
		int totalemphris=0;
		int Wage_of_month=0;
		for (i=0; i<Total_Day_Of_Month; i++)
		{
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
		
		
		
		 totalemphris = EmpHr+totalemphris;
			
		System.out.println("Employe total working hour .."+totalemphris);
		
		
		}		
		
		Wage_of_month=totalemphris*WagePerHour;
		System.out.println("Employe Wage of month is .."+Wage_of_month);
		
		
		
		
		
	}

}

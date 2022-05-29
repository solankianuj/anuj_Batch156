package computaionOfWage;

public class DailyWage {
	public static void main(String[] args) {
		
		
		byte full_time=1;
		byte WagePerHour=20;
		byte WorkingHour=8;
		
		double empcheck = Math.floor(Math.random()*10) % 2 ;
		
		int totalwageis=(+WagePerHour*+WorkingHour);
		if (empcheck == +full_time)
		{
		
				System.out.println("Employe is Full time\nEmploye daily wage is .."+totalwageis);
			}
			else		System.out.println("employe is absent");

	}

}

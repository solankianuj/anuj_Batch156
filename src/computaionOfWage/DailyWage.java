package computaionOfWage;

public class DailyWage {
	public static void main(String[] args) {
		
		
		byte full_time=1;
		byte WagePerHour=20;
		byte WorkingHour=8;
		
		double empcheck = Math.floor(Math.random()*10) % 2 ;
		
		int totalwageis=(20*8);
		if (empcheck == 1)
		{
				System.out.println("employe daily wage is .."+totalwageis);
			}
			else		System.out.println("employe is absent");

	}

}

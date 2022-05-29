package computaionOfWage;

public class UsingSwitchCase {

	public static void main(String[] args) {
		int Full_Time = 2;
		int Part_Time = 1;
		int Emp_Rate_Per_Hour= 20;
		int EmpHR=0;
		int EmpWage=0;
	int empcheck =(int) Math.floor(Math.random()*10)%3  ;
		System.out.println(+empcheck);
	switch ( empcheck ) {
	case 1 :
	EmpHR=4;
	break;
	case 2 :
		EmpHR=8;
		break;
		default :
			EmpHR=0;
}
      EmpWage = EmpHR * Emp_Rate_Per_Hour;

      System.out.println("Emp Wage:" +EmpWage);
				
}
}

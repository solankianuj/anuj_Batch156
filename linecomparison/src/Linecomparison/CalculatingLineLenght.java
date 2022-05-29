package Linecomparison;

public class CalculatingLineLenght {
	public static void main(String[] args) {
		int x1=10;
		int x2=5;
		int y1=6;
		int y2=8;
	
		int Length_Of_Line= ((x2-x1)^2 + (y2-y1)^2)^2;
		
		System.out.println(Length_Of_Line);
	}

}

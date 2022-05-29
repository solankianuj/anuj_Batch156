package Linecomparison;

public class ComparisonOfLine {
	public static void main(String[] args) {

		String s1="ANUJ";
		String s2 ="anuj";
		String s3 = new String ("anuj");
			System.out.println(s1+ "compareTo" +s2+ ":" +s1.compareTo(s2));
			System.out.println(s1+ "compareTo" +s3+ ":" +s1.compareTo(s3));
			System.out.println(s3+ "compareTo" +s2+ ":" +s3.compareTo(s2));
	}

}

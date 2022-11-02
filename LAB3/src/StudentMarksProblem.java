import java.util.Scanner;

public class StudentMarksProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Matric :");
		int Matric = input.nextInt();
		
		
		System.out.println("Enter Assesment1 Marks:");
		double Assesment1Marks = input.nextDouble();
		final double Assesment1Percentage= 0.15 ;
		
		System.out.println("Enter Assesment2 Marks:");
		Double Assesment2Marks = input.nextDouble();
		final double Assesment2Percentage = 0.20 ;
		
		
		System.out.println("Enter Lab Assignment Marks:");
		Double LabAssignmentMarks = input.nextDouble();
		final double LabAssignmentPercentage = 0.35;
		
		System.out.println("Enter Final Exam Marks:");
		double FinalExamMarks = input.nextDouble();
		final double FinalExamPercentage = 0.30 ;
		
		Double TotalMarks=( Assesment1Marks * Assesment1Percentage) + (Assesment2Marks * Assesment2Percentage) + (LabAssignmentMarks * LabAssignmentPercentage)+(FinalExamMarks *FinalExamPercentage);
		
		System.out.println("Your total marks for CSC3100 (" +((Assesment1Marks * Assesment1Percentage )+ (" + ")+(Assesment2Marks * Assesment2Percentage) + (" + ")+ (LabAssignmentMarks * LabAssignmentPercentage) + (" + ")+ (FinalExamMarks *FinalExamPercentage ) +(") is ") + TotalMarks ));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

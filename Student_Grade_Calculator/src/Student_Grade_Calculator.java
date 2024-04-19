import java.util.Scanner;

public class Student_Grade_Calculator {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
int total_subjects, total_marks, obtained_marks = 0;
	System.out.println("Enter Your Total Subjects: ");
total_subjects = scanner.nextInt();
	
		total_marks = total_subjects*100;

float[] marks = new float[total_subjects];
	
		for(int i = 0; i < total_subjects; i++) {
			
			System.out.println("Enter Your Marks for Subject "+ (i+1) +":");
			marks[i] = scanner.nextFloat();
		obtained_marks += marks[i];	
		}
int average_percentage = obtained_marks/total_subjects;
char grade;
if(average_percentage >= 90) {
	grade = 'A';
}else if (average_percentage >= 80){
	grade = 'B';
}else if (average_percentage >= 70){
	grade = 'C';
}else if (average_percentage >= 60){
	grade = 'D';
}else {
	grade = 'F';
}
System.out.println("Total Marks: "+total_marks+"\nObtained Marks: "+obtained_marks+"\nAverage Percentage: "+average_percentage+"\nGrade: "+grade);
}
}

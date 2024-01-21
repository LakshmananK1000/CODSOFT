import java.util.Scanner;
public class GradeCalculator{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of Subjects : ");
		int n = in.nextInt();
		int total=0;
		char grade;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Mark "+i+" : ");
			int marks = in.nextInt();
			total+= marks;
		}
		double avg = (double)total / (n*100) * 100;
		if(avg >=90)
		{
			grade = 'A';
		}
		else if( avg >=80)
		{
			grade = 'B';
		}
		else if( avg >=70)
		{
			grade = 'C';
		}
		else if( avg >=60)
		{
			grade = 'D';
		}
		else if (avg >=50)
		{
			grade = 'E';
		}
		else
		{
			grade = 'F';
		}
		System.out.println("Total Marks : "+total);
		System.out.println("Average Percentage :"+avg);
		System.out.println("Your Grade : "+grade);
		System.out.println("Congratulations...");
	}
}
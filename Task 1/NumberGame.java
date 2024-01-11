import java.util.*;
import java.util.Scanner;
public class NumberGame{
	public static void main(String[] args)
	{
		
		System.out.println("\tGuess The Number...\n\tRules : \n\t1.You Have 5 Choices\n\t2.Guess the Actual Number within the chance\n\t3.If you fail to Guess within limit you Lose\n\t4.Scores Depends upon the Number of Attempts");
		Guess();
		
	}
	static void Guess()
	{
		int min=1, max=100,score=100;
		int chance =5;
		int randnum = min + (int)(Math.random() * (max - min) + 1);
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println();
			System.out.println("Attempt : "+i);
			System.out.println("Guess the Number : ");
			int guess = in.nextInt();
			if(guess == randnum)
			{
				System.out.println("You Guessed Correct...The Number is "+randnum);
				System.out.println("Your Score : "+score);
				}
			else
			{
				chance--;
				score-=20;
				if(guess > randnum && chance !=0)
				{
					System.out.println("The Number is too High...Try Again, you have "+chance+" Chances left");
					}
				else if(guess < randnum && chance !=0)
				{
					System.out.println("The Number is too Low...Try Again, you have "+chance+" Chances left");
					}
				else if(chance==0)
				{
					System.out.println("You Guessed Wrong...The Actual Number is :"+randnum);
					System.out.println("Your Score : "+score);
					}
				}
			}
		System.out.println("Do You Want to Play Again (1/0)");
		int n = in.nextInt();
		if(n==1)
		{
			Guess();
		}
		else if(n==0)
		{
			System.out.println("Thankyou The Game Has Ended...");
		}
		else
		{
			System.out.println("Invalid Input...");
		}
		
		}
}
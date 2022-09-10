import java.util.Scanner;

public class TimeDecipher {

	static Scanner console = new Scanner(System.in);
	static int choice;
	static boolean even, positive, both;
	
	public static void main(String[] args) {
		System.out.println("Enter choice: ");
		choice = console.nextInt();
			
			if (choice == 1) {
		
				// Determines the minutes and seconds left for large numbers over 60 seconds
				System.out.print("Enter an integer for seconds: ");
				int seconds = console.nextInt();
		
				int minutes = seconds / 60;
				int remainingSeconds = seconds % 60;
				System.out.println(seconds + " seconds is " + minutes + " miunutes and " + remainingSeconds + " seconds");
			}
			
			else if (choice == 2) {
				
				// Determine the modular remainder of the number entered  
				System.out.println("What is the sum of: ");
				int sum = console.nextInt();
				int divisor = console.nextInt();
				int total = sum % divisor;
				System.out.println("Sum is : " + total);
				
			}
			
			else if (choice == 3) {
				
				// More advanced use of Array to determine day of the week + 100 = day of week
				System.out.println("What will be the day in 100 days, today is: ");
				String day = console.next();
				
				System.out.println(day);	
				int newDay = (1 + 100) % 7;
				System.out.println(newDay);
				String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
				System.out.println("New week day will be " + week[newDay]);
				}
			
			else if (choice == 4) {
				System.out.println(2 * (5 / 2 + 5 / 2));
				System.out.println(2 * 5 / 2 + 2 * 5 / 2);
				System.out.println(2 * (5 / 2));
				System.out.println(2 * 5 / 2);
				double result = Math.pow(2, 3.5); 
				System.out.println(result);
				int m, r;
				m = 1;
				r = 3;
				double newResult = Math.pow(m*r,2);
				System.out.println(newResult);
			}
			
			else if (choice == 5) {
				System.out.println("Enter a degree in Fahrenheit: ");
				double fahrenheit = console.nextDouble();
				  
				// Converting Fahrenheit to Celsius
				double celsius = (5.0 / 9) * (fahrenheit - 32); 
				System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
			}
			
			else if (choice == 6) {
				System.out.println("This is a Even And Positive Homework \n _____________________ \n\n" 
				+ "Please enter an integer number:");
				int input = console.nextInt();
				if (input % 2 == 0) {
					even = true;
				} 
				else {even = false;}
				if (input > 0) {
					positive = true;
				}
				else {positive = false;}
				if (even && positive == true)
				{
					both = true;
				}
				else {both = false;}
				System.out.println("The number " + input + " is: \n"
						+ input + " is an even number: " + even + "\n"
						+ input + " is a positive number: "	+ positive + "\n" 
						+ input + " is a positive even number: " + both);	
				}
			
			else if (choice == 7) {
				System.out.println("Choose a min and max intenger:");
				int min = console.nextInt();
				int max = console.nextInt();
				double operation = Math.random() * (max - min) + min;
				System.out.println((int)operation);
				}
			
			else if (choice == 8) {
				System.out.println("Choose a radius: ");
				int radius = console.nextInt();
				double radiusD = (double)radius;
				double power = Math.PI * (Math.pow(radiusD, 2));
				System.out.println(power);
			}
			
			else if (choice == 9) {
				// Obtain the total milliseconds since midnight, Jan 1, 1970
				long totalMilliseconds = System.currentTimeMillis();
				
				// Obtain the total seconds since midnight, Jan 1, 1970
				long totalSeconds = totalMilliseconds / 1000;
				
				// Compute the current second in the minute in the hour
				long currentSecond = totalSeconds % 60;
				
				// Obtain the total minutes
				long totalMinutes = totalSeconds / 60;
				
				// Compute the current minute in the hour
				long currentMinute = totalMinutes % 60;
			}
		}
	}
	

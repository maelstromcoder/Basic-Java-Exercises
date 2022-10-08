import java.util.Scanner;

public class TimeDecipher {

	static Scanner console = new Scanner(System.in);
	static int choice;
	static boolean even, positive, both;
	static String student;
	// Choice 14
	static String zodiacsign;
	// Choice 15
	static public String[] palindrome;
	// Choice 16
	static boolean value = true;
	// Choice 18 
	// static String to work in all methods
	static String regex = "[0-9]*";
	
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
				
				// System.out.println(day);	
				int newDay = (1 + 100) % 7;
				String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
				System.out.println("New week day will be " + week[newDay+1]);
			}
			
			else if (choice == 4) {
				// Operations program
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
				// Even, positive and both program (Homework 1)
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
				// Min and Max random number generator
				System.out.println("Choose a min and max intenger:");
				int min = console.nextInt();
				int max = console.nextInt();
				double operation = Math.random() * (max - min) + min;
				System.out.println((int)operation);
			}
			
			else if (choice == 8) {
				// Circle area = pi * r^2
				System.out.println("Choose a radius: ");
				double radius = console.nextDouble();
				double radiusD = (double)radius;
				double power = Math.PI * (Math.pow(radiusD, 2));
				System.out.println(power);
			}
			
			else if (choice == 9) {
				// Obtain the total milliseconds since midnight, Jan 1, 1970 - 1203183068328
				long totalMilliseconds = System.currentTimeMillis(); 
				
				// Obtain the total seconds since midnight, Jan 1, 1970 - 1203183068
				long totalSeconds = totalMilliseconds / 1000;
				
				// Compute the current second in the minute in the hour - 8
				long currentSecond = totalSeconds % 60;
				
				// Obtain the total minutes - 20053051
				long totalMinutes = totalSeconds / 60;
				
				// Compute the current minute in the hour - 31
				long currentMinute = totalMinutes % 60;
				
				// Obtain the total hours - 334217
				long totalHours = totalMinutes / 60;
				
				// Compute the current hour - 17
				long currentHour = totalHours % 24;
				
				// Display results
				System.out.println("Current time is " + currentHour + ":"
						+ currentMinute + ":" + currentSecond + " GMT");
			}
			
			else if (choice == 10) {
				// Grading System 
				System.out.println("What is your grade?");
				int grade = console.nextInt();
				
				if (grade < 25) {
					student = "F";
				} else if (grade >= 25 && grade < 45) {
					student = "E";
				} else if (grade >= 45 && grade < 50) {
					student = "D";
				} else if (grade >= 50 && grade < 60) {
					student = "C";
				} else if (grade >= 60 && grade <= 80) {
					student = "B";
				} else if (grade > 80) {
					student = "A";
				}
				
				System.out.println("Your student grade is: " + student);
					
			}
			
			else if (choice == 11) {
				// Leap Year
				// Declare and initialize 3 int spaces in array
				int numberdate[] = new int[3];
				
				// Display request for day and add console input for day in array slot 0
				System.out.println("Enter day: ");
				numberdate[0] = console.nextInt();

				// Display request for day and add console input for day in array slot 1
				System.out.println("Enter month: ");
				numberdate[1] = console.nextInt();
				
				// Display request for day and add console input for day in array slot 2
				System.out.println("Enter year: ");
				numberdate[2] = console.nextInt();
				
				// Sending the array values into the public class Date to do operations
				Date test = new Date(numberdate[0],numberdate[1],numberdate[2]);
				// Calling the class for returns
		        System.out.println(test);
		         
			}
			
			else if (choice == 12) {
				// Chinese Zodiac Cycle
				System.out.println("Enter a year: ");
				int year = console.nextInt();
							
				switch (year % 12) {
				case 0: zodiacsign = "Monkey"; break;
				case 1: zodiacsign = "Rooster"; break;
				case 2: zodiacsign = "Dog"; break;
				case 3: zodiacsign = "Pig"; break;
				case 4: zodiacsign = "Rat"; break;
				case 5: zodiacsign = "Ox"; break;
				case 6: zodiacsign = "Tiger"; break;
				case 7: zodiacsign = "Rabbit"; break;
				case 8: zodiacsign = "Dragon"; break;
				case 9: zodiacsign = "Snake"; break;
				case 10: zodiacsign = "Horse"; break;
				case 11: zodiacsign = "Sheep"; break;
				}
				System.out.println("Your Chinese Zodiac sign is: " + zodiacsign + ".");
			}
			
			else if (choice == 13) {
				// Random Month Generator
				// System.out.println(Math.random()+ 12);
				double year = Math.random() * 12;
				switch ((int)year % 12) {
				case 0: zodiacsign = "January"; break;
				case 1: zodiacsign = "February"; break;
				case 2: zodiacsign = "March"; break;
				case 3: zodiacsign = "April"; break;
				case 4: zodiacsign = "May"; break;
				case 5: zodiacsign = "June"; break;
				case 6: zodiacsign = "July"; break;
				case 7: zodiacsign = "August"; break;
				case 8: zodiacsign = "September"; break;
				case 9: zodiacsign = "October"; break;
				case 10: zodiacsign = "November"; break;
				case 11: zodiacsign = "December"; break;
				}
				System.out.println("Your random month is: " + zodiacsign + ".");
			}
			
			else if (choice == 14) {
				// Parse
				String intString = "101";
				
				int intValue = Integer.parseInt(intString);
				System.out.println(intValue);
				
				String doubleString = "10.0";
				
				double doubleValue = Double.parseDouble(doubleString);
				System.out.println(doubleValue);
			}
			
			else if (choice == 15) {
				System.out.println("Anything you write will be reversed: ");
				// Console input
				String pal = console.next();
				// Associating integer value to array with string length
				palindrome = new String[pal.length()]; 
				
				// Loop to isolate the character based off the i and i++ operational
				for (int i = 0; i < pal.length(); i++) {
					// charAt(i) isolates the character from the string
					Character input1 = pal.charAt(i);
					// Converts the char back to string in order to store in array
			        palindrome[i] = input1.toString();
			    }
			      
				// Loop to call back the array initialization
			    for (int length=pal.length() - 1; length >= 0;length--) {
			        System.out.print(palindrome[length]);
			    }	
			}
			
			else if (choice == 16) {
				// Palindrome formula copied from https://www.baeldung.com/java-palindrome
				System.out.println("Please type a number, we will check if it is a palindrome: ");
				String text = console.next();			
				
				String clean = text.replaceAll("\\s+", "").toLowerCase();
			    int length = clean.length();
			    int forward = 0;
			    int backward = length - 1;
			    while (backward > forward) {
			        char forwardChar = clean.charAt(forward++);
			        char backwardChar = clean.charAt(backward--);
			        if (forwardChar != backwardChar) {
			        	value = false;
			        }
			    }
			    if (value == true) {
			    	System.out.println("Your number " + text + " is a palindrome");
			    }
			    else {
			    	System.out.println("Your number " + text + " is not a palindrome");
			    }
			}
			
			else if (choice == 17) {

				final int money1 =    200;
				final int money2 =    100;
			    final int money3 =     25;
			    final int money4 =     10;
			    final int money5 =      5;
			    int  money;        
			   
			    int dollar1 = Integer.parseInt(args[0]);
			    int dollar2 = Integer.parseInt(args[1]);
			    int dollar3 = dollar1 - dollar2;
			    money = dollar3;
			    
			    System.out.println("Amount received: " + dollar1);
			    System.out.println("Cost of the item: " + dollar2);
			    System.out.println("Required change: " + dollar3);
			    
			    
			    int Digit1 = money / money1;
			    money = money % money1;
			    int Digit2 = money / money2;
			    money = money % money2;
			    int Digit3 = money / money3;
			    money = money % money3;
			    int Digit4 = money / money4;
			    money = money % money4;
			    int Digit5 = money / money5;
			    money = money % money5;
			    
			    System.out.println("\nChange: ");
			    System.out.println("	toonies x " + Digit1);
			    System.out.println("	loonie x " + Digit2);
			    System.out.println("	quarter " + Digit3);
			    System.out.println("	dime " + Digit4);
			    System.out.println("	nickel " + Digit5);
			    
				
			}
			
			else if (choice == 18) {			    
			    String input;
			    
			    do
		        {
		            System.out.print("Enter something and we'll reverse it: ");      
		            input = console.next();		         
		            reverseDigit(input);
		        } while (false);		       						
			}						
	}
	
	public static void reverseDigit(String value)
    {    
        if (value.matches(regex))
        {
            int[] array = new int[value.length()];
            for (int i = 0; i < value.length(); i++)
            {
                Character input3 = value.charAt(i);
                array[i] = Integer.parseInt(input3.toString());
            }
            for (int e = value.length()- 1; e >= 0; e--)
            {
                System.out.print(array[e]);
            }
        }
        else 
            System.out.print("Type integer numbers only!\n");
    }
}
	
	

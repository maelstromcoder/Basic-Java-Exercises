public final class Date 
{
    private int Day, Month, Year;
    
    // Initializing the received values and redirecting in new method
    public Date(int day, int month, int year)
    {
        setDate(day,month,year);
    }
    
    public final void setDate(int day, int month, int year)
    {
    	// Identifying if day is out of bound from 1 to 31
        if (day <= 31 && day >= 1)
        {
            Day = day;
        }
        // Else return that day is invalid
        else 
        {
            Day = day;
            System.out.println("The day " + day + " is not a valid day.");
        }
        
        // Identifying if month is out of bound from 1 to 12
        if (month <= 12 && month >= 1)
        {
            Month = month;
        }
        // Else return that month is invalid
        else 
        {
            Month = month;
            System.out.println("The month " + month + " is not a valid month.");
        }
        
        // Setting boolean method to be compared in relational operator
        if (isLeapYear(year) == true)
        {
        	Year = year;
            System.out.println("The year "+ Year + " is a leap year.");
        }
        else 
        {
        	Year = year;
        	System.out.println("The year "+ Year + " is not a valid leap year.");
        }
        
    }
    
    // Identifying if year is divisible by 4
    public static boolean isLeapYear(int year)
    {
        return (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
    }
    
    // Returning final entry
    public String toString()
    {
        return "Your entry was " + Day + "/" +  Month + "/" + Year + ".";
    }
    
}

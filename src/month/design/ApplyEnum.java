package month.design;

public class ApplyEnum {

	/**
	 * Please design the following Feature in java.
	 */
	
		/*
		 * Create an Enum called Month,then create a class to use that Month Enum where you
		 * will implement a method using switch...case. Once the whole use able process is done,
		 * create an object in this main method to demonstrate the Enum feature in java.
		 */

Months month;
	
	public ApplyEnum(Months month){
		this.month = month;
	}

	public void whichMonthItIs(){
		switch(month){
		
		case JANUARY:
			System.out.println("Year starts");
			break;
		case FEBRUARY:
			System.out.println("Still it's very cold");
			break;
		case MARCH:
			System.out.println("Days are getting warmer");
			break;
		case APRIL:
			System.out.println("What a pleasant month");
			break;
		case MAY:
			System.out.println("Time to plan summer vacation");
			break;
		case JUNE:
			System.out.println("Where can we go for swimming");
			break;
		case JULY:
			System.out.println("HOT.VERY HOT. WE NEED TO BUY A NEW AC");
			break;
	
		case AUGUST:
			System.out.println("STILL VERY HOT. OUR NEW AC ARE WORKING WELL");
			break;
		case SEPTEMBER:
			System.out.println("FALL IS KNOCKING ON THE DOOR");
			break;
		
		case OCTOBER:
			System.out.println("EVERYTHING IS GETTING YELLOW");
			break;
			
		case NOVEMBER:
			System.out.println("DAYS ARE GETTING COOL");
			break;
		case DECEMBER:
			System.out.println("ERR. AGAIN WINTER IS BACK");
			break;
			
		
		default:
			System.out.println("MONTH doesnt exist. PLEASE CHECK IT");
			break;	
			
		}
	}

}



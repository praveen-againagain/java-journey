 /*class Switch 
{
	public static void main (String args[]) {

		int n = 9;

		switch(n) {

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wendsday");
			break;
		case 4:
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Not valid number");

		}
	}
}


class Switch 
{
	public static void main (String args[]) {

		String day = "sunday";
		String result = "";

		switch(day) {
          case "sunday","saturday" -> result = "9am";
	      default -> result = "6am";	


		}

		System.out.println(result);
    }
}*/


class Switch 
{
	public static void main (String args[]) {

		String day = "sunday";
		String result = "";

		result = switch(day) 
		 {

          case "sunday","saturday" : yield  = "9am";
	      default : yield = "6am";	


		};

		System.out.println(result);
    }
}
import java.util.Scanner;
	public class Sc {
		public static void main (String[] args){

			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the age: ");
			int age = scanner.nextInt();

			scanner.nextLine();

			System.out.print("Enter the name: ");
			String name = scanner.nextLine();

			System.out.print("Enter the cgpa: ");
			double cgpa = scanner.nextDouble();

			System.out.println("are you pass? (true/false):");
			boolean isPass =scanner.nextBoolean();

			System.out.println("you are " + age + "years old");
			System.out.println("Hello "+ name );
			
			System.out.println("you are cgpa is :" +cgpa);

			if(isPass){
				System.out.println("student is passed");
			}
			else {
				System.out.println("student is failed");
			}


			scanner.close();



		}
	}
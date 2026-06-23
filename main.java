import java.util.Scanner;
public class main {
	public static void main (String[] args){
    	Scanner scanner = new Scanner (System.in);

    	//calculate the volume of the rectagle

    	double wedth = 0;
    	double length = 0;
    	double hight = 0;
    	double volume = 0;
        
        System.out.print("Enter the wedth: ");
        wedth = scanner.nextDouble();

        Scanner scanner1 = new Scanner (System.in);

        System.out.print("Enter the length: ");
        length = scanner1.nextDouble();



        System.out.print("Enter the hight: ");
        hight = scanner1.nextDouble();

        volume =  wedth*length*hight;

        System.out.println("the volume is" + volume +"cm3");

        scanner.close();




    }
}
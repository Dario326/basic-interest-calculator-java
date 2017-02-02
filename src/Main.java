import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    Scanner user_input = new Scanner(System.in);
	    double principle;
        System.out.print("Enter the principle value");
        principle = user_input.nextInt();

        double time = 1;


	    double rate;
        System.out.print("Enter the interest rate");
        rate = user_input.nextDouble() / 12;


        double month1= principle * (1 + rate);
        double month2= (principle + month1) * (1 + rate)  ;
        double month3= (principle + month2) * (1 + rate);
        double month4= (principle + month3) * (1 + rate);
        double month5= (principle + month4) * (1 + rate);
        double month6= (principle + month5) * (1 + rate);


        System.out.println(principle);
        System.out.println(rate * 12);
        System.out.println(month6);

    }
}


package at.fhj.iit;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new CalculatorImpl();

        calc.addValue(20);	// currently highest number
        calc.addValue(4);	// currently lowester number
        calc.addValue(16);

        // add other integers

        // output lowest number

        System.out.println(calc.getMinimum());


        // output highest number

        // output sum of all numbers

    }

}

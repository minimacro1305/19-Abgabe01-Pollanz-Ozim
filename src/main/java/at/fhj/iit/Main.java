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


        System.out.println(calc.getMaximum());

        // output sum of all numbers
        System.out.println(((CalculatorImpl) calc).sum());

        //output 2 sum of all numbers
        System.out.println(((CalculatorImpl) calc).sum());
    }

}


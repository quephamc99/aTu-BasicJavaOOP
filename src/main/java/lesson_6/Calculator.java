package lesson_6;

public class Calculator {
    //method signature
    //Method Overloading
    public int sum(int a, int b){
        return  a+b;
    }

    public int sum(int a, int b, int c){
        return  a+b;
    }

    // Rest Parameters | varagrs
    public int sum(int a, int b, int... restNumbers){
        int total =0;
        for (int number: restNumbers) {
            total= total+ number;
        }
        return  a+b + total;
    }

    //When overloading happens in compile-time
    //Overriding happen - runtime
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1,2);
        calculator.sum(1,2,3,4,5);
        System.out.println( calculator.sum(1,2,3,4,5));
    }
}

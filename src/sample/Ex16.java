package sample;

public class Ex16 {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();

        calculation.execute(4, +, 3);
        calculation.execute(8, -, 4);
        calculation.execute(3, *, 8);
        calculation.execute(5, /, 2);
        calculation.execute(8, $, 3);


    }
}

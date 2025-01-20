package sample;

public class Calculation {
    private int firstNum;
    private char operator;
    private int secondNum;

        static int execute(int firstNum, char operator, int secondNum) {

            if(operator.equals(+,-,*,/)) {
                this.firstNum = firstNum;
                
                return (firstNum operator secondNum);
            }else {
                throw new java.lang.ArithmeticException();
            }
            
    }
}

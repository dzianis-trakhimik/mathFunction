import java.util.Scanner;

public class Program {
    private static final String INCORRECT_USER_INPUT_OF_NUMBER = "You wrote incorrect value. Can not be parsed to number.";
    private static final String WRITE_FIRST_NUMBER = "Write first number:";
    private static final String WRITE_SECOND_NUMBER = "Write second number:";
    private static final String WRITE_THIRD_NUMBER = "Write third number:";
    public static void main(String[] args) {
        MathWorker worker = new MathWorker();

        int number1 = requestNumberFromUser(WRITE_FIRST_NUMBER);
        int number2 = requestNumberFromUser(WRITE_SECOND_NUMBER);
        int number3 = requestNumberFromUser(WRITE_THIRD_NUMBER);
        String result = worker.getOperator(number1, number2, number3);

        System.out.printf("%d, %d, %d, operator is %s", number1, number1, number1, result);
    }

    static int requestNumberFromUser(String showText) {
        Integer result = null;
        do {
            System.out.println(showText);
            try {
                result = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.printf("%s Cause of error: value is:  %s \n", INCORRECT_USER_INPUT_OF_NUMBER, e.getMessage());
            }
        } while (result == null);

        return result;
    }
}

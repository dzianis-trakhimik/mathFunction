public class MathWorker {
    private static final String NONE_RESULT = "None";
    public String getOperator(int number1, int number2, int number3) {
        StringBuilder result = new StringBuilder();

        if (number1 + number2 == number3) {
            result.append("+");
        }
        if (number1 - number2 == number3) {
            result.append("-");
        }
        if (number1 * number2 == number3) {
            result.append("*");
        }
        if (number1 / number2 == number3) {
            result.append("/");
        }

        return result.isEmpty()
                ? NONE_RESULT
                : result.toString();
    }
}

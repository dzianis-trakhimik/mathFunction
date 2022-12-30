import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathWorkerTests {

    @Test
    public void get_operator_1_2_3() {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        String expectedResult = "+";

        String actualResult = new MathWorker().getOperator(number1, number2, number3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void get_operator_2_2_4() {
        int number1 = 2;
        int number2 = 2;
        int number3 = 4;
        String expectedResult = "+*";

        String actualResult = new MathWorker().getOperator(number1, number2, number3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void get_operator_3_minus3_minus9() {
        int number1 = 3;
        int number2 = -3;
        int number3 = -9;
        String expectedResult = "*";

        String actualResult = new MathWorker().getOperator(number1, number2, number3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void get_operator_1_2_minus1() {
        int number1 = 1;
        int number2 = 2;
        int number3 = -1;
        String expectedResult = "-";

        String actualResult = new MathWorker().getOperator(number1, number2, number3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void get_operator_3_3_1() {
        int number1 = 3;
        int number2 = 3;
        int number3 = 1;
        String expectedResult = "/";

        String actualResult = new MathWorker().getOperator(number1, number2, number3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void get_operator_7_1_11() {
        int number1 = 7;
        int number2 = 1;
        int number3 = 11;
        String expectedResult = "None";

        String actualResult = new MathWorker().getOperator(number1, number2, number3);

        assertEquals(expectedResult, actualResult);
    }
}
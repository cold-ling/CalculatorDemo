public class CalculatorLogic {
    private double result = 0;
    private String lastCommand = "=";

    public void calculate(double x, String command) {
        switch (lastCommand) {
            case "+":
                result += x;
                break;
            case "-":
                result -= x;
                break;
            case "*":
                result *= x;
                break;
            case "/":
                if (x == 0) {
                    throw new ArithmeticException("不能除以0！");
                }
                result /= x;
                break;
            case "=":
                result = x;
                break;
        }
        lastCommand = command;
    }

    public double getResult() {
        return result;
    }

    public void reset() {
        result = 0;
        lastCommand = "=";
    }

    public String getLastCommand() {
        return lastCommand;
    }
}
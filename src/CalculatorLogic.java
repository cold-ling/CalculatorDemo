public class CalculatorLogic {
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
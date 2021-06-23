package by.tms.servlet.calculator;

public class CalcService {
    public double calculate(double a, double b, String type) {
        switch (type) {
            case "sum":
                return sum(a, b);
            case "sub":
                return sub(a, b);
            case "mul":
                return mul(a, b);
            case "div":
                return div(a, b);
        }
        return 0;
    }

    private double sum(double a, double b) {
        return a + b;
    }

    private double sub(double a, double b) {
        return a - b;
    }

    private double mul(double a, double b) {
        return a * b;
    }

    private double div(double a, double b) {
        return a / b;
    }
}

// Summer 2024 OR Q:3(b)

interface Function {
    int evaluate(int value);
}

// Class implementing the Function interface
class Half implements Function {
    @Override
    public int evaluate(int value) {
        return value / 2;
    }
}

// Demo class to test the functionality
public class FunctionDemo {
    public static void main(String[] args) {
        Function halfFunction = new Half();

        int input = 20;
        int result = halfFunction.evaluate(input);

        System.out.println("Input: " + input);
        System.out.println("Half of input: " + result);
    }
}

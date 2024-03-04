package Calculator;

import java.util.Stack;

public class Calculator {
    public static int evaluateInfix(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                operands.push(c - '0');
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    evaluate(operands, operators);
                }
                operators.pop(); // Pop '('
            } else {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    evaluate(operands, operators);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            evaluate(operands, operators);
        }

        return operands.pop();
    }

    private static void evaluate(Stack<Integer> operands, Stack<Character> operators) {
        char operator = operators.pop();
        int operand2 = operands.pop();
        int operand1 = operands.pop();
        switch (operator) {
            case '+':
                operands.push(operand1 + operand2);
                break;
            case '-':
                operands.push(operand1 - operand2);
                break;
            case '*':
                operands.push(operand1 * operand2);
                break;
            case '/':
                operands.push(operand1 / operand2);
                break;
        }
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String expression = "3+5*2-8*56-21";
        int result = evaluateInfix(expression);
        System.out.println("Result: " + result);
    }
}

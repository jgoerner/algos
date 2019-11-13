package algos.examples;

import algos.adt.stack.LinkedListStack;
import algos.adt.stack.Stack;

/**
 * Class to evaluate (simple) arithmetic expressions
 * 
 * The algorithm used to evaluate the arithmetic expressions is based on the work
 * of E. W. Dijkstra. Allowed symbols include numbers, '+', '-', '*', '/', '(' and ')'.
 * All symbols have to be separated by exactly one whitespace.
 */
public class ExpressionEvaluator
{
    private Stack<String> operations = new LinkedListStack<String>();
    private Stack<Double> operands = new LinkedListStack<Double>();

    public double evaluate(String input){ 

        for(String s : input.split(" "))
        { 
            switch(s)
            {
                case "(":
                    // open brackets can be ignored 
                    break;
                case ")":
                    System.out.println("got closing brackets");
                    Double x = operands.pop();
                    Double y = operands.pop();
                    switch (operations.pop()){
                        case "+":
                            operands.push(x + y);
                            break;
                        case "-":
                            operands.push(x - y);
                            break;
                        case "*":
                            operands.push(x * y);
                            break;
                        case "/":
                            operands.push(x / y);
                            break;
                    }
                    break;
                case "+":
                    System.out.println("got +");
                    operations.push(s);
                    break;
                case "-":
                    System.out.println("got -");
                    operations.push(s);
                    break;
                case "*":
                    System.out.println("got *");
                    operations.push(s);
                    break;
                case "/":
                    System.out.println("got /");
                    operations.push(s);
                    break;
                default:
                    System.out.println("got number " + s);
                    operands.push(Double.parseDouble(s));
            }
        }
        // final iteration over remaining operations
        Double result = this.operands.pop();
        for (String op : this.operations) { 
            switch (op){
                case "+":
                    result = operands.pop() + result;
                    break;
                case "-":
                    result = operands.pop() - result;
                    break;
                case "*":
                    result = operands.pop() * result;
                    break;
                case "/":
                    result = operands.pop() / result;
                    break;
            }
        }
        return result; 
    }
}
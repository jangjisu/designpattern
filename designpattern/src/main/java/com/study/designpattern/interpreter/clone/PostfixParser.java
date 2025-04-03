package com.study.designpattern.interpreter.clone;

import java.util.Stack;

import static com.study.designpattern.interpreter.clone.PostfixExpression.*;

public class PostfixParser {
    public static PostfixExpression parse (String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }

        return stack.pop();
    }

    public static PostfixExpression parse2 (String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression2(c, stack));
        }

        return stack.pop();
    }

    private static PostfixExpression getExpression (char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+' -> {
                return new PlusExpression(stack.pop(), stack.pop());
            }

            case '-' -> {
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            }
            default -> {
                return new VariableExpression(c);
            }
        }
    }

    private static PostfixExpression getExpression2 (char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+' -> {
                return plus(stack.pop(), stack.pop());
            }

            case '-' -> {
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return minus(left, right);
            }
            default -> {
                return variable(c);
            }
        }
    }
}

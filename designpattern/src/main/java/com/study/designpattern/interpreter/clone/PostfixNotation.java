package com.study.designpattern.interpreter.clone;

import java.util.Stack;

public class PostfixNotation {
    private final String expression;

    public PostfixNotation(String expression) {
        this.expression = expression;
    }

    public static void main(String[] args) {
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();
    }

    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : expression.toCharArray()) {
            switch (c) {
                case '+' ->
                    numbers.push(numbers.pop() + numbers.pop());
                case '-' -> {
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                }
                default -> numbers.push(Integer.parseInt(c + ""));
            }
        }
    }
}

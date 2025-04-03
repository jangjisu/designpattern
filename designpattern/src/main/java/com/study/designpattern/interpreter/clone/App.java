package com.study.designpattern.interpreter.clone;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        int result = expression.interpret(Map.of('x',1, 'y',2, 'z',3));
        System.out.println(result);

        PostfixExpression expression2 = PostfixParser.parse2("xyz+-");
        int result2 = expression.interpret(Map.of('x',1, 'y',2, 'z',3));
        System.out.println(result2);
    }
}

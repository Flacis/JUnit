package ru.netologe;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = Calculator::apply;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

    private static Integer apply(Integer x, Integer y) {
        if (x > 0 && y > 0) {
            int i = x / y;
        }
        if (x == 0) {
            System.out.println("Деление на ноль невозможно");
            System.out.print("x = ");
            return x;
        } if (y==0) {
            System.out.println("Деление на ноль невозможно");
            System.out.print("y = ");
        }
        return y;
    }

    public static class Main {

        public static void main(String[] args) {
            Calculator calc = instance.get();
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1,1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        }
    }
}

package com.notes.learning.annotations;

public class Application {
    public static void main(String[] args) {
        NumberMan num = new NumberMan();
        num.setNum(2);
        num.setNum2(11);

        new ReflectionAnnotation().Apply(num);
    }
}

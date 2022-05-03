package com.notes.learning.annotations;

import java.util.Objects;

public class NumberMan {

    @ExampleIntNumber(type = NumberType.PAIR)
    private Integer num;

    @ExampleIntNumber(type = NumberType.ODD)
    private Integer num2;

    public Integer getNum() {
        return this.num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum2() {
        return this.num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public NumberMan() {

    }

    public NumberMan(Integer num, Integer num2) {
        this.num = num;
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberMan numberMan = (NumberMan) o;
        return Objects.equals(num, numberMan.num) && Objects.equals(num2, numberMan.num2);
    }


    @Override
    public int hashCode() {
        return Objects.hash(num, num2);
    }

    @Override
    public String toString() {
        return "NumberMan{" +
                "num=" + num +
                "num2=" + num2 +
                '}';
    }
}

package com.crazyEx;

public class Member<T> {
    private T name;
    private int age;
    private boolean gender;

    Member(T t, int memberAge, boolean memberGender) {
        name = t;
        age = memberAge;
        gender = memberGender;
    }

    void dance() {
        if (gender) {
            System.out.println("Dancing only woman");
        }
    }
}

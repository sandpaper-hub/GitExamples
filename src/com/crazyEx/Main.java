package com.crazyEx;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member<String>> crazyMembersList = new ArrayList<>();
        crazyMembersList.add(new Member<>("Anik", 30, false));
        crazyMembersList.add(new Member<>("Nika", 27, true));
    }
}

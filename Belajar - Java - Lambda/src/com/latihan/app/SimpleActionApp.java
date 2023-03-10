package com.latihan.app;

import com.latihan.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Faqih";
//            }
//        };
//
//        System.out.println(simpleAction1.action("Faqih"));
//
//        // Lambda
//        SimpleAction simpleAction2 = (String name) -> {
//            return "Faqih";
//        };
//
//        System.out.println(simpleAction2.action("Faqih"));

        SimpleAction simpleAction1 = (String value) -> {
            return "Hello" + value;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello" + name;
        };

        SimpleAction simpleAction3 = (String value) -> "Hello" + value;

        SimpleAction simpleAction4 = (value) -> "Hello" + value;

        SimpleAction simpleAction5 = value -> "Hello" + value;

    }
}

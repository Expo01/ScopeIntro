package com.company;

public class Main {

    public static void main(String[] args) {
        String privateVar = "this is privateVar that is private to main";
        System.out.println(privateVar);

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("this is the privateVar from ScopeCheck class" + scopeInstance.getPrivateVar());
        System.out.println(" ");
        scopeInstance.times();
        System.out.println(" ");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.times();

    }
}

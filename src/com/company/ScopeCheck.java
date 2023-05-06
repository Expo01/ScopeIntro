package com.company;

/**
 * Created by dev on 11/11/2015.
 */
public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public int getPrivateVar() {
        return privateVar;
    }

    public void times() {
        int privateVar = 2; //privateVar is variable new and local to the method and is in-scope
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " multiplied by method variable in ScopeCheck class is " + i * privateVar); //uses in-scope variable, not field variable of class
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " multiplied by field variable of ScopeCheck class is " + i * this.privateVar);
        }
    }

    public class InnerClass {
        private int privateVar = 3;

        public void times() {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + " times privateVar using inner class field variable is " + i * privateVar);
            }
            for(int i = 0; i<3; i++){
                System.out.println(i + " times privateVar calling back to outer class ScopeCheck field variable is " + i * ScopeCheck.this.privateVar);
            }
            System.out.println("now calling back to outer class times method from inner class");
          ScopeCheck.this.times();
        }
//...
    }
}

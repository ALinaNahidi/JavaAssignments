package com.assignment7;

public class Assignment7_5 {

    class class1{
        private String greet;

        public class1(String greet) {
            this.greet=greet;
        }
    }

}

class class2 extends Assignment7_5{
    class class3 extends class1{
        public class3(String greet) {
            super(greet);
        }
    }
}
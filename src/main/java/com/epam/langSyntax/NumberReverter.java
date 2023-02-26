package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int one=number%10;
        int ten=(number/10)%10;
        int hundred=number/100;
        System.out.println(one*100+ten*10+hundred);

    }

}

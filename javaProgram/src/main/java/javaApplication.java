import javaProblems.*;


import java.util.Scanner;

public class javaApplication {
    public static void main(String[] args) {

        //how Overloading of Methods in Class
        OverloadingMethods overloadingMethods = new OverloadingMethods();
        overloadingMethods.add(1,2);
        overloadingMethods.add(1,2,3);//overloading methods have the same name but different parameters

        //Overriding of Methods in Classes
        OverridingMethods overridingMethods = new OverridingMethods();
        overridingMethods.toString();//this method is overridden in the subclass

        //Show Use of Super Keyword in Class
        SuperKeywordImpl superKeyword = new SuperKeywordImpl();//this calls the constructor in the superclass
        superKeyword.superMethod();//this calls the super class method

    }
}

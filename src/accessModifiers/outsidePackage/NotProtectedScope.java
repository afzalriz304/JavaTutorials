package accessModifiers.outsidePackage;

import accessModifiers.innerPackage.ParentVariables;

public class NotProtectedScope {

    public static void main(String[] args) {
        ParentVariables parentVariables = new ParentVariables();
        System.out.println(parentVariables.publicExample);
    }
}

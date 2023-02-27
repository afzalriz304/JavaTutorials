package accessModifiers.outsidePackage;

import accessModifiers.innerPackage.ParentVariables;

/**
 * Hiding the internal details
 */
public class ProtectedScope extends ParentVariables {

    public static void main(String[] args) {
        ProtectedScope protectedScope = new ProtectedScope();
        System.out.println(protectedScope.protectedExample);
        System.out.println(protectedScope.publicExample);
    }
}

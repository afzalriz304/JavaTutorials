package accessModifiers.innerPackage;

public class DefaultScope {

    public static void main(String[] args) {
        /*DefaultScope defaultScope = new DefaultScope();
        System.out.println(defaultScope.defaultExample);
        System.out.println(defaultScope.protectedExample);
        System.out.println(defaultScope.publicExample);*/


        ParentVariables parentVariables = new ParentVariables();
        System.out.println(parentVariables.defaultExample);
        System.out.println(parentVariables.protectedExample);
        System.out.println(parentVariables.publicExample);
    }
}

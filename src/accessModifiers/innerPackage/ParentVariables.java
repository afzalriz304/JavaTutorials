package accessModifiers.innerPackage;

public class ParentVariables {

    /**
     * There are 4 types of access modifiers in Java
     * - scope of anything (class,method,instance/member variable)
     *
     * 1. default
     * syntax - "default" or {nothing/empty}
     *
     * 2. protected
     * syntax - "protected"
     *
     * 3. public
     * syntax - "public"
     *
     * 4. private
     * syntax - private
     */

    /*
    default
     */
    String defaultExample = "defaultExample";

    /*
    private
     */
    private String privateExample="privateExample";

    /*
    protected
     */
    protected String protectedExample="protectedExample";

    /*
    public
     */
    public String publicExample="publicExample";


    public static void main(String[] args) {
        ParentVariables parentVariables = new ParentVariables();
        System.out.println(parentVariables.privateExample);
    }


}

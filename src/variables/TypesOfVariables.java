package variables;


import Constant.ApplicationConstant;

import java.util.HashMap;
import java.util.Map;

/**
 * Types of Variables in Java
 * 1. Local - inside the method
 * 2. Instance - inside the class , in order to access instance variable we need to create object of that class
 * 3. Static - it load with class i.e. we can call them w/o creating object of the class
 */
public class TypesOfVariables {

    // static variable
    static int counter = 15;
    // instance variable/Member
    int number = 10;
    String name;
    //int local_a = 15;
    static int local_a = 15;

    public static void print() {
        // Local variable
        System.out.println(local_a);
        int local_a = 10;
        System.out.println(local_a);
        System.out.println("calling from static method " + counter);
        System.out.println("--------------------------End of print method -----------");
    }

    /**
     *
     * public - everyone can access
     * static - so that it can load and no need of creation object to call it
     * void - no return
     * main() - name of executable method in compiler
     */
    public static void main(String[] args) {
        print();
        TypesOfVariables obj = new TypesOfVariables();
        obj.calling1();
        //obj.calling();
        // calling instance variable
        System.out.println(obj.number);
        System.out.println(obj.name);

        System.out.println("Calling from main " + counter);

        // calling employee class instance variable
        System.out.println(Employee.company);
        System.out.println(ApplicationConstant.company);
        System.out.println(Employee.getPost());


        Employee employee = new Employee();
        // instance variable
        System.out.println(employee.name);
        System.out.println(employee.post);
        System.out.println(employee.getName());
    }

    public void calling1() {
        System.out.println("Calling from calling1 " + counter);
    }
}

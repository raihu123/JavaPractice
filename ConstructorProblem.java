class A{
    // A(){
    //     System.out.println("Default Constructor");
    // }
    A(int val){
        System.out.println("parameterised " + val);
    }
}

class B extends A{
    B(){
        // super();
        super(5); // THis will give compiler error as always super() or any version always first
        System.out.println("B Constructor");
        // super(5); // THis will give compiler error as always super() or any version always first
    }
}

/**
 * ConstructorProblem
 */
public class ConstructorProblem {

    public static void main(String... args) {
        A b = new B();
    }
}
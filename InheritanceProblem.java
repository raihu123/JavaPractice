public class InheritanceProblem {
    public static void main(String[] args) {
        A b = new B();
        b.methodA(); // methodAClassB
        // b.methodB();// THis will give compiler error
        B b2 = new B();
        b2.methodA(); // methodAClassB
        b2.methodB(); // method.B
    }
    
    static class A{
        void methodA(){
            System.out.println("method A");
        }
    }
    static class B extends A{
        void methodA(){
            System.out.println("methodAClassB");
        }
        void methodB(){
            System.out.println("method.B");
        }
    }
}
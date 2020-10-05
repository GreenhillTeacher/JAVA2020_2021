public class Problem11Pg56 {
    public static void main(String [] args){

        method1();// is a call to the method top
        System.out.println();
        method1();
        method2();
        method1();
    }
    //When you create a method you must make a call from main
    public static void method1(){
            System.out.println("*****");
            System.out.println("*****");
            System.out.println(" * *");
            System.out.println("  *");
            System.out.println(" * *");
    }
    public static void method2() {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println();
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}

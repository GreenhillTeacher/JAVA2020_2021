public class Rocket {
    public static void main(String [] args){
        top();// is a call to the method top
        bot();
        bot();
        top();
    }
    //When you create a method you must make a call from main
    public static void top(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void bot(){
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
}

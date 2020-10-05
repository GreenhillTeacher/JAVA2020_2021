public class Victory {
    public static void main(String [] args){
        for(int counter=0; counter <100; counter++){
            System.out.print("/");
        }
        System.out.println();
        myBox();
    }
    //When you create a method you must make a call from main
    public static void myBox(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

}

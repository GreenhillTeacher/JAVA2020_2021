public class ForLoopPractice {
    public static final int SIZE=7; // Static constant(final)
    public static void main(String [] args){
        System.out.println("+----+");
        for (int i = 1; i <= SIZE; i++) {
            printingStuff();
        }
        System.out.println("+----+");
        for (int i = SIZE; i > 0; i--) {
            printingStuff();
        }
        System.out.println("+----+");
    }

    // Make Method to print the lines
    public static void printingStuff(){
        System.out.println("\\    /");
        System.out.println("/    \\");
    }
}

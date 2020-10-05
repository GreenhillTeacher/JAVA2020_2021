/*
MAria Suarez
Learning Nested loops
09/29/2018
 */
public class NestedLoops {
    public static final int SIZE=10;// static constant or Variable
    // main
        // call line method
        // call the topShape method twice
        // call line method
         // call the buttom nethod twice
         // call line method
    // declare your line Method
    //       make your for loop depending on size
    public static void main(String [] args){
        for(int line =1; line <=SIZE; line++) {
            for (int dot = 1; dot <= -line + SIZE; dot++) {
                System.out.print(".");
            }
            System.out.print(line);
            for (int space = 1; space < 2 * line - SIZE + 3; space++) {
                System.out.print(" ");
            }
            // This is a branch
            // if something is true you add your statements here
            // else is whatever you need to do if it is no true
            if (line != 1) {
                System.out.println(line);
            }
            else
                System.out.println();// if it is only one statement you don't need brackets

        }

    }
}

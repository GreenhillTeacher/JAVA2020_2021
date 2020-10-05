public class StartBox {
    public static void main(String [] args){
        int size= ForLoopPractice.SIZE;
        for(int line=1; line <size; line++){
           myBox(line);
        }
    }
    //When you create a method you must make a call from main
    public static void myBox(int newline){ //This var name is unique

        for(int star=1; star <=newline; star++){
            makeSpace(star);
           System.out.print(newline);

        }
        System.out.println();
    }
    public static void makeSpace(int line){
        for(int space=1; space < ForLoopPractice.SIZE-line; space++){
            System.out.print(" ");
        }

    }
}

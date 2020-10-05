public class TestingVariables {
    public static void main(String [] args){
        //Declare
        byte num;
        int  intNum;
        //Declare and initialize
        short numShort=4;
        long numLong=999999999;
        float numfloat= 3f;
        double numDouble = 7;
        char letter ='d';
        //initialize
//        num=1;
//        intNum=1234;
//        System.out.println("These are my numbers my \nbyte Var = "+num+
//                " my\n int Var = " +intNum + "my\n short Var = "+numShort);
//        System.out.println("My float is "+ numfloat);
//        System.out.println("My double is "+ numDouble);
        int subtotal= 38+40+30;
        double tax = subtotal*0.08;
        float tips= subtotal*0.15f;

        System.out.printf("Subtotal: %8d  \n",subtotal);
        System.out.printf("Tax: \t %9.2f \n", tax);
        System.out.print("Tips:");
        System.out.println(tips);
        System.out.print("Total:");
        System.out.println(subtotal+tips+tax);
    }
}

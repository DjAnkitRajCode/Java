public class swapWithoutUsingThridVariable {
    public static void main(String args[]){
        int x=56, y=89;

        //Swap Two number using bitwise operator 
        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("x = " + x + " y = " + y);


        //Swap Two number in a single line
        x = (x*y)/ (y=x);
        System.out.println("x = " + x + " y = " + y);
    }
}
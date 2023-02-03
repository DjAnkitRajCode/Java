public class SingleDimArrayDemo {
    public static void main(String[] args){
        /* int a[] = new int[5]; //declaration
        //Inserting values into array
        a[0] = 100;
        a[1] = 200; */

        // Declared array without specifying size - Dynamic Array
        int a[] = {100,200,300,400,500};

        System.out.println(a.length); //Size of array

        System.out.println(a[2]);

        //classic for loop
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        };

        //for each loop/enhanced for loop
        for(int i:a){
            System.out.println(i);
        }
    }
}

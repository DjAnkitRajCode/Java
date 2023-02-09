public class EvenNumbersInArray {
    public static void main(String args[]){
        int a[] = {1,4,6,7,9,3};
        
        System.out.println("For even number...................");
        for(int i:a){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("For odd number...................");
        for(int i:a){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

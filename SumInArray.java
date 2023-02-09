public class SumInArray {
    public static void main(String args[]){
        int a[] = {10,20,30,40,50,50};
        int num = 0;
        
        for(int i:a){
            num = i + num;
        }
        System.out.println(num);
    }
}

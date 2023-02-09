public class SearchElementInArray {
    public static void main(String args[]){
        int num = 40;
        int arr[] = {10,20,30,40,50};
        boolean flag = false;
        // sir solution
        for(int i:arr){
            if(i==num){
                System.out.println("Number exist");
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
        //my
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                System.out.println("Number exist");
            }
        }
        

    }
}

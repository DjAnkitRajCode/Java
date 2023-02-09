public class TwoDimArrayDemo {
    public static void main(String[] args){
        //declare array
        // int a[][] = new int[3][2];
        // int [][]b = new int[3][2];
        // int []c[] = new int[3][2];

        // a[0][0] = 100;
        // a[0][1] = 200;

        // a[1][0] = 300;
        // a[1][1] = 400;

        // a[2][0] = 500;
        // a[2][1] = 600;

        int a[][] = {{100,200},{300,400},{500,600}};

        System.out.println("Number of rows:" +a.length);
        System.out.println("Number of Column:" +a[0].length);

        for(int i=0; i<a.length; i++){ //i represents row index i=0
            for(int j=0; j<a[i].length; j++){ //j column index j=0
                System.out.print(a[i][j]);
            }
            System.out.println();//break the line
        }

        for(int r[]:a){
            for(int i:r){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}

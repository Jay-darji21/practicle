// Write a java program to print an entire array

public class que5 {
    public static void main(String[]args){
        int n[] = {1,2,3,4,5};
        for(int a : n){
            System.out.print(a +" ");
        }
        System.out.println();
        System.out.println("2d array");
        int nums[][] = {
            {2,3,4,5,5},
            {5,3,9,5},
            {1,2,3}
        };
        for(int b[] : nums){
            for(int c : b){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

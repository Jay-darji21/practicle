// Write a java program to print the sum of all elements in array

public class que3 {
    public static void main(String[]args){
        int nums[] = {2,4,7,4,8,9};
        int sum = 0;
        for(int n : nums){
            sum = sum + n;
        }
        System.out.println("Sum of an array : " + sum);

        int sum1 = 0;

        int n1[][] = {
                        {2,3,4,5,5},
                        {5,3,9,5},
                        {1,2,3}
                    };

            for(int i[] : n1 ){
                for(int j : i){
                    sum1 = sum1+j;
                }
            }
            System.out.println("Sum of an array :" + sum1);
    }
}

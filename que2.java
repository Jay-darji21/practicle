//  Write a program to create an object which containes the method and call them method in main method
class Calc{
    public int add(int a , int b){
         int result = a+b;
         return result; 
    }

    public String join(String a , String b){
        String str = a+b;
        return str;
    }

    public double mul(double a , double b){
        double res= a + b;
        return res;
    }
}



public class que2{
    public static void main(String[]array){
        Calc obj = new Calc();
        int result = obj.add(5,6);
        String str = obj.join("Jay" , " Darji");
        double res = obj.mul(4.3,5.6);

        System.out.println(result);
        System.out.println(str);
        System.out.println(res);

    }
}
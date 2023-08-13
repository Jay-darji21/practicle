// Write a program to demonstrate the method overLoading with three different parameters

class Calc{
    public void show(byte n){
        System.out.println("Byte " + n);
    }
    public void show(float n){
        System.out.println("float " + n);
    }
    public void show(double n){
        System.out.println("double " + n);
    }
    public void show(short n){
        System.out.println("short " + n);
    }
    public void show(int n){
        System.out.println("int " + n);
    }
}

public class que1 {

    public static void main(String[]args){

        
        Calc obj = new Calc();
        obj.show(2);
    }
        
}

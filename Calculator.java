package Lab4;

public class Calculator {
    public int calculate(int a,int b){
        return a+b;
    }
    public float calculate(float a, float b){
        return a-b;
    }
    public int calculate(int a, int b, char op){
        if(op == '*'){
            return a*b;
        }else{
            return -1;
        }
    }
    public double calculate(double  a, double b){
        return a/b;
    }
    public static void main(String[] args){
        Calculator c = new Calculator();
        int add = c.calculate(5, 6);
        float sub = c.calculate(6, 4);
        int mul = c.calculate(4, 2);
        double div = c.calculate(3, 4, '*');

        System.out.println("Addition :"+add);
        System.out.println("Subtraction :"+sub);
        System.out.println("Multiplication :"+mul);
        System.out.println("Division :"+div);

    }

}

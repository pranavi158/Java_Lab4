package Lab4;

public class Calculator3 {
    int a;
    int b;
    String op;
    Calculator3(){
        this.a = 0;
        this.b = 0;
        this.op = null;
        System.out.println("a value : "+a+"\nb value : "+b+"\nop value : "+op);
    }
    Calculator3(int a,int b){
        this.a = a; 
        this.b = b;
        System.out.println(a+b);
    }
    Calculator3(int a, int b, String op){
        this.a = a; 
        this.b = b;
        this.op = op;
        if(op.equals("+")){
            System.out.println("Addition:"+(a+b));
        }else if(op.equals("-")){
            System.out.println("Subtraction:"+(a-b));
        }
        else if(op.equals("*")){
            System.out.println("Multiplication :"+(a*b));
        }
        else if(op.equals("/")){
            System.out.println("Division :"+(a/b));
        }else{
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {
        System.out.println("Constructor 1:");
        Calculator3 c1 = new Calculator3();
        System.out.println();
        System.out.println("Constructor 2:");
        Calculator3 c2 = new Calculator3(5, 9);
        System.out.println();
        System.out.println("Constructor 3:");
        Calculator3 c3 = new Calculator3(6, 2, "*");
    }
}

package concept_this;

public class ThisCalssFun {
    int a;
    int b;

    public  void setData(int a,int b){

        this.a=a;
        this.b=b;

    }

    public static void main(String args[]){

        ThisCalssFun fun=new ThisCalssFun();
        fun.setData(10,5);
        System.out.println(fun.a);
        System.out.println(fun.b);
    }
}

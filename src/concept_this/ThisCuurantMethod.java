package concept_this;

public class ThisCuurantMethod {


    public void M(){
        System.out.println("M in");
    }
     void callM(){

        this.M();
     }

    public static void main(String ags[]){

        ThisCuurantMethod thisCuurantMethod=new ThisCuurantMethod();
        thisCuurantMethod.callM();
    }

}

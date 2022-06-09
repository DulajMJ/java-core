package concept_this;

public class CallDefaultConstrutor {

    CallDefaultConstrutor(){
        System.out.println("IN");
    }
    CallDefaultConstrutor(int y){this();}

    public static void main(String arg[]){
        CallDefaultConstrutor construtor=new CallDefaultConstrutor(10);

    }
}

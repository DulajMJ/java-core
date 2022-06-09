package concept_static;

public class Employee {
    private  int id;
    private String name;
    private static String department="LL";
    public static final String companyName="Google";

    static {

        System.out.println("static block Excuted");
        department="MM";
        System.out.println("Deparment update from static block-->"+department);
    }

    public static void staticMethoda(){

        final String v="10";
        String b="";
        int a=0;


        System.out.println("Static methoda excuted.");
        department="QA";
        System.out.println("Deparment update from static method-->"+department);
    }
    static class Inner{

        public void test(){
            System.out.println("inside calls"+department);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                "companyName=" + companyName +
                ", name='" + name + '\'' +
                '}';
    }
}

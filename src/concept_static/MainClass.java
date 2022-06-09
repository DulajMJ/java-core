package concept_static;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(Employee.companyName);
        Employee.staticMethoda();

        Employee.Inner inner=new Employee.Inner();
        inner.test();

    }
}

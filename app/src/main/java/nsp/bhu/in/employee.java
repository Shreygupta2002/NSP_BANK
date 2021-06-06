package nsp.bhu.in;

public class employee {
    private String name;
    private String id;
    private String designation;
    private int age;

    public employee(String name, String id, String designation, int age) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.age = age;
    }

    public void display_details() {
        System.out.println("NAME : " + this.name);
        System.out.println("ID : " + this.id);
        System.out.println("DESIGNATION : " + this.designation);
        System.out.println("AGE : " + this.age);
        System.out.println("");
    }

    public String getEmployeeId() {
        return this.id;
    }
}
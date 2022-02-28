package org.java.spring.beans;

public class Employee {

    private int eid;
    private String eName;
    private String eSalary;
    private Address address;

    public Employee() {
        System.out.println("--Object created--");
    }

    public Employee(Address addr) {
        System.out.println("--set by the Constructor--");
        this.address = addr;
        System.out.println("--Object created--");
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        System.out.println("--Address set by the setter--");
        this.address = address;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteSalary() {
        return eSalary;
    }

    public void seteSalary(String eSalary) {
        this.eSalary = eSalary;
    }

    public void init() {
        System.out.println("Created");
    }

    public void destroy() {
        System.out.println("Destroyed.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", eSalary='" + eSalary + '\'' +
                ", address=" + address +
                '}';
    }
}

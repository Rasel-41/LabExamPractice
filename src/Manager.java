public class Manager extends Employee{
    private String department;
    public Manager(String name,double salary,String department){
        super(name, salary);
       this.department = department;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return super.toString()+",Department is: "+department;
    }
}

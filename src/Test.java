public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("jassi",10000);
        Manager manager = new Manager("Tasnim",15000,"Mathematics");
        Executive executive = new Executive("Sristy",20000,"CSE");
        System.out.println(employee);
        System.out.println(manager);
        System.out.println(executive);
    }
}

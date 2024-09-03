// Q No: 03 Employee Management
class Employee {
    private String name;
    private int ID;
    protected double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
class Developer extends Employee {
    private int projectsHandled;

}
class Tester extends Employee {
    private double allowance;
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    @Override
    public double getSalary() {
        return super.getSalary() + allowance;
    }
}
public class Employees {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setSalary(50000); 
        manager.setBonus(10000);
        Developer developer = new Developer();
        developer.setSalary(40000); 
        Tester tester = new Tester();
        tester.setSalary(35000); 
        tester.setAllowance(5000); 
        double totalSalary = manager.getSalary() + developer.getSalary() + tester.getSalary();
        System.out.println("Total salary for all employees: " + totalSalary);
    }
}


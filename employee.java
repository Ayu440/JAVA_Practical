public class employee {
    private String name;
    private double salary;

    public employee(String n, double s) {
        setName(n);
        setSalary(s);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void increaseSalary(double percent) {
        if (percent > 0) {
            double newSalary = getSalary() + (getSalary() * percent / 100);
            setSalary(newSalary);
        }
    }

    public static void main(String[] args) {
        employee emp = new employee("Ayush", 30000);
        emp.increaseSalary(20);
        System.out.println("Name: " + emp.getName());
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}

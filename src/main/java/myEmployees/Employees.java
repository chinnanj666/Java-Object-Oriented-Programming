package myEmployees;
class Employee{
    private int ID;
    private String name;
    private double salary;

    public Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public java.lang.String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Manager extends Employee {
    private String teamName;


    public Manager(int ID, String name, double salary, String teamName) {
        super(ID, name, salary);  // Call the parent class constructor
        this.teamName = teamName;
    }


    public String getTeamName() {
        return teamName;
    }


    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
class Directors extends Manager {
    private String businessUnit;

    public Directors(int ID, String name, double salary, String teamName, String businessUnit) {
        super(ID, name, salary, teamName);
        this.businessUnit = businessUnit;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }


    @Override
    public String toString() {
        return "Directors{" +
                "ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", Salary= '" + getSalary() + '\'' +
                ", teamName='" + getTeamName() + '\'' +
                ", businessUnit='" + businessUnit + '\'' +
                '}';
    }
}

class SalaryUtility {
    public static void incrementSalary(Employee obj) {
        if (obj instanceof Manager) {
            obj.setSalary(obj.getSalary() * 1.10);
        } else {
            obj.setSalary(obj.getSalary() * 1.10);
        }
    }
}


class Salarryutility{
    public  static  void  incermentSalary(Employee obj){
        if (obj instanceof Manager){
            obj.setSalary(obj.getSalary()*.30 + obj.getSalary());
        } else if (obj instanceof  Employee) {
            obj.setSalary((obj.getSalary()) * .10 + obj.getSalary());
        }
         else if (obj instanceof  Directors) {
             obj.setSalary(obj.getSalary() * .5 + obj.getSalary());
        }
    }
}

public class Employees {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"qwen", 100.0);
        Manager manger = new Manager(2,"hello", 100.0, "abcdTeam");
        Directors directors = new Directors(1,"dr.dc",100.0, "Devlvelopement", "Sales" );
        System.out.println(employee instanceof Employee); // true
        System.out.println(manger instanceof  Employee); // true
        System.out.println(employee instanceof Manager); // false
        Salarryutility.incermentSalary(employee);
        System.out.println(employee);
        Salarryutility.incermentSalary((manger));
        System.out.println(manger);
        Salarryutility.incermentSalary(directors);
        System.out.println(directors);

        System.out.println( directors instanceof  Manager); // true
    }
}

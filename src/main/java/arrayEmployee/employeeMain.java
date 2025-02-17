package arrayEmployee;

public class employeeMain {
    public static void main(String[] args) {
        employee  obj1 = new employee(12, "joy", 2000.00);
        employee obj2 = new employee(21, "roy", 20000.0);
        employee obj3 = new employee(32, "dc", 20000.9);
        employee [] myemployeeList = {obj3, obj2, obj1};
//         double sum = 0;
//        String name = "";
        double total = 0;
        for (employee i : myemployeeList) {
            total += i.getSalary();
        }
        System.out.println(total);
        System.out.println(total/myemployeeList.length);
//        System.out.println(" My Highest salary: " + highest );
////        System.out.println(sum);

//        employee highestPaidEmployee = myemployeeList[0];
//
//        for (employee i : myemployeeList) {
//            if (i.getSalary() > highestPaidEmployee.getSalary()) {
//                highestPaidEmployee = i;
//            }
//        }
//
//        System.out.println("lowest paid employee: " + highestPaidEmployee.getName() +
//                "  \nsalary: " + highestPaidEmployee.getSalary());
    }
    }


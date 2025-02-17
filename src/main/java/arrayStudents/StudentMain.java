package arrayStudents;

public class StudentMain {
    public static void main(String[] args) {
        Student  obj = new Student(1, "joy","A");
        Student obj1 = new Student(2, "dc", "C");
        Student obj2 = new Student(4,"Marvels", "" );
        Student obj4 = new Student(5,"ABCD", "S+" );
        Student obj3 = new Student(3,"kiru", "A" );

        Student [] myListOfStudent = {obj, obj1, obj2,obj3, obj4};

        for (Student listof: myListOfStudent){
            System.out.println(listof);
        }
        int count  = 0;
        for ( Student i: myListOfStudent){
            if (i.getGarde() =="A"){
                count += 1;
                System.out.println( "The name who are having A: \t" + i.getName() +"\nThe Grade is:\t"+ i.getGarde());
            }
            else {
                count = 1;
            }
        }
    }
}

package abstactOfAbstarctclass;

public  class classMain {
    public static void main(String[] args) {
        A obj  = new A() {
            @Override
            public void module01() {
                System.out.println("hello, This is Module01");
            }
            @Override
            public void module1() {
                System.out.println("Module 1");
            }
        };
        obj.module01();
        obj.module1();



    }
}

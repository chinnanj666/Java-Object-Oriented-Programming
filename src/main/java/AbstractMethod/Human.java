package AbstractMethod;

abstract class Human {
    public void  heartBeat(){
        System.out.println("This is a concerte method, Which is similar for man, woman");
    }
    public  abstract void speakingTone(); // properties which are not same, will be implemented in the class that extend the abstract class, can implement.
    public  abstract void shopping();
}

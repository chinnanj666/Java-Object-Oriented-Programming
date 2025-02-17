package AbstractMethod;

public class HumanMain {
    public static void main(String[] args) {
        System.out.println("-------This is for Man------------------");
        Human obj = new Men();
        obj.heartBeat();
        obj.shopping();
        obj.speakingTone();
        System.out.println();
        System.out.println("----------This is for Woman--------------------");
        Human obj1 =new Women(); //possiable if your using  inheritance
        obj1.heartBeat();
        obj1.shopping();
        obj1.speakingTone();  // just like inheritance

    }
}

package bikeCollections;

abstract class Bike {
    private  int distanceTravelled;

    public Bike(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
    public  abstract  int theMilleage();

    public  int getFuleNeeded(){
        return  distanceTravelled/theMilleage();
    }
}

package bikeCollections;

 class Kawasaki  extends  Bike{
     public Kawasaki(int distanceTravelled) {
         super(distanceTravelled);
     }

     @Override
     public int theMilleage() {
         return 10; //millage of the bike
     }

//     @Override
//     public int getFuleNeeded() {
//         return super.getFuleNeeded();
//     }
 }

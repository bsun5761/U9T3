public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }
  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Total fare collected: " + fareCollected);
  }

  public boolean chargeAndDropOffRiders(double farePerRider) {
    int num=0;
    double total = num* farePerRider;
    fareCollected+= total;
    boolean dropped = dropOffPassengers(num);
    return dropped;
  }


}
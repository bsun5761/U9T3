public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric()
  {
    return electric;
  }

  public boolean dropOffPassengers(int numOut) {
    if (numOut > getPassengers()) {
      return false;
    } else {
      setPassengers(numOut);
    }
    return true;
  }

    public void applyDiscount ( double percent)
    {
      if (discountApplied = false) {
        setTollFee(percent);
      }
      discountApplied = true;
    }

    public boolean isDiscountApplied ()
    {
      return discountApplied;
    }

    public void printCar ()
    {
      System.out.println("License Plate: " + getLicensePlate());
      System.out.println("Toll Fee: " + getTollFee());
      System.out.println("Passengers: " + getPassengers());
      System.out.println("Is Elecric: " + electric);
      System.out.println("Discount: " + discountApplied);
    }
  }
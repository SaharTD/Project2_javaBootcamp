import java.util.ArrayList;

public abstract class Passenger {
     String name;
     String id;
     double tripCost;
    Car car;

    public Passenger(Car car) {
        this.car = car;
    }

    public Passenger( Car car, String id, String name) {
        this.id = id;
        this.name = name;
        this.car = car;

    }

    public Passenger(Car car, String id, String name, double tripCost) {
        this.car = car;
        this.id = id;
        this.name = name;
        this.tripCost = tripCost;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car ) {
        this.car = car;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    abstract void carReserve(Car car) throws Exception;
    abstract double costCalculations(Car car) ;



    public void displayInfo()  {

         System.out.println("\n Passenger" +
                 "\n Reversed Car information:"+this.getCar()+
                  "\n name :"+name+
                  "\n passenger ID :"+id+
                  "\n Trip Final Cost :"+getTripCost()

         );
     }

}

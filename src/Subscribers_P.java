import java.util.ArrayList;

public class Subscribers_P extends Passenger{
    public Subscribers_P(Car car) {
        super(car);
    }

    public Subscribers_P(Car car,String id, String name) {
        super( car,id, name);

    }

    public Subscribers_P(Car car, String id, String name, int tripCost) {
        super(car, id, name, tripCost);
    }





    // defided into 2 methods one to calc and one to reserve and check the reserved methods return car and the call the calc methods
    @Override
   public void carReserve (Car car) throws Exception {
        try {
            if (car.getMax_capacity() != 0) {
                this.setCar(car);
                car.reduceCapacity();
                this.setTripCost(costCalculations(car));
                System.out.println("Car reserved successfully for :"+this.getName());

            }  else if (car.getMax_capacity() == 0){
                this.setCar(null);
                throw new Exception("\n Note:No capacity available for passenger " + this.getName());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double costCalculations(Car car) {
        tripCost = car.fixed_route.getTripPrice() - (car.fixed_route.getTripPrice() * 0.5);
        return tripCost;

    }


    public void displayInfo() {
        if(this.car!=null) {
            System.out.println("\n Passenger" +
                    "\n Reversed Car information :" + this.getCar() +
                    "\n name :" + name +
                    "\n passenger ID :" + id +
                    "\n Trip Final Cost :" + this.tripCost +
                    "\n Arrival :" + car.fixed_route.getS_pickupAddress() +
                    "\n Start destination :" + car.fixed_route.getDestination_Address()
            );
        }else System.out.println(this.getName()+" has no car reservation");
    }


}

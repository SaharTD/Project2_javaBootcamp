import java.util.ArrayList;

public class Non_Subscribers extends Passenger {

    private boolean discount;





    public Non_Subscribers(Car car, String id, String name, boolean discount) {
        super( car ,id, name);
        this.discount = discount;
    }


    @Override
    public void carReserve (Car car) throws Exception {
        try {
            if (car.getMax_capacity() != 0) {
this.setCar(car);
car.reduceCapacity();
this.setTripCost(costCalculations(car));
                System.out.println("Car reserved successfully for :"+this.getName());
            } else if (car.getMax_capacity() == 0){
                this.setCar(null);
                throw new Exception("\n Note:No capacity available for passenger : "+this.getName());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double costCalculations(Car car) {
            if (discount) {
                tripCost = car.fixed_route.getTripPrice() - (car.fixed_route.getTripPrice() * 0.1);
                return tripCost;

            } else {
                tripCost = car.fixed_route.getTripPrice();
                return tripCost;

            }
        }

        public void displayInfo()  {
            if(this.car!=null) {
                System.out.println("\n Passenger" +
                        "\n Reversed Car information :" + this.getCar() +
                        "\n name :" + name +
                        "\n passenger ID :" + id +
                        "\n Trip Final Cost :" + this.tripCost +
                        "\n Arrival :" + car.fixed_route.getS_pickupAddress() +
                        "\n Start destination :" + car.fixed_route.getDestination_Address());

            }else System.out.println(this.getName()+" has no car reservation");

        }



}

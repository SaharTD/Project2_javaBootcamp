public class Subscribers_P extends Passenger{

    public Subscribers_P(Car car, String id, String name) {
        super(car, id, name);
    }

    public Subscribers_P(Car car, String id, String name, int tripCost) {
        super(car, id, name, tripCost);
    }

    @Override
    double carReserve (Car car) throws Exception {
        try {
            if (car.getMax_capacity() != 0) {
                tripCost = car.fixed_route.getTripPrice() - (car.fixed_route.getTripPrice() * 0.5);
                return tripCost;
            } else throw new Exception("The maximum capacity of the car was equal to zero ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The trip cost was not calculated for passenger "+this.name);
        return tripCost;
    }



    public void displayInfo() throws Exception {
        System.out.println("\n Passenger" +
                "\n Car Code :"+car.getCode()+
                "\n name :"+name+
                "\n passenger ID :"+id+
                "\n Trip Cost :"+carReserve(this.car)+
                "\n Arrival :"+car.fixed_route.getS_pickupAddress()+
                "\n Start destination :"+car.fixed_route.getDestination_Address()
        );
    }


}

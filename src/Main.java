import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {


        Route r1= new Route ("EBank","KAFD",88);
        Route r2= new Route ("Dorm","Play Ground",50);

        Car c1 = new Car("2200",r1,0);
        Car c2 = new Car ("0044",r2,2);



        ArrayList<Passenger> passengerList =new ArrayList<>();
            Passenger p1= new Subscribers_P(c1,"2222","Sahar Turki");
            Passenger p2= new Non_Subscribers(c2,"4444","Osama Turki",true);
           Passenger p3= new Non_Subscribers(c2,"4554","Ahmad ",false);
           Passenger p4= new Non_Subscribers(c2,"4334","Sara ",false);

        passengerList.add(p1);
        passengerList.add(p2);
        passengerList.add(p3);
        passengerList.add(p4);




        for (Passenger passenger : passengerList) {
            try {
passenger.carReserve(passenger.getCar());
                passenger.displayInfo();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            }







    }
}

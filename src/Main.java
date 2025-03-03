import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {


        Route r1= new Route ("Home","KAFD",88);
        Route r2= new Route ("Work","Play Ground",50);

        Car c1 = new Car("2200",r1,0);
        Car c2 = new Car ("0044",r2,3);


        ArrayList<Passenger> passengerList =new ArrayList<>();
        Passenger p1= new Subscribers_P(c1,"2222","Sahar Turki");
        Passenger p2= new Non_Subscribers(c2,"4444","Osama Turki",true);

        passengerList.add(p1);
        passengerList.add(p2);

        for (int i = 0; i < passengerList.size(); i++) {
            passengerList.get(i).displayInfo();
        }






    }
}
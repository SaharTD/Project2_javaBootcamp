public class Route {


    private String s_pickupAddress;
    private String destination_Address;
    private int tripPrice;

    public Route() {
    }

    public Route(String destination_Address, String s_pickupAddress, int tripPrice) {
        this.destination_Address = destination_Address;
        this.s_pickupAddress = s_pickupAddress;
        this.tripPrice = tripPrice;
    }


    public String getDestination_Address() {
        return destination_Address;
    }

    public void setDestination_Address(String destination_Address) {
        this.destination_Address = destination_Address;
    }

    public String getS_pickupAddress() {
        return s_pickupAddress;
    }

    public void setS_pickupAddress(String s_pickupAddress) {
        this.s_pickupAddress = s_pickupAddress;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }


    @Override
    public String toString() {
        return "Route{" +
                "Arrival Destination : " + destination_Address + '\'' +
                "Start Destination :" + s_pickupAddress + '\'' +
                ", Trip Price :" + tripPrice +
                '}';
    }
}

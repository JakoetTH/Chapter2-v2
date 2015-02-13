
public class Ticket {
    private double price;
    private String flight;
    private String passenger;

    public Ticket(double price, String flight,String passenger) {
        this.price = price;
        this.flight = flight;
        this.passenger = passenger;
    }

    public double getPrice() {
        return this.price;
    }
    public String getFlight() {
        return this.flight;
    }
    public String getPassenger()
    {
        return this.passenger;
    }
    public static void main(String[]args){

        Ticket tick = new Ticket(2000.25,"AD2-E","James");
        System.out.println(tick.getPrice());
        System.out.println(tick.getFlight());
        System.out.println(tick.getPassenger());
    }
}
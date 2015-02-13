
public class Flight {
    private String day;
    private String destination;
    private String departure;
    private String [] aeroplane;
    public Flight(String day, String destination, String departure, String [] aeroplane)
    {
        this.day = day;
        this.destination = destination;
        this.departure = departure;
        this.aeroplane = aeroplane;
    }

    public String getDay()
    {
        return this.day;
    }
    public String getDestination()
    {
        return this.destination;
    }
    public String getDeparture()
    {
        return this.departure;
    }
    public String [] getAero()
    {
        return this.aeroplane;
    }
    public static void main(String[]args)
    {
        String [] Aeroplanes = {"A2D-E","F42-D","AS3-C","CDF-B","TSG-A"};
        Flight fly = new Flight("Tuesday","Sydney","Johannesburg",Aeroplanes);
        System.out.println(fly.getDay());
        System.out.println(fly.getDestination());
        System.out.println(fly.getDeparture());
    }
}

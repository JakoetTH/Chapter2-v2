
public class Passenger {
    private int ID;
    private String name;

    public Passenger(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args)
    {
        Passenger pass = new Passenger(212087266,"Thawhir");
        System.out.println(pass.getID());
        System.out.println(pass.getName());
    }

}

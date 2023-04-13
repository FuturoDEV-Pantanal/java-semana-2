public class Rocket {
    private String name;
    private double fuelLevel;
    private double altitude;
    
    public Rocket(String name) {
        this.name = name;
    }
    
    public void launch() {
        fuelLevel = 100.0;
        altitude = 0.0;
        System.out.println(name + " has launched!");
    }
    
    public String getInfo() {
        return name + ", Fuel Level: " + fuelLevel + ", Altitude: " + altitude;
    }
}

public class Main {
    public static void main(String[] args) {
        Rocket r = new Rocket("Falcon 9");
        r.launch(); // Output: Falcon 9 has launched!
        System.out.println(r.getInfo()); // Output: Falcon 9, Fuel Level: 100.0, Altitude: 0.0

        Rocket s = new Rocket("Crew Dragon");
        s.launch(); // Output: Crew Dragon has launched!
        System.out.println(s.getInfo()); // Output: Crew Dragon, Fuel Level: 100.0, Altitude: 0.0

        Rocket sat = new Rocket("GOES-R");
        sat.launch(); // Output: GOES-R has launched!
        System.out.println(sat.getInfo()); // Output: GOES-R, Fuel Level: 100.0, Altitude: 0.0
    }
}

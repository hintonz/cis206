public class Mountain {


    private String name;
    private String country;
    private int elevation;

    public Mountain(String name, String country, int elevation) {
      this.name = name;
      this.country = country;
      this.elevation = elevation;
    }

    

    public void setName(String name) {    //Setter for Name
        this.name = name;
    }

    public void setCountry(String country) {   //Setter for Country
        this.country = country;
    }

    public void setElevation(int elevation) { //Setter for Elevation
        this.elevation = elevation;
    }

    

    public String getName() {                  //Getter for Name
        return name;
    }

    public String getCountry() {              //Getter for Country
        return country;
    }
    
    public int getElevation() {                //Getter for Elevation
        return elevation;
    }

    public static double toMeters(double elevationInFeet) {      //Function call Feet to Meters

        final double FEET_TO_METERS = 1 / 3.2808;
        return elevationInFeet * FEET_TO_METERS;
    }

}

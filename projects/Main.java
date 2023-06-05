public class Main {

    public static Mountain minElevation(Mountain mountains[]) {                                          //Function to set minimum Elevation

        int minIndex = 0;
        for (int i = 0; i < mountains.length; i++) {
            if (mountains[i].getElevation() < mountains[minIndex].getElevation()) {
                minIndex = i;
            }
        }
        return mountains[minIndex];
    }

    public static void main(String[] args) {


        Mountain mountains[] = new Mountain[7];
        mountains[0] = new Mountain("Chimborazo", "Ecuador", 20549);
        mountains[1] = new Mountain("Matterhorn", "Switzerland", 14692);
        mountains[2] = new Mountain("Olympus", "Greece", 9573);
        mountains[3] = new Mountain("Everest", "Nepal", 29029);
        mountains[4] = new Mountain("Mount Marcy - Adirondacks", "United States", 5344);
        mountains[5] = new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684);
        mountains[6] = new Mountain("Zugspitze", "Switzerland", 9719);

        System.out.printf("%-30s%-20s%10s%20s\n",                                                           //Information table with formatting
                "Mountain","Country","Elevation (ft)", "Elevation (m)"

                );
        for (Mountain mountain : mountains) {                                                               //Print function loop with formatting

            System.out.printf("%-30s%-20s%10d%20.2f\n",
                    mountain.getName(), mountain.getCountry(), mountain.getElevation(),                     
                    Mountain.toMeters(mountain.getElevation())
            );
        }
        
        Mountain smallest = minElevation(mountains);
        System.out.println("\nShortest Mountain:");
        System.out.println(smallest.getName());
        System.out.println("Elevation (ft): " + smallest.getElevation());

    }
}

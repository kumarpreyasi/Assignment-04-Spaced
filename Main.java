public class Main {

    public static void main(String[] args) {
	//Determine the shortest and longest distance between the three drones and display the distances on the screen
    //Drone 1 (5,2,-5), Drone 2 (4,9,2), Drone 3 (-3,2,6)

        double x1 = 5.0d; double y1 = 2.0d; double z1 = -5.0d; //Drone 1 coordinates = (x1,y1,z1)
        double x2 = 4.0d; double y2 = 9.0d; double z2 = 2.0d;
        double x3 = -3.0d; double y3 = 2.0d; double z3 = 6.0d;

        //distance formula: Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) + Math.pow(z1-z2,2));

        double d12 = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) + Math.pow(z1-z2,2)); //d12 = distance between drone 1 and 2
        double d13 = Math.sqrt(Math.pow(x1-x3,2) + Math.pow(y1-y3,2) + Math.pow(z1-z3,2));
        double d23 = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2) + Math.pow(z2-z3,2));

        double dmax = Math.max(d12,Math.max(d13,d23)); //dmax = longest distance
        System.out.println("The longest distance is " + dmax +" meters.");

        double dmin = Math.min(d12,Math.min(d13,d23)); //dmin = shortest distance
        System.out.println("The shortest distance is " + dmin + " meters.");



    }
}

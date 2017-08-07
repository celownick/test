package src.main.Exercises;

/**
 * Created by kcabaj on 14-Jul-17.
 */
class Taca_z_Kostkami_lodu {
    int szerokość;
    int wysokość;
    int głębokość;

    Taca_z_Kostkami_lodu( int x, int y, int z) {
        szerokość = x;
        wysokość = y;
        głębokość = z;
    }

    void display() {
        System.out.println("szerokość to:" + szerokość + " " + "wysokość to:" + wysokość + " " + "głębokość to:" + głębokość);
    }

    public static void main(String[] args) {
        Taca_z_Kostkami_lodu k1 = new Taca_z_Kostkami_lodu(2, 3, 4);
        Taca_z_Kostkami_lodu k2 = new Taca_z_Kostkami_lodu(1, 2, 4);
        k1.display();
        k2.display();
    }
}

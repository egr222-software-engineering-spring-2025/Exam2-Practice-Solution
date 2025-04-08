package Explore;

public class Explore implements IExplore {
    @Override
    public void explore() {
//        origin = new Point(3,4);  // origin is a CONSTANT that is inherited from IExplore - it CANNOT BE CHANGED
        System.out.println("Exploring " + origin);
    }
}
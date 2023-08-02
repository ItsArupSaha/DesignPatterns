public class Car implements Vehicle, Movable{

    private double price;
    @Override
    public void start() {
        System.out.println("Car Started!");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped!");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}

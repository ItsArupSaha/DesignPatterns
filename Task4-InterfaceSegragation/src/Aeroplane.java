public class Aeroplane implements IVehicle, IMovable, IFlyable {

    private double price;
    @Override
    public void fly() {
        System.out.println("Aeroplane flied!");
    }

    @Override
    public void start() {
        System.out.println("Aeroplane Started!");
    }

    @Override
    public void stop() {
        System.out.println("Aeroplane Stopped!");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}

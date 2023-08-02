public class VehicleBuilder {

    public static Car buildCar(){
        Car car = new Car();
        car.setPrice(15000.00);
        car.start();

        return car;
    }

    public static Aeroplane buildAeroplane(){
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.setPrice(50000.00);
        aeroplane.start();
        aeroplane.fly();

        return aeroplane;
    }

}

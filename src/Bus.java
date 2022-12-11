public class Bus extends Car implements Competing{

    public Bus(String brand, String model, int engineVoliume) {
        super(brand, model, engineVoliume);
    }

    @Override
    public void toStartMove() {

    }

    @Override
    public void toStopMuve() {

    }

    @Override
    public void pitStop() {
        System.out.println("Пит Стоп каждый 7 круг");

    }

    @Override
    public void bestLapTime() {
        System.out.println("best time is 11 seconds");

    }

    @Override
    public void maxSpeed() {
        System.out.println("max speed is 300 km/h");

    }
}

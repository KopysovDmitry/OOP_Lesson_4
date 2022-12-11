public class Track extends Car implements Competing{
    public Track(String brand, String model, int engineVoliume) {
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
        System.out.println("Пит Стоп каждый 3 круг");

    }

    @Override
    public void bestLapTime() {
        System.out.println("best time is 15 seconds");

    }

    @Override
    public void maxSpeed() {
        System.out.println("max speed is 150 km/h");

    }
}

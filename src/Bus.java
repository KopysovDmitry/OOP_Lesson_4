public class Bus extends Car implements Competing{

    public Bus(String brand, String model, int tngineVoliume) {
        super(brand, model, tngineVoliume);
    }

    @Override
    public void toStarMove() {

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
        System.out.println("max s[eed is 300 km/h");

    }
}

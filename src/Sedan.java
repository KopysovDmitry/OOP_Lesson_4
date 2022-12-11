public class Sedan extends Car implements Competing{

    public Sedan(String brand, String model, int tngineVoliume) {
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
        System.out.println("Пит Стоп каждый 5 круг");

    }

    @Override
    public void bestLapTime() {
        System.out.println("best time is 10 seconds");

    }

    @Override
    public void maxSpeed() {
        System.out.println("max s[eed is 200 km/h");

    }
}

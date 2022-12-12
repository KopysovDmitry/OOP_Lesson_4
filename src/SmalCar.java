public class SmalCar extends Car implements Competing{

    public SmalCar(String brand, String model, int engineVoliume) {
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
        System.out.println("Пит Стоп каждый 5 круг");

    }

    @Override
    public void bestLapTime() {
        System.out.println("best time is 10 seconds");

    }

    @Override
    public void maxSpeed() {
        System.out.println("max speed is 200 km/h");
    }
    public enum Body {
        SEDAN("седан"), HATCHBACK("хечбек"), COUPE("купе"),
        UNIVERSAL("универсал"), SUV("внедорожник"),
        CROSSOVER("кроссовер"), PICKUP("пикап"),
        VAN("фургон"), MINIVAN("минивен");

        private String bodyTipe;

        Body(String bodyTipe) {
            this.bodyTipe = bodyTipe;
        }
        public String getBodyTipe(){
            return bodyTipe;
        }
        public String toSting(){
            return "Тип кузова: " + bodyTipe;
        }
    }



}

public class Track extends Car implements Competing{

    public String type = "trackType";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Track(String brand, String model, int engineVoliume) {
        super(brand, model, engineVoliume);
        this.type = type;
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

    @Override
    public void printType() {
        if ( type == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println(type.toString());
        }
    }


    public enum Capasity {
        N1(0, 3.5f), N2(3.6f, 12), N3(12, 0);

        private float maxNumberTipe;
        private float minNumberTipe;

        Capasity(float minNumberTipe, float maxNumberTipe) {
            this.maxNumberTipe = maxNumberTipe;
            this.minNumberTipe = minNumberTipe;
        }

        public float getMaxNumberTipe() {
            return maxNumberTipe;
        }

        public float getMinNumberTipe() {
            return minNumberTipe;
        }



        public String toString() {
            if (minNumberTipe == 0) {
                System.out.println("Грузоподъемность: до " + getMaxNumberTipe() + " тонн");
            } else {
                if (maxNumberTipe == 0) {
                    System.out.println("Грузоподъемность: от " + getMinNumberTipe() + " тонн");
                }else {
                    System.out.println("Грузоподъемность: от " + getMinNumberTipe() + " тонн до " + getMaxNumberTipe() + " тонн");
                }
            }
            String String = " ";
            return String;
        }
    }

    @Override
    public boolean getDiagnosed()  {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Track " +getBrand()+" "+getModel()+ " is repair");
    }
}

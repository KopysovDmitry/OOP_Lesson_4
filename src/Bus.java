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
    public enum BusCapacity{
        XS(0,10),S(11,25),M(40,50),L(60,80),XL(100,120);
        private int min;
        private int max;

        BusCapacity(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        public String toString() {
            if (min == 0) {
                System.out.println("Вместимость: до " + max + " мест");
            } else {
                if (max == 0) {
                    System.out.println("Вместимость: от " + min + " мест");
                }
            }
            return "Вместимость: " + min + " - " + max + " мест";

        }
    }
}

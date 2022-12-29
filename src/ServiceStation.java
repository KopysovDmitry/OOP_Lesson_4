import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Car> cars = new ArrayDeque<>();


    public   void addSmalCar (SmalCar smalCar){
        cars.offer(smalCar);
    }
    public   void addTrack (Track track){
        cars.offer(track);
    }
    public void service(){
        if (!cars.isEmpty()){
            Car car = cars.poll();
            boolean result = car.getDiagnosed();
            if (!result){
                car.repair();
            }

        }
    }

}

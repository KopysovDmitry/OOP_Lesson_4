import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Car extends Transport implements Competing {
    private String brand;

    private String model;

    private int engineVoliume;

    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanic = new ArrayList<>();
    //private final List<Sponsor<?>> sponsors = new ArrayList<>();


    public   ArrayList<Sponsor> sponsors;


    public Car(String brand, String model, int engineVoliume) {
        this.brand = brand;
        this.model = model;
        this.engineVoliume = engineVoliume;
        sponsors = new ArrayList<>();

    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanic() {
        return mechanic;
    }

    public  void addDriver(Driver<?>... drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanic.addAll(Arrays.asList(mechanics));
    }
    public void addSponsors(Sponsor<?>... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }



    public ArrayList<Sponsor> getSponsors() {
        return sponsors;
    }


    public  String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()){
            this.brand = brand;
        } else {
            this.brand = "Default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
            if (model !=null && !model.isBlank() && !model.isEmpty()){
                this.model = model;
            }else {
                this.model = "Default";
            }
    }

    public int getEngineVoliume() {
        return engineVoliume;
    }

    public void setEngineVoliume(int engineVoliume) {
        if (engineVoliume != 0){
            this.engineVoliume = engineVoliume;
        }else {
            this.engineVoliume = 2000;
        }
    }
    public abstract void toStartMove();

    public abstract void toStopMuve();

    @Override
    public abstract boolean getDiagnosed () ;
    @Override
    public abstract void repair();


}

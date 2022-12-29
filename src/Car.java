import java.util.*;

public abstract class Car extends Transport implements Competing {
    private String brand;

    private String model;

    private int engineVoliume;

    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanic = new HashSet<>();
    //private final List<Sponsor<?>> sponsors = new ArrayList<>();


    public   Set<Sponsor> sponsors;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getEngineVoliume() == car.getEngineVoliume() && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getDrivers(), car.getDrivers()) && Objects.equals(getMechanic(), car.getMechanic()) && Objects.equals(getSponsors(), car.getSponsors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVoliume(), getDrivers(), getMechanic(), getSponsors());
    }

    public Car(String brand, String model, int engineVoliume) {
        this.brand = brand;
        this.model = model;
        this.engineVoliume = engineVoliume;
        sponsors = new HashSet<>();

    }

    public Set<Driver<?>> getDrivers() {
        return (Set<Driver<?>>) drivers;
    }

    public Set<Mechanic<?>> getMechanic() {
        return (Set<Mechanic<?>>) mechanic;
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



    public Set<Sponsor> getSponsors() {

       return new HashSet<>();
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

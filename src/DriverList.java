import java.util.Objects;
import java.util.Set;

public class DriverList {
    private Set<Driver> drivers;

    public DriverList(Set<Driver> drivers) {
        this.drivers = drivers;
    }
    public void addDriver(Driver driver){
        if (drivers.contains(driver)){
            throw new IllegalArgumentException("This Driver is already defined");
        }
        drivers.add(driver);
        System.out.println("Added in list: "+driver);
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "DriverList{" +
                "drivers=" + drivers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverList)) return false;
        DriverList that = (DriverList) o;
        return Objects.equals(getDrivers(), that.getDrivers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDrivers());
    }
}

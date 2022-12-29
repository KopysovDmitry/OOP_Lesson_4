import java.util.Objects;

public class Driver <T extends Car & Competing>{


        private String fullName;
        private String Rights;
        private int experience;

        private String category;

        public Driver(String fullName, String haveRights, int experience,String category) {
            this.fullName = fullName;
            this.Rights = haveRights;
            this.experience = experience;
            this.category = category;


        }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getRights() {
            return Rights;
        }

        public void setRights(String rights) {
            Rights = rights;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

        public void driving(T car){
            if (category == null && category.isEmpty() && category.isBlank()) {
                throw new IllegalArgumentException("Необходимо указать категорию прав");
            }else {
            System.out.println("водитель " +getFullName()+ " управляет автомобилем " +car.getBrand()+ " и будет участвовать в заезде" );
            }
        }


        public void toStartDrive() {

        }

        public void toStopDrive() {

        }

        public void toRefill() {

        }

    @Override
    public String toString() {
        return getFullName()+ " "+ getRights()+" "+getExperience()+" "+getCategory();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver<?> driver = (Driver<?>) o;
        return getExperience() == driver.getExperience() && Objects.equals(getFullName(), driver.getFullName()) && Objects.equals(getRights(), driver.getRights()) && Objects.equals(getCategory(), driver.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getRights(), getExperience(), getCategory());
    }
}

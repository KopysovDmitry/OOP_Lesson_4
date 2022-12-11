public class Driver <T extends Car & Competing>{


        private String fullName;
        private String Rights;
        private int experience;

        public Driver(String fullName, String haveRights, int experience) {
            this.fullName = fullName;
            this.Rights = haveRights;
            this.experience = experience;
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

        public void Driving(T car){
            System.out.println("водитель " +getFullName()+ " управляет автомобилем " +car.getBrand()+ " и будет участвовать в заезде" );
        }


        public void toStartDrive() {

        }

        public void toStopDrive() {

        }

        public void toRefill() {

        }


}

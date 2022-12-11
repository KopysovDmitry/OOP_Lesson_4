public abstract class Driver {

     private String fullName;
     private String Rights;
     private int experience;

     public Driver(String fullName, String haveRights, int experience) {
          this.fullName = fullName;
          this.Rights = haveRights;
          this.experience = experience;
     }
     public void action(){
          System.out.println("водитель " + " управляет автомобилем " + " и будет участвовать в заезде" );
     }


     public abstract void toStartDrive();

     public abstract void toStopDrive();

     public abstract void toRefill();
}

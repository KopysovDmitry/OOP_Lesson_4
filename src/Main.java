import com.sun.jdi.connect.TransportTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        Driver<Bus> ivanovI = new Driver<Bus>("Ivanov I", "D", 10, "D");
        Driver<SmalCar> petrovP = new Driver<SmalCar>("Sidorov S", "B", 5, "");
        Driver<Track> sidorovS = new Driver<>("Petrov P", "C", 7, "C");



        Bus redBus = new Bus("buhaz", "111", 6);
        redBus.addDriver(ivanovI);
        redBus.addMechanic(new Mechanic<Car>("Vasia ", "SharazhMontazh"));
        redBus.getSponsors().add(new Sponsor("shell", 2000));
        redBus.getSponsors().add(new Sponsor("garik",500));
        redBus.getSponsors().add(new Sponsor("shaurma",10));

        Bus blueBus = new Bus("Pazitron", "Muerte", 10);
        blueBus.getSponsors().add(new Sponsor("Vartan", 1000));

        Bus orangeBus = new Bus("Ikarus", "Orange", 5);
        Bus silverBus = new Bus("Tesla", "DragoonBus", 1000);

        SmalCar whiteSedan = new SmalCar("Lada ", "Granta ", 1);
        whiteSedan.addDriver(petrovP);
        whiteSedan.addMechanic(new Mechanic<SmalCar>("Oleg ","DagestanSpaceTetnologies"));

        SmalCar blackSedan = new SmalCar("lada ", "Baklazhan ", 1);
        SmalCar greenSedan = new SmalCar("Gaz ", "Volga", 2);
        SmalCar pinkSedan = new SmalCar("Zapor ", "Barby ", 12);

        Track purpleTrack = new Track("Zil ", "Drakula ", 8);
        purpleTrack.addDriver(sidorovS);
        purpleTrack.addMechanic(new Mechanic<Track>("Vartan ","ArmenianGarage"));

        Track braunTrack = new Track("Gaz", "Old Sheat", 4);
        Track yellowTrack = new Track("Kraz", "GorGaz", 20);
        Track greyTrack = new Track("Raph", "Iuda", 8);

        List<Car> cars = List.of(redBus,blueBus,orangeBus,silverBus,whiteSedan,blackSedan,greenSedan,pinkSedan,
                purpleTrack,braunTrack,yellowTrack,greyTrack);

        Championship championship = new Championship();
        championship.getAllTransportList().add(redBus);
        championship.getAllTransportList().add(blueBus);
        championship.getAllTransportList().add(orangeBus);
        championship.getAllTransportList().add(orangeBus);
        championship.getAllTransportList().add(silverBus);
        championship.getAllTransportList().add(whiteSedan);
        championship.getAllTransportList().add(blackSedan);
        championship.getAllTransportList().add(greenSedan);
        championship.getAllTransportList().add(pinkSedan);
        championship.getAllTransportList().add(purpleTrack);
        championship.getAllTransportList().add(braunTrack);
        championship.getAllTransportList().add(yellowTrack);
        championship.getAllTransportList().add(greyTrack);


        getDiagnosted(redBus, blueBus, orangeBus, silverBus, whiteSedan, blackSedan, greenSedan, pinkSedan, purpleTrack,
                braunTrack, yellowTrack, greyTrack);

        ivanovI.driving(redBus);
        petrovP.driving(whiteSedan);
        sidorovS.driving(purpleTrack);


        SmalCar.Body body = SmalCar.Body.SUV;
        System.out.println(body.toSting());

        Track.Capasity capasity = Track.Capasity.N1;
        System.out.println(capasity.toString());

        Bus.BusCapacity busCapacity = Bus.BusCapacity.XS;
        System.out.println(busCapacity.toString());

        orangeBus.printType();

        System.out.println(" ");

        boolean success = Class2.allValidate("T", "T", "T");

        if (success) {
            System.out.println("Data is correct");
        } else {
            System.out.println("Data is not correct");
        }

        System.out.println("");

        System.out.println(redBus.getSponsors().size()+" sponsors of "+ redBus.getBrand()+" " + redBus.getModel()+" in race");

        System.out.println(championship.allTransportList.size()+ " members of race");

        System.out.println("");
        for (Car car: cars){
            infoTransport(car);
        }
    }
    private static void infoTransport(Car car){
        System.out.println("Auto information: " + car.getBrand()+" "+car.getModel());
        System.out.println("Drivers: "+car.getDrivers());
        System.out.println("Mechanics: "+car.getMechanic());
        System.out.println("Sponsors: " +car.getSponsors());

    }





    @Override
    public int hashCode() {
        return super.hashCode();
    }
    private static void getDiagnosted(Transport... transports){
        for (Transport transport: transports){
            diagnosted(transport);
        }
    }


    private static void diagnosted(Transport transport) {
        try {
            if (!transport.getDiagnosed()) {
                throw new RuntimeException(" Auto " + transport.getBrand() + " " + transport.getModel() + " not diagnosted");
            }
        }catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }

    }

    private ArrayList<Transport> transportList;









}
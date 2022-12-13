public class Main {
    public static void main(String[] args) {
        Bus redBus = new Bus("buhaz","111",6);
        Bus blueBus = new Bus("Pazitron","Muerte",10);
        Bus orangeBus = new Bus("Ikarus","Orange",5);
        Bus silverBus = new Bus("Tesla","DragoonBus",1000);
        SmalCar whiteSedan = new SmalCar("Lada","Granta",1);
        SmalCar blackSedan = new SmalCar("lada", "Baklazhan",1);
        SmalCar greenSedan = new SmalCar("Gaz","Volga",2);
        SmalCar pinkSedan = new SmalCar("Zapor","Barby",12);
        Track purpleTrack = new Track("Zil","Drakula",8);
        Track braunTrack = new Track("Gaz","Old Sheat",4);
        Track yellowTrack = new Track("Kraz","GorGaz",20);
        Track greyTrack = new Track("Raph", "Iuda",8);

        Driver<Bus> ivanovI = new Driver<>("Ivanov I","D",10);
        Driver<SmalCar> sidorovS = new Driver<>("Sidorov S","B",5);
        Driver<Track> petrovP = new Driver<>("Petrov P","C",7);

        ivanovI.driving(redBus);
        petrovP.driving(braunTrack);
        sidorovS.driving(blackSedan);

        SmalCar.Body body = SmalCar.Body.SUV;
        System.out.println(body.toSting());

        Track.Capasity capasity = Track.Capasity.N1;
        System.out.println(capasity.toString());

        Bus.BusCapacity busCapacity = Bus.BusCapacity.XS;
        System.out.println(busCapacity.toString());

        orangeBus.printType();







    }
}
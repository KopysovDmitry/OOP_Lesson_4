public class Main {
    public static void main(String[] args) {
        Bus redBus = new Bus("buhaz","111",6);
        Bus blueBus = new Bus("Pazitron","Muerte",10);
        Bus orangeBus = new Bus("Ikarus","Orange",5);
        Bus silverBus = new Bus("Tesla","DragoonBus",1000);
        Sedan whiteSedan = new Sedan("Lada","Granta",1);
        Sedan blackSedan = new Sedan("lada", "Baklazhan",1);
        Sedan greenSedan = new Sedan("Gaz","Volga",2);
        Sedan pinkSedan = new Sedan("Zapor","Barby",12);
        Track purpleTrack = new Track("Zil","Drakula",8);
        Track braunTrack = new Track("Gaz","Old Sheat",4);
        Track yellowTrack = new Track("Kraz","GorGaz",20);
        Track greyTrack = new Track("Raph", "Iuda",8);

        Driver<Bus> Ivanov_I = new Driver<>("Ivanov_I","D",10);
        Driver<Sedan> Sidorov_S = new Driver<>("Sidorov_S","B",5);
        Driver<Track> Petrov_P = new Driver<>("Petrov_P","C",7);

        Ivanov_I.Driving(redBus);
        Petrov_P.Driving(braunTrack);
        Sidorov_S.Driving(blackSedan);
    }
}
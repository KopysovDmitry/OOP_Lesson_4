import java.util.ArrayList;

public class Sponsor<T extends Car & Competing> {
    private String sponsorName;
    private int donation;

    public ArrayList<String> sponsorsList;

    public Sponsor(String sponsorName, int donation) {
        this.sponsorName = sponsorName;
        this.donation = donation;
        sponsorsList = new ArrayList<>();
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public int getDonation() {
        return donation;
    }

    public void setDonation(int donation) {
        this.donation = donation;
    }
    public void toSponceRace(){
        }

    @Override
    public String toString() {
        return getSponsorName()+" "+getDonation();
    }
}

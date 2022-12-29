public class Mechanic<T extends Car & Competing> {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
    public void service(T t){
        t.getDiagnosed();
    }
    public void repair(T t){
        t.repair();
    }


    public void add(Mechanic<?> mechanic) {
    }

    @Override
    public String toString() {
        return getName()+" "+getCompany();
    }
}

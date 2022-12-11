public abstract class Car {
    private String brand;

    private String model;

    private int engineVoliume;

    public Car(String brand, String model, int engineVoliume) {
        this.brand = brand;
        this.model = model;
        this.engineVoliume = engineVoliume;
    }

    public String getBrand() {
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
}

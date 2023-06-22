public class Car {
    private String engine;
    private String transmission;
    private String producer;
    private int maxSpeed;

    public Car(String engine, String transmission, String producer, int maxSpeed) {
        this.engine = engine;
        this.transmission = transmission;
        this.producer = producer;
        this.maxSpeed = maxSpeed;
    }
    public Car() {
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine (String engine) {
        this.engine = engine;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission (String transmission) {
        this.transmission = transmission;
    }
    public String getProducer (String producer) {
        return producer;
    }
    public void setProducer (String producer) {
        this.producer = producer;
    }
    public int setMaxSpeed () {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Car)) return false;
        Car Tesla = (Car) o;
        return engine.equals(Tesla.engine) &&
                transmission.equals(Tesla.transmission) &&
                producer.equals(Tesla.producer) &&
                maxSpeed == Tesla.maxSpeed;
    }
//    2nd task
    public boolean equalsOneArg(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Car)) return false;
        Car Tesla = (Car) o;
        return engine.equals(Tesla.engine);
    }
//    3rd task
@Override
    public String toString() {
        return "Car:\n" +
            "Engine = " + engine + "\n" +
            "Transmission = " + transmission + "\n" +
            "Producer = " + producer + "\n" +
            "Maximum Speed = " + maxSpeed;

    }




    public void carAssistant() {
        System.out.println("Hello! Are you ready to ride?");
    }
}

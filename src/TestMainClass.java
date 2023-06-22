public class TestMainClass {
    public static void main(String[] args) {
        Car Tesla = new Car("electric", "auto", "Tesla", 250);
        Car Porsche = new Car();
        Porsche.setEngine("electric");
        Porsche.setTransmission("auto");
        Porsche.setProducer("Porsche");
        Porsche.setMaxSpeed(240);
        System.out.println(Porsche);
        System.out.println(Tesla == Porsche);
        System.out.println(Tesla.equals(Porsche));
        System.out.println(Tesla.equalsOneArg(Porsche));

        Tesla.carAssistant();
    }
}

public class Testing 
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Camaro();
        String model = vehicle.GetModel();
        String make = vehicle.GetMake();
        int wheels = vehicle.GetWheels();
        String type = vehicle.GetType();
        System.out.println(type + ": " + make + " " + model + ", " + wheels + " wheels");

        Vehicle cycle = new Ninja();
        String model2 = cycle.GetModel();
        String make2 = cycle.GetMake();
        int wheels2 = cycle.GetWheels();
        String type2 = cycle.GetType();
        System.out.println(type2 + ": " + make2 + " " + model2 + ", " + wheels2 + " wheels");
    }
}
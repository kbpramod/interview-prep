package LLD.ParkingLot;

import java.util.*;

public class Main {

    private static List<Floor> floors = new ArrayList<>();
    private static List<Vehicle> vehicles = new ArrayList<>();

    private static List<Vehicle> createVehicles(int count) {
        Random random = new Random();
        Size[] sizes = Size.values();

        for(int i=1; i<= count; i++){
            Size size = sizes[random.nextInt(sizes.length)];
            Vehicle vehicle = new Vehicle(i, size);
            vehicles.add(vehicle);
        }

        return vehicles;
    }

    private static List<Floor> createFloors(int count) {
        for(int i=0; i<count; i++){
            Floor floor = new Floor(i);
            floors.add(floor);
        }

        return floors;
    }

    private static boolean parkVehicle(Vehicle vehicle) {
        for(Floor floor: floors) {
            if(floor.allocateSlot(vehicle)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

        System.out.println("hello world!");
        List<Vehicle> createdVehicles = createVehicles(100);
        List<Floor> createdFloors = createFloors(5);

        
        for(Vehicle vehicle: createdVehicles){
            boolean alloted = parkVehicle(vehicle);

            if(!alloted){
                System.out.println("couldn't allocate vehicle"+ vehicle);
            }
        }

        for(Floor floor: createdFloors){
            floor.displaySlots();
        }


    }
}


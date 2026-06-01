package LLD.ParkingLot;

import java.util.*;

public class Floor {
    private int floorNumber;
    private List<Slot> slots;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.slots = new ArrayList<>();

        Random random = new Random();
        Size[] sizes = Size.values();

        int start = floorNumber * 10;

        for(int i = start; i <= start + 10 ; i++){
            Size size = sizes[random.nextInt(sizes.length)];
            slots.add(new Slot(i, size));
        }

    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<Slot> geSlots() {
        return slots;
    }

    public void displaySlots() {
        for(Slot slot : slots) {
            System.out.println(slot);
        }
    }

    public boolean allocateSlot(Vehicle vehicle) {
        for(Slot slot : slots){
            if(slot.allot(vehicle)){
                return true;
            }
        }
        return false;
    }
}

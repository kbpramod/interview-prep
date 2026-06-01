package LLD.ParkingLot;

public class Slot {

    private int Id;
    private Size size;
    private Vehicle vehicle;

    public Slot(int Id, Size size){
        this.Id = Id;
        this.size = size;
    }

    public int getId() {
        return Id;
    }

    public Size getSize() {
        return size;
    }

    public Boolean isEmpty() {
        return vehicle == null;
    }

    public Boolean allot(Vehicle vehicle) {
        if(this.vehicle != null) {
            return false;
        }
        if(this.size != vehicle.getSize()){
            return false;
        }
        this.vehicle = vehicle;
        return true;
    }

    public Boolean deallot(){
        if(this.vehicle == null) {
            return false;
        }
        this.vehicle = null;
        return true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String toString() {
        return "Slot{id= " + Id  + ", size=" + size + ", vehicle=" + vehicle + "}"; 
    }
}

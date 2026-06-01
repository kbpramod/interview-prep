package LLD.ParkingLot;

public class Vehicle {
    private int Id;

    private Size size;

    public Vehicle(int Id, Size size){
        this.Id = Id;
        this.size = size;
    }

    public int getId() {
        return Id;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString(){
        return "{ Id:" + Id + ", size:" + size + "}";
    }
}

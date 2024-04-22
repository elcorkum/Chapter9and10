public class Bungalow extends House{
    private int rooms;

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public Bungalow(){
        this(7);
    }
    public Bungalow(int rooms){
        super(4000);
        this.rooms = rooms;

    }

    public Bungalow(int size){
        this(7);
        super(size);
    }
}

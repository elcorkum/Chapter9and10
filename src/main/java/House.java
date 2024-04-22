public abstract class House{
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public House(int size) {
        this.size = size;
    }

    House a = new House();

    a = new House();
    a = null;

}

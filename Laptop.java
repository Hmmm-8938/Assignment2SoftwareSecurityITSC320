//Laptop computer: adds screen size to other Computer info

public final class Laptop {
    private final Computer computer;
    private final String screenSize;

    public Laptop(String CPU, String RAM, String disk, String screenSize) {
        this.computer = new Computer(CPU, RAM, disk);
        this.screenSize = screenSize;
    }

    public Computer getComputer() {
        return computer;
    }

    public String getScreenSize() {
        return this.screenSize;
    }

    @Override
    public String toString() {
        return "Type:Laptop\t" + computer.toString() + "\tScreen:" + this.screenSize;
    }
}
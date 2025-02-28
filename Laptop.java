//Laptop computer: adds screen size to other Computer info
public class Laptop {
    private Computer computer;
    private String screenSize;

    public Laptop(String CPU, String RAM, String disk, String screenSize) {
        this.computer = new Computer(CPU, RAM, disk); // Delegate to Computer
        this.screenSize = screenSize;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return this.screenSize;
    }

    @Override
    public String toString() {
        return "Type:Laptop\t" + computer.toString() + "\tScreen:" + this.screenSize;
    }
}
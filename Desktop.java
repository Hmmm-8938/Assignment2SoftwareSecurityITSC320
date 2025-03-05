//Desktop computer: adds GPU type

public final class Desktop {
    private final Computer computer;
    private final String GPUType;

    public Desktop(String CPU, String RAM, String disk, String GPUType) {
        this.computer = new Computer(CPU, RAM, disk);
        this.GPUType = GPUType;
    }

    // Getters
    public Computer getComputer() {
        return computer;
    }

    public String getGPUType() {
        return this.GPUType;
    }

    @Override
    public String toString() {
        return "Type:Desktop\t" + computer.toString() + "\tGPU:" + this.GPUType;
    }
}
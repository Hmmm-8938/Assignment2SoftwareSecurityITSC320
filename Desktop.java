public class Desktop {
    private Computer computer; 
    private String GPUType;

    // Constructors
    public Desktop(String CPU, String RAM, String disk, String GPUType) {
        this.computer = new Computer(CPU, RAM, disk); // Delegate to Computer
        this.GPUType = GPUType;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }
    
    public String getGPUType() {
        return this.GPUType;
    }
    
    @Override
    public String toString() {
        return "Type:Desktop\t" + computer.toString() + "\tGPU:" + this.GPUType;
    }
}

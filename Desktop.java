//Desktop computer: adds GPU type

public class Desktop implements Computable 
{
    private String CPU;
    private String RAM;
    private String disk;
    private Computer computer; 
    private String GPUType;

    // Constructors
    public Desktop() 
    {
    
    } // No-arg contructor

    public Desktop(String CPU, String RAM, String disk, String GPUType) 
    {
        this.computer = new Computer(CPU, RAM, disk); 
        this.GPUType = GPUType;
    }

    public Computer getComputer() 
    {
        return computer;
    }

    public String getCPU() 
    {
        return this.CPU;
    }

    public String getRAM() 
    {
        return this.RAM;
    }

    public String getDisk() 
    {
        return this.disk;
    }
    
    public String getGPUType() 
    {
        return this.GPUType;
    }

    @Override
    public String toString() 
    {
        return "Type:Desktop\t" + computer.toString() + "\tGPU:" + this.GPUType;
    }
}
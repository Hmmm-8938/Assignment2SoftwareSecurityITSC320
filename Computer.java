//Computer class: manages computer CPU, RAM and Disk information

public class Computer implements Computable 
{
    private String CPU;
    private String RAM;
    private String disk;

    // Constructors
    public Computer() 
    {

    } // No-arg contructor

    public Computer(String CPU, String RAM, String disk) 
    {
        this.CPU = CPU;
        this.RAM = RAM;
        this.disk = disk;
    }

    // Getters
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

    @Override
    public String toString() 
    {
        return "CPU: " + CPU + ", RAM: " + RAM + ", Disk: " + disk;
    }
}
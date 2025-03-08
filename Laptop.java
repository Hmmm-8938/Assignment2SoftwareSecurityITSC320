//Laptop computer: adds screen size to other Computer info

public class Laptop implements Computable 
{
    private String CPU;
    private String RAM;
    private String disk;
    private Computer computer;
    private String screenSize;

    // Constructors
    public Laptop() 
    {
        
    } // No-arg contructor

    public Laptop(String CPU, String RAM, String disk, String screenSize) 
    {
        this.computer = new Computer(CPU, RAM, disk); // Delegate to Computer
        this.screenSize = screenSize;
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
    
    public Computer getComputer() 
    {
        return computer;
    }

    public String getScreenSize() 
    {
        return this.screenSize;
    }

    @Override
    public String toString() 
    {
        return "Type:Laptop\t" + computer.toString() + "\tScreen:" + this.screenSize;
    }
}
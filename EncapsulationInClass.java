/*
 *  Demonstrates encapsulation using binding with getter setters
 *  and hiding data i.e. private fields.
 *  Also demonstrated method override with the use of toString()
 *
 */
class Computer {

    private String cpu;
    private String ram;
    private String hardDrive;
    private long memory;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public long getMemory() {
        return memory;
    }

    public void setMemory(long memory) {
        this.memory = memory;
    }


    public String toString() {
        return "Cpu: " + this.cpu
                + "\nMemory Size:  " + this.memory
                + "\nHard Drive: " + this.hardDrive;
    }
}

public class EncapsulationInClass {

    public static void main(String[] args) {

        Computer myComputer = new Computer();

        // myComputer.cpu = "AMD 456"; compilation error

        //use setters to set private fields
        myComputer.setCpu("Intel Pentium 234");
        myComputer.setMemory(256000000);
        myComputer.setHardDrive("Seagate 1236");

        // System.out.println(new Computer().cpu);   compilation error

        // use getter and setters to access the private fields
        System.out.println("Cpu is: " + myComputer.getCpu());
        System.out.println("Memory size is: " + myComputer.getMemory());
        System.out.println("Hard Drive: " + myComputer.getHardDrive());

        //using overridden toString()
        System.out.println(myComputer);
    }

}

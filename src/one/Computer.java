package one;

public class Computer implements Comparable <Computer> {
    private String name;
    private double cpu;
    private double memmory;

    public Computer(String name, double cpu, double memmory) {
        this.name = name;
        this.cpu = cpu;
        this.memmory = memmory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getMemmory() {
        return memmory;
    }

    public void setMemmory(double memmory) {
        this.memmory = memmory; //memory!!!!
    }

    @Override
    public int compareTo(Computer p) {
        if(this.cpu > p.cpu)
            return 1;
        else if (this.cpu == p.cpu) {
            if (this.memmory > p.memmory) {
                return 1;
            }
            else if (this.memmory == p.memmory) {
                return this.name.compareTo(p.name);
            }
            else {
                return -1;
            }
        }
        else
            return -1;
    }
    
    @Override
    public String toString() {
        return name  + " cpu " + cpu + " memmory " + memmory + "\n";
    }
}

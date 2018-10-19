package two;

public class Computer2 implements Comparable<Computer2> {

    private String name;
    private int cpuMhz;
    private int ram;

    public Computer2(String name, int cpuMhz, int ram) {
        this.name = name;
        this.cpuMhz = cpuMhz;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public int getCpuMhz() {
        return cpuMhz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpuMhz(int cpuMhz) {
        this.cpuMhz = cpuMhz;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpuMhz=" + cpuMhz +
                ", ram=" + ram +
                "}\n";
    }

    @Override
    public int compareTo(Computer2 o) {
        if(this.cpuMhz > o.cpuMhz) {
            return 1;
        } else if(this.cpuMhz == o.cpuMhz) {

            if(this.ram > o.ram) {
                return 1;
            } else if(this.ram == o.ram) {
                return this.name.compareTo(o.name);
            } else {
                return -1;
            }


        } else {
            return -1;
        }
    }

}

public class Cpu {
    double price;

    public Cpu(double price) {
        this.price=price;
    }
    class Processor{
        int cores;
        String manufacturer;

        public Processor(int cores,String manufacturer) {
            this.cores=cores;
            this.manufacturer=manufacturer;
        }
        void display()
        {
            System.out.println("Processor Cores :"+cores);
            System.out.println("Manufacturer :"+manufacturer);
        }
    }
    static class Ram{
        int memory;
        String manufacturer;

        public Ram(int memory,String manufacturer) {
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        void display(){
            System.out.println("Ram size :"+memory+" GB");
            System.out.println("Manufacturer :"+manufacturer);
        }
    }
    public static void main(String[] args) {
        Cpu cpu=new Cpu(45000);
        Cpu.Processor p=cpu.new Processor(8, "Intel");
        Cpu.Ram r=new Cpu.Ram(16,"Corsair");
        System.out.println("Cpu Price: "+cpu.price);
        p.display();
        r.display();
    } 
}
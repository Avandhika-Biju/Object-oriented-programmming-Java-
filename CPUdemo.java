class CPU {
    int price;
    public CPU(int p){
        price = p;
    }
    public void display()
    {
      System.out.println("Price= "+price);  
    }
    class processor{
        int no_of_cores;
        String manufacturers;
    
    public processor(int n,String m){
        no_of_cores=n;
        manufacturers=m;
    }
    public void display2()
    {
      System.out.println("No of Cores = "+no_of_cores+"\n"+"Manufacturers="+manufacturers);  
    }
    }
    static class RAM{
        String memory;
        String manufacturer;
        public RAM(String m1,String m2){
            memory=m1;
            manufacturer=m2;
    }
        public void display3()
    {
        System.out.println("Memory = "+memory+"\n"+"Manufacturer = "+manufacturer);
    }
    }
}
public class CPUdemo
{
    public static void main(String [] args){
        CPU cpu = new CPU(1000);
        cpu.display();
        CPU.processor p = cpu.new processor(4,"Intel");
        p.display2();
        CPU.RAM r = new CPU.RAM("8GB","Samsung");
        r.display3();
    }
}
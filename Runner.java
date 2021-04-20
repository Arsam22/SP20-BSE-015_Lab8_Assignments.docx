import computer.Computer;
public class Runner {
    public static void main(String[] args) {
        Computer c1 = new Computer(44,70,34,45);
        Laptop l1 = new Laptop(78,45,23,67);
        c1.display();
        System.out.println();
        l1.display();
    }    
}


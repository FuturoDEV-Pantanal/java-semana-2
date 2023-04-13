package modificadores.private_public;

public class Main {

    public static void main(String[] args) { 
        
        Carro carro1 = new Carro("Fusca");

        carro1.acelerar(10);
        System.out.println(carro1.getVelocidade());
        carro1.acelerar(10);
        System.out.println(carro1.getVelocidade());
        carro1.acelerar(10);
        System.out.println(carro1.getVelocidade());
        carro1.acelerar(10);
        System.out.println(carro1.getVelocidade());
        carro1.acelerar(10);
        System.out.println(carro1.getVelocidade());

    }   
    
}

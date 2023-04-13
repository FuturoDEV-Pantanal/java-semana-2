package modificadores.static_final;

public class Main {
    
    public static void main(String[] args) {

        //total de pessoas existentes neste momento.
        System.out.println(Pessoa.getQuantidadePessoas());
        //instanciando objeto pessoas.
        Pessoa p1 = new Pessoa("Pessoa1", 20);
        System.out.println(Pessoa.getQuantidadePessoas());
        Pessoa p2 = new Pessoa("Pessoa2", 30);
        System.out.println(Pessoa.getQuantidadePessoas());
        Pessoa p3 = new Pessoa("Pessoa3", 40);
        System.out.println("Quantidade final de pessoas: " + Pessoa.getQuantidadePessoas());
        
    }
}

package encapsulamento;

public class Main {
    public static void main(String[] args) {

        //construindo obj pessoa
        Pessoa p = new Pessoa();
        //acessando interface do objeto p

        //inserindo (settando) valores dos atribs
        p.setNome("Nome");
        p.setIdade(18);
        p.setCpf("123.456.789-00");

        //recuperando os valore dos atributos de p 
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        System.out.println(p.getCpf());

    }
    
}

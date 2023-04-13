package modificadores.static_final;


public class Pessoa {
    private String nome;
    private int idade;
    private static int quantidadePessoas;
    
    //Construtor. 
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        //todas as vezes que for construido um objeto do tipo Pessoa, incrementa-se +1
        quantidadePessoas++;
    }

    //getters <- são as funções que recuperam as informações dos objetos.

    public String getNome(){
        //aplica-se varias regras de negocio. 
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public static int getQuantidadePessoas(){
        return quantidadePessoas;
    }
    public static int getNomeDoisStatic(){
        return quantidadePessoas;
    }
    public static int VAMOSINCREMENTAR(){
        return quantidadePessoas;
    }
}

package encapsulamento;

public class Pessoa {
    
    //atribs encapsulados!
    private String nome;
    private int idade;
    private String cpf;
    
    //getters and setters - são os métodos que permitem a interação entre os 
    //atributos encapsulados e o restante do programa (seu mundo externo)


    //método de inserção de valores nos atributos. configuração.
    public void setNome(String nome){
        this.nome = nome;
    };
    public void setIdade(int idade){
        this.idade = idade;
    };
    public void setCpf(String cpf){
        this.cpf = cpf;
    };

    //métodos de leitura (recuperação) dos valroes dos atributos.
    public String getNome(){
        return this.nome;
    };
    public int getIdade(){
        return this.idade;
    };
    public String getCpf(){
        return this.cpf;
    };


}

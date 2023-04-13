package modificadores.private_public;

public class Carro {
    public String modelo; //este atributo é público (pode ser acessado fora do contexto da classe)
    private int velocidade; //este atributo é privado e não pode ser acessado fora do contexto da classe;
    
    //construtor
    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
    }
    
    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
    }

    public int getVelocidade() {
        return this.velocidade;
    }



}

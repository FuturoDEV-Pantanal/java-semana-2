package Oficina;

public class Carro {
    //atributos
    private String modelo;
    private String placa;

    //atributo da nossa classe. ele é um dado do tipo Mecanico.
    private Mecanico mecanico;

    //construtor
    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    //getters
    public String getModelo() {
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public Mecanico getMecanico(){
        return mecanico;
    }

    //setters

    public void setMecanico(Mecanico mc) {
        this.mecanico = mc;
    }

}

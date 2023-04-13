package Oficina;

import java.util.List;
import java.util.ArrayList;
public class OficinaMecanica {
    private String nomeDaOficina;
    private List<Carro> carros;
    private List<Mecanico> mecanicos;


    public OficinaMecanica(String nomeDaOficina) {
        this.nomeDaOficina = nomeDaOficina;
        this.carros = new ArrayList<Carro>();
        this.mecanicos = new ArrayList<Mecanico>();
    }

    public void registrarCarro(Carro cr){
        carros.add(cr);
    }

    public void registrarMecanico(Mecanico mc) {
        mecanicos.add(mc);
    }

    //este método demosntra a conexão entre as 3 classes.
    public void atribuirMecanico(Carro cr, Mecanico mc) {
        cr.setMecanico(mc);
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

}

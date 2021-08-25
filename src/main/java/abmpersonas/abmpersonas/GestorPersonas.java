package abmpersonas.abmpersonas;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;

@Component
@ApplicationScope
public class GestorPersonas {

    private ArrayList<Persona> lista = new ArrayList<>();
    public GestorPersonas(){}

    public int agregar(Persona nueva){
        lista.add(nueva);
        return nueva.getCodigo();
    }

    public ArrayList<Persona> listar(){
        return lista;
    }

    public Persona buscar(int codigo){
        return lista.stream().filter(p -> p.getCodigo() == codigo).findFirst().orElse(null);
    }

    public boolean eliminar(int codigo){
        boolean existe = lista.stream().anyMatch(p -> p.getCodigo() == codigo);
        if (existe)
            lista.removeIf(p -> p.getCodigo() == codigo);
        return existe;
    }

}

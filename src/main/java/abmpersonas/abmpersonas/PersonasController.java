package abmpersonas.abmpersonas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PersonasController {

    @Autowired
    GestorPersonas g;

    @GetMapping("/agregarpersona/{nombre}/{apellido}/{edad}")
    public int agregarpersona1(@Autowired Persona nueva, @PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad){
        nueva.setNombre(nombre);
        nueva.setApellido(apellido);
        nueva.setEdad(edad);
        return g.agregar(nueva);
    }
    @PostMapping("/agregarpersona/{nombre}/{apellido}/{edad}")
    public int agregarpersona2(@Autowired Persona nueva, @PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad){
        nueva.setNombre(nombre);
        nueva.setApellido(apellido);
        nueva.setEdad(edad);
        return g.agregar(nueva);
    }
    @PostMapping("/agregarpersona")
    public int agregarpersona3(@RequestBody Persona nueva){
        return g.agregar(nueva);
    }

    @GetMapping("/buscar/{codigo}")
    public Persona buscar(@PathVariable int codigo){
        return g.buscar(codigo);
    }

    @GetMapping("/listarpersonas")
    public ArrayList<Persona> listar(){
        return g.listar();
    }

    @GetMapping("/eliminar/{codigo}")
    public boolean eliminar(@PathVariable int codigo){
        return g.eliminar(codigo);
    }
}

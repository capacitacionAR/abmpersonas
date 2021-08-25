package abmpersonas.abmpersonas;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope

public class Persona {
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private static int cantidad = 0;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Persona(){
        codigo = ++cantidad;
    }

    public Persona(String nombre, String apellido, int edad) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}

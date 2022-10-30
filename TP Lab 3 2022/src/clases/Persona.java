package clases;

import java.io.Serializable;

public abstract class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String direccion;
    private String correo;
    
    public Persona(String nombre, String apellido, String dni, String telefono, String direccion, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
       
    }
    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
        this.telefono = "";
        this.direccion = "";
        this.correo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
  
    public abstract void editarPersona(String dato, int opcion);
	@Override
    public String toString() {
        return "\nNombre= "+ nombre+"\nApellido= "+apellido +"\nDni= "+dni+"\nTelefono= "+telefono +"\nDireccion= "+direccion +"\nCorreo= "+correo+"\n";
    }

    @Override
    public boolean equals(Object o) {
        boolean igual=false;
        if(o!=null){
            if(o instanceof Persona){
                Persona aux= (Persona)o;
                if(aux.getDni().equals(getDni())){
                    igual=true;
                }
            }
        }
        return igual;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

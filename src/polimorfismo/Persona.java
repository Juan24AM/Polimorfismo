package polimorfismo;

public class Persona {

    private String nombre;
    private Integer edad;

    //Sobrecarga de constructores
    public Persona() {
        nombre = "NN";
        edad = 0;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }
    public Persona(Integer edad) {
        this.nombre = "NN";
        this.edad = edad;
    }
    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Sobrecarga de métodos
    public String saludar() {
        return "hola";
    }

    public String saludar(String nom) {
        return "hola " + nom;
    }

    public String saludar(int cant) {
        return "hola " + cant + " veces";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}

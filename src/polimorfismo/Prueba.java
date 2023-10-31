
package polimorfismo;

public class Prueba {
    public static void main(String[] args) {
        //Constructores
        Persona p = new Persona();
        System.out.println(p);
        p = new Persona("Bob");
        System.out.println(p);
        p = new Persona(45);
        System.out.println(p);
        p = new Persona("Patricio", 30);
        System.out.println(p);
        //Métodos
        System.out.println(p.saludar());
        System.out.println(p.saludar("Alf"));
        System.out.println(p.saludar(5));
    }
}

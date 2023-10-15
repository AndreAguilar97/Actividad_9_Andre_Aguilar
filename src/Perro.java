import java.util.Scanner;

//Definimos los atributos de la clase Perro
class Perro {

    private String nombre, raza, color;
    private int edad;

    //Métodos getters y setters para cada atributo de la clase perro.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void comer(String comida, double cantidadGramos) {
        System.out.println(nombre + " está comiendo " + cantidadGramos + " gramos de " + comida);
    }

    public String ladrar() {
        return "guau guau";
    }
}



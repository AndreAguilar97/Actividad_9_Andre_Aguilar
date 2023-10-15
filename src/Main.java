import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el primer perro
        Perro perro1 = new Perro();
        System.out.println("Ingrese el nombre del primer perro: ");
        perro1.setNombre(scanner.nextLine());
        System.out.println("Ingrese la raza del primer perro: ");
        perro1.setRaza(scanner.nextLine());
        System.out.println("Ingrese el color del primer perro");
        perro1.setColor(scanner.nextLine());
        int edadPerro1 = 0;
        while (true) {
            try {
                System.out.println("Ingrese la edad del primer perro: ");
                edadPerro1 = Integer.parseInt(scanner.nextLine());
                perro1.setEdad(edadPerro1);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una edad válida.");
            }
        }

        // Crear el segundo perro
        Perro perro2 = new Perro();
        System.out.println("Ingrese el nombre del segundo perro: ");
        perro2.setNombre(scanner.nextLine());
        System.out.println("Ingrese la raza del segundo perro: ");
        perro2.setRaza(scanner.nextLine());
        System.out.println("Ingrese el color del segundo perro");
        perro2.setColor(scanner.nextLine());
        int edadPerro2 = 0;
        while (true) {
            try {
                System.out.println("Ingrese la edad del segundo perro: ");
                edadPerro2 = Integer.parseInt(scanner.nextLine());
                perro2.setEdad(edadPerro2);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una edad válida.");
            }
        }

        // Invocar métodos para ambos perros
        System.out.println("\nDatos del primer perro:");
        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Raza: " + perro1.getRaza());
        System.out.println("Edad: " + perro1.getEdad());
        perro1.comer("croquetas", 200);
        System.out.println("Sonido: " + perro1.ladrar());

        System.out.println("\nDatos del segundo perro:");
        System.out.println("Nombre: " + perro2.getNombre());
        System.out.println("Raza: " + perro2.getRaza());
        System.out.println("Edad: " + perro2.getEdad());
        perro2.comer("huesos", 150);
        System.out.println("Sonido: " + perro2.ladrar());

        scanner.close();
    }
}

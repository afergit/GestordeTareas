import java.util.Scanner;


public class   GestorTareasBasico {

    static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int totalPrioridad = 0;

        do {
            mostrarMenu();
            opcion = leerOpcion(sc);
            totalPrioridad = ejecutarOpcion(opcion,sc,totalPrioridad);
        } while (opcion != 3);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("--- Gestor de tareas ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tareas (pendiente) ");
        System.out.println("3. Salir ");

    }
    public  static int leerOpcion (Scanner sc) {
        System.out.print("Selecciona una opcion: ");
        return sc.nextInt();
    }

    public static int ejecutarOpcion (int opcion,Scanner sc, int totalPrioridad) {
        sc.nextLine();

        switch (opcion) {
            case 1:
                totalPrioridad = agregarTarea(sc, totalPrioridad);
                break;
            case 2:
                System.out.println("funcionamiento en desarrollo");
                break;
            case 3:
                System.out.println("Gracias por tu visita");
                break;
            default:
                System.out.println("Opcion invalida");
        }
        return totalPrioridad;
    }

    public static int agregarTarea (Scanner sc, int totalPrioridad) {
        System.out.println("Nombre del tarea: ");
        String nombre = sc.nextLine();

        System.out.println("Prioridad del 1 - 5: ");
        int prioridad = sc.nextInt();
        sc.nextLine();

        if (prioridad >= 1 && prioridad <= 5) {
            totalPrioridad += prioridad;
            System.out.println("Tarea '" + nombre + "'agregada con Prioridad: " + prioridad );
            System.out.println("total de prioridades: " + totalPrioridad);
        } else {
                System.out.println("Prioridad invalida");
        }
        return totalPrioridad;

    }


}

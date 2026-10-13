public class Recetadecocina {

    public static void main(String[] args) {
        String nombreReceta;
        int tiempoPreparacion;
        String dificultad;
        String ingredientesPrincipales;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la receta");
        nombreReceta = scanner.nextLine();
        System.out.println("Ingresa los ingredientes principales");
        ingredientesPrincipales = scanner.nextLine();
        System.out.println("Ingresa el tiempo de preaparacion (en minutos):" );
        tiempoPreparacion = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nivel de dificultad (Facil , Media , Alta): ");
        dificultad = scanner.nextLine();
        System.out.println("Nombre de la receta     : " + nombreReceta);
        System.out.println("Ingredientes principales: " + ingredientesPrincipales);
        System.out.println("Tiempo de preparacion   : " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad              : " + dificultad);  
    }
}
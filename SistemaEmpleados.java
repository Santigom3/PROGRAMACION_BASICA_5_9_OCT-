public class SistemaEmpleados {

    public static void main(String[] args) {
       var scanner = new Scanner(System.in);

        // Declarar las variables
        String nombre;
        int edad;
        double salario;
        boolean esJefe;

        // Solicitar los datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        edad = scanner.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        salario = scanner.nextDouble();

        System.out.print("¿Es jefe de departamento? (true/false): ");
        esJefe = scanner.nextBoolean();

        // Imprimir la información del empleado
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Salario: $" + salario);
        System.out.println("Es jefe de departamento: " + esJefe);

        scanner.close();
    }
    }
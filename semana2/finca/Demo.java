package semana2.finca;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Activo> activos = List.of(
            new Producto("PR-001", "Saco de urea 50 kg", 32.50, 40),
            new Cultivo("CU-001", "Cacao CCN-51", 3.5, 1800.0),
            new Animal("AN-001", "Bovino", 420.0, 1.85),
            // RETO - Activo propio de Cotopaxi / Pujilí
            new Cultivo("CU-002", "Brócoli Pujilí", 2.0, 1450.0),
            new Animal("AN-002", "Ovino Criollo", 45.0, 3.20),
            // Reto - Activo propio de Guayas / el triunfo
            new Cultivo("CU-002", "Banano en El Triunfo", 4.0, 1500.0)


        );

        double total = 0;
        for (Activo a : activos) {
            double v = Valorador.valor(a);
            total += v;
            System.out.printf("%s -> USD %.2f%n", a, v);
        }
        System.out.printf("Valor total de la finca: USD %.2f%n", total);
        System.out.println("10 qq = " + UnidadMedida.QUINTAL.aKilos(10) + " kg");
    }
}

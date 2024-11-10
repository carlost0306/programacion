public class EjemploDeDatos {
    public static void main(String[] args) {
        
        // Declaración y asignación de variables primitivas
        int numeroEntero1 = 15;
        int numeroEntero2 = 25;
        double numeroDecimal1 = 3.5;
        double numeroDecimal2 = 4.5;
        String texto1 = "Hola";
        String texto2 = ", ";
        String texto3 = "mundo!";

        // Suma de dos enteros
        int sumaEnteros = numeroEntero1 + numeroEntero2;
        System.out.println("Suma de enteros: " + sumaEnteros);

        // Suma de dos doubles
        double sumaDecimales = numeroDecimal1 + numeroDecimal2;
        System.out.println("Suma de decimales: " + sumaDecimales);

        // Concatenación de tres strings
        String concatenacionTexto = texto1 + texto2 + texto3;
        System.out.println("Concatenación de textos: " + concatenacionTexto);
    }
}

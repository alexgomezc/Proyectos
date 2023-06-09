// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Esta linea ejecuta la funcion sumar
        int resultado = 0;
        resultado=sumar(42,35, 25);
        System.out.println("La suma es: " + resultado);

        //Se crea objeto miCoche, se llama al metodo agregarPuertas y se muestra el numero de puertas del objeto
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println("El coche tiene: " + miCoche.puertas);
    }
    //Esta funcion recibe 3 parametros a, b, c y retorna la suma de los 3 numeros
    public static int sumar (int a, int b, int c){

        return a + b + c;
    }
    /*Se define la clase coche se inicia la variable puertas en 0, la funcion agregarPuertas incrementa en uno el
    numero de puertas*/
    static class Coche {
        public int puertas = 0;
        public void agregarPuertas(){
            this.puertas++;
        }
    }
}
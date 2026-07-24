public class Circulo implements  Forma {

    @Override
    public void calcularArea(double base, double altura, double raio) {
        System.out.println("Calculando area do circulo");
        System.out.println(raio * 3.14 * 2);
    }
}

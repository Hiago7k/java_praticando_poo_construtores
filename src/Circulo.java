public class Circulo implements  Forma {

    @Override
    public void calcularArea(double base, double altura, double raio) {
        System.out.println("Calculando area do circulo");
        double raio1 = raio * 3.14;
        double result = Math.sqrt(raio1 * 2);
        System.out.println(result);
    }
}

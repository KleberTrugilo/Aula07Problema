public class Main {

    public static void main(String[] args) {
        Logistica logistica = new Logistica();

        logistica.planejarEntrega("terrestre");
        System.out.println("Custo: R$ " + logistica.calcularCusto("terrestre", 500));

        System.out.println("Custo: R$ " + logistica.calcularCusto("maritima", 500));
    }
}
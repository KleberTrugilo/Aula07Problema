public class Logistica {

    public void planejarEntrega(String tipo) {
        if (tipo.equals("terrestre")) {
            Caminhao caminhao = new Caminhao();
            caminhao.entregar();
        } else if (tipo.equals("maritima")) {
            Navio navio = new Navio();
            navio.entregar();
        } else {
            throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }
    }

    public double calcularCusto(String tipo, double km) {
        if (tipo.equals("terrestre")) {
            return new Caminhao().custoPorKm() * km;
        } else if (tipo.equals("maritima")) {
            return new Navio().custoPorKm() * km;
        } else {
            throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }
    }
}
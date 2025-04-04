public class Carro extends Veiculo {
    int numeroDePortas;
    int capacidadeTanqueCombustivel;
    String tipoCombustivel;

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getCapacidadeTanqueCombustivel() {
        return capacidadeTanqueCombustivel;
    }

    public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        if (tipoCombustivel.equals("Gasolina") || tipoCombustivel.equals("Alcool") || tipoCombustivel.equals("Elétrico")) {
            this.tipoCombustivel = tipoCombustivel;
        } else {
            this.tipoCombustivel = "Não Informado";
        }
    }

    public void calcularAutonomiaViagem(int kmLitro) {
        int kmTanqueCheio = capacidadeTanqueCombustivel * kmLitro;
        System.out.println(kmLitro + "Km/L percorre " + kmTanqueCheio + "Km com o tanque cheio.");
    }
}

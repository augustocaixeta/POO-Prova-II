public class Moto {
    private int cilindradas;
    String tipoFreio;
    boolean possuiBau;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        if (tipoFreio.equals("disco") || tipoFreio.equals("tambor")) {
            this.tipoFreio = tipoFreio;
        } else {
            this.tipoFreio = "Não Informado";
        }
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }

    public String formatarValorBau() {
        String ret;

        if (possuiBau) {
            ret = "A moto possui bau";
        } else {
            ret = "A moto não possui bau";
        }

        return ret;
    }
}

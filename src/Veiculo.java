public class Veiculo {
    protected String Modelo;
    protected String Cor;
    protected String Ano;

    public void setModelo(String modelo){
        this.Modelo = Modelo;
    }
    public void setCor(String cor) {
        this.Cor = Cor;
    }
    public void setAno(String ano) {
        this.Ano = ano;
    }
    public String getModelo() {

        return Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public String getAno() {
        return Ano;
    }
}


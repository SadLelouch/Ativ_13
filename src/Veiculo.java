public class Veiculo {
    protected String Modelo;
    protected String Cor;
    protected String Ano;

    public void setModelo(String modelo){
        this.Modelo = modelo;
    }
    public void setCor(String cor) {
        this.Cor = cor;
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


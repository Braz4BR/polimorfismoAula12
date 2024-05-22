public class Eevee {
    private String tipo;
    private int altura,hp;
    private double peso;

    public String ataque(){
        return "Ataque rapido";
    }
    public String defesa(){
        return "desvio";
    }
    public String especial(){
        return "Tri-ataque";
    }

    //métodos acessores     
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    


    
}

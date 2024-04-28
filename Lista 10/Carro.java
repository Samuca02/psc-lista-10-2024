
public class Carro {
    private String roda;
    private int pneus;
    private int portas;
    private String motor;
    private int combustivel;
    
    public Carro(String roda, int pneus, int portas, String motor, int combustivel){
        this.roda = roda;
        this.pneus = pneus;
        this.portas = portas;
        this.motor = motor;
        this.combustivel = combustivel;
    }
    public String getRoda() {
        return roda;
    }
    public void setRoda(String roda){
        this.roda = roda;
    }


    public int getPneus() {
        return pneus;
    }
    public void setRoda(int pneus){
        this.pneus = pneus;
    }


    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas){
        this.portas = portas;
    }

    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }

    public int getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(int combustivel){
        this.combustivel = combustivel;
    }
}
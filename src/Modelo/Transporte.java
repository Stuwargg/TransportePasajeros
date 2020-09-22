package Modelo;

public class Transporte {
    String NPlaca; //Numero de placa
    String Col; // Color
    String Mod; // Modelo
    String dest; // Destino
    int NPasajeros; // Numero de pasajeros

    public Transporte() {
    }

    public Transporte(String NPlaca, String Col, String Mod, String dest, int NPasajeros) {
        this.NPlaca = NPlaca;
        this.Col = Col;
        this.Mod = Mod;
        this.dest = dest;
        this.NPasajeros = NPasajeros;
    }

    public String getNPlaca() {
        return NPlaca;
    }

    public String getCol() {
        return Col;
    }

    public String getMod() {
        return Mod;
    }

    public String getDest() {
        return dest;
    }

    public int getNPasajeros() {
        return NPasajeros;
    }

    public void setNPlaca(String NPlaca) {
        this.NPlaca = NPlaca;
    }

    public void setCol(String Col) {
        this.Col = Col;
    }

    public void setMod(String Mod) {
        this.Mod = Mod;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setNPasajeros(int NPasajeros) {
        this.NPasajeros = NPasajeros;
    }
    
    
    public double PrecioPasje(){
        if (getDest().equals("ICA")) {
            return 25;
        }else if (getDest().equals("AREQUIPA")){
            return 70;
        }else if(getDest().equals("TACNA")){
            return 100;
        }else if(getDest().equals("TRUJILLO")){
            return 30;
        }else if(getDest().equals("PIURA")){
            return 90;
        }
        return 0;
    }
    public double PrecioCombustible(){
        if (getDest().equals("ICA")) {
            return 80;
        }else if (getDest().equals("AREQUIPA")){
            return 250;
        }else if(getDest().equals("TACNA")){
            return 350;
        }else if(getDest().equals("TRUJILLO")){
            return 100;
        }else if(getDest().equals("PIURA")){
            return 330;
        }
        return 0;

    }
    
    public double montoRecaudado(){
        return getNPasajeros()*PrecioPasje();
    }
    public double Ganancias(){
        return montoRecaudado()-PrecioCombustible();
    }
            
    
}

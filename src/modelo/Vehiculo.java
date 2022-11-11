
package modelo;


public class Vehiculo {
    
    private String placa;
    private String modelo;
    private String fecha;
    private int tipo;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String fecha, int tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
     @Override
    public String toString() {
        return "vehiculo{" + "Placa=" + placa + ", modelo=" + modelo + ", fecha=" + fecha + ", Tipo=" + tipo + '}';
    }
    
    
    
}

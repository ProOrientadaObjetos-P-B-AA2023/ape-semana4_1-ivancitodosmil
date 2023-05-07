class Automotor{
    private String cedula;
    private String marcavehiculo;
    private int anofabricacion;
    private double valorvehiculo;
    private double valormatricula;

    public Automotor() {}
    public Automotor(String cedula, String marcavehiculo, int anofabricacion, double valorvehiculo) {
        this.cedula = cedula;
        this.marcavehiculo = marcavehiculo;
        this.anofabricacion = anofabricacion;
        this.valorvehiculo = valorvehiculo;
    }
    
    public void calcularValorMatricula (){
        this.valormatricula=(0.00002*this.valorvehiculo)*(2023-anofabricacion);
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getMarcavehiculo() {
        return marcavehiculo;
    }
    public void setMarcavehiculo(String marcavehiculo) {
        this.marcavehiculo = marcavehiculo;
    }
    public int getAnofabricacion() {
        return anofabricacion;
    }
    public void setAnofabricacion(int anofabricacion) {
        this.anofabricacion = anofabricacion;
    }
    public double getValorvehiculo() {
        return valorvehiculo;
    }
    public void setValorvehiculo(double valorvehiculo) {
        this.valorvehiculo = valorvehiculo;
    }
    public double getValormatricula() {
        return valormatricula;
    }
    public void setValormatricula(double valormatricula) {
        this.valormatricula = valormatricula;
    }

    public String toString(){
        return String.format("Automotor"+
                "\n Cedula: %s"+
                "\n Marca del Vehiculo: %s"+
                "\n Ano de Fabricacion: %d"+
                "\n Valor del Vehiculo: %.2f"+
                "\n Valor de la Matricula: %.2f",
                this.getCedula(),this.getMarcavehiculo(),this.getAnofabricacion(),this.getValorvehiculo(),this.getValormatricula());
    } 
}

public class TestAutomotor1 {
    public static void main(String[] args) {
      Automotor automotor1 = new Automotor ("1105658502","Hyundai",2018,9500.75);
      automotor1.calcularValorMatricula();
        System.out.println(automotor1);
    }
}

class Profesor{
    private String nombre;
    private String apellido;
    private double sueldobasico;
    private double sueldototal;
    private String cedula;

        public Profesor() {}
        public Profesor(String nombre, String apellido, double sueldobasico, String cedula) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.sueldobasico = sueldobasico;
            this.cedula = cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public double getSueldobasico() {
            return sueldobasico;
        }
        public void setSueldobasico(double sueldobasico) {
            this.sueldobasico = sueldobasico;
        }
         public void calcularSueldoTotal() {
            this.sueldototal= (this.sueldobasico)+(this.sueldobasico*0.20);
        }
        public double getSueltototal() {
            return sueldototal;
        }

        public void setSueltototal(double sueltototal) {
            this.sueldototal = sueltototal;
        }
        
        public String getCedula() {
            return cedula;
        }
        public void setCedula(String cedula) {
            this.cedula = cedula;
        }
        public String toString() {
            return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldobasico=" + sueldobasico + ", sueldototal=" + sueldototal + ", cedula=" + cedula + '}';
        }
    }
public class TestProfesor1 {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Daniel","Irene",2000,"1809698807");
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);
    }
}


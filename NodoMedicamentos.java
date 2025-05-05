public class NodoMedicamentos {
     protected String codigo;
     protected String nombre;
     protected String fechaVencimiento;
     protected int cantidadDisponible;
     protected NodoMedicamentos siguiente;
     protected NodoMedicamentos anterior;

    public NodoMedicamentos(String codigo, String nombre, String fechaVencimiento, int cantidadDisponible, NodoMedicamentos siguiente, NodoMedicamentos anterior) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidadDisponible = cantidadDisponible;
        this.siguiente = null;
        this.anterior = null;
    }
    public void eliminarMedicamentos (){

    }
    public void actualizarMedicamentos(){

    }
}

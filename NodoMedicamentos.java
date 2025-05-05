public class NodoMedicamentos {
    String codigo;
    String nombre;
    String fechaVencimiento;
    int cantidadDisponible;
    NodoMedicamentos siguiente;
    NodoMedicamentos anterior;

    public NodoMedicamentos(String codigo, String nombre, String fechaVencimiento, int cantidadDisponible, NodoMedicamentos siguiente, NodoMedicamentos anterior) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidadDisponible = cantidadDisponible;
        this.siguiente = null;
        this.anterior = null;
    }
}

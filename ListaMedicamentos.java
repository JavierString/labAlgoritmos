// lista de los medicamentos
public class ListaMedicamentos{
    private NodoMedicamentos cabeza;
    public void insertarMedicamento(String codigo, String nombre, String fechaVencimiento, int cantidadDisponible){
        NodoMedicamentos nuevo = new NodoMedicamentos(codigo, nombre, fechaVencimiento, cantidadDisponible);
        
        if(cabeza == null){
        cabeza = nuevo;
        cabeza.siguiente = cabeza;
        cabeza.anterior = cabeza;
        return;
        }
        NodoMedicamentos actual = cabeza;
        
        }
}
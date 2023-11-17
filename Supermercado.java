public class Supermercado{
    private String propietario;
    private int m2;
    private boolean tiendaAbierta;
    
    public Supermercado(String nombrePropietario, int m2Tienda){
        propietario = nombrePropietario;
        m2 = m2Tienda;
        tiendaAbierta = false;
    }
    
    public String getPropietario(){
        return propietario;
    }
    
    public int getM2(){
        return m2;
    }
    
    public boolean getEstadoTienda(){
        return tiendaAbierta;
    }
    
    public void setPropietario(String cambiarPropietario){
        propietario = cambiarPropietario;
    }
    
    public void ampliarTienda (int añadirM2){
        m2 = m2 + añadirM2;
    }
    
    public void aperturaTienda(){
        if (tiendaAbierta == false ){
            tiendaAbierta = true;
        }
        else{
            tiendaAbierta = false;
        }
    }
    
    public void imprimirDetalles(){
        String conversion;
        if (tiendaAbierta == true){
            conversion = "Abierto";
        }
        else{
            conversion = "Cerrado";
        }
        System.out.println("Propietario: " + propietario + " | " + "M2 del establecimiento: " + m2 + " | " + "Estado de la puerta: " + conversion);
    }
    
    public String contendidoEstado(){
        String conversion;
        if (tiendaAbierta == true){
            conversion = "Abierto";
        }
        else{
            conversion = "Cerrado";
        }
        String estado = "Propietario: " + propietario + " | " + "M2 del establecimiento: " + m2 + " | " + "Estado de la puerta: " + conversion;
        return estado;
    }
}
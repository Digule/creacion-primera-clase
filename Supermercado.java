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
    
    public boolean getStadoTienda(){
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
}
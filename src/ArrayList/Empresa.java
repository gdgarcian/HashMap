package ArrayList;
import java.util.*;
public class Empresa {
    private String nombre;
    private TreeMap<String, Sucursal> sucursal;
    private HashMap<String, Empleado> e;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.sucursal = new TreeMap<>();
    }
    
    public boolean agregarSucursal(Sucursal s){
        boolean t;
        ArrayList <Sucursal> sucursales = new ArrayList <>();
            if(sucursales.add(s))
                t = true;
            return false;
    }
        
    public ArrayList <Empleado> listarTodosEmpleados(){
        ArrayList <Sucursal> sucursales = new ArrayList<>();
        ArrayList <Empleado> empleados = new ArrayList<>();
        for(Sucursal s : this.sucursal.values()){
            sucursales.add(s);
            for(Empleado e : this.e.values())
                empleados.add(e);
        return empleados;          
        }    
        return empleados;        
    }
    
    public ArrayList<Sucursal> listarEmpleadoSucursal(String ciudad){
        ArrayList <Sucursal> sucursales = new ArrayList<>();                
        for (Sucursal sucursal : this.sucursal.values()) {            
            sucursal.listarTodosEmpleados();
        }
        return sucursales;
    }
    
    public ArrayList <Sucursal> listarTodasSucursales(){
        ArrayList <Sucursal> sucursales = new ArrayList<>();
        for (Sucursal s : this.sucursal.values()) {
            sucursales.add(s);            
        }
        return sucursales;
    }
    
    public ArrayList <Empleado> listarEmpleadosMayores(String ciudad){
        ArrayList <Sucursal> sucursales = new ArrayList<>(); 
        ArrayList <Empleado> empleados = new ArrayList<>();
        Sucursal sdf = new Sucursal();
        for (Sucursal suc : this.sucursalMayorEmpleados()) {    
            suc = this.sucursalMayorEmpleados();
            this.sucursal.put(sucursal.get(suc.listEmpleadoMayor()));
        }
    }

    public ArrayList<Sucursal> sucursalMayorEmpleados(){
        ArrayList <Sucursal> sucursales = new ArrayList <>();
        for(Sucursal s : this.sucursal.get(listarTodosEmpleados()))
            sucursales.add(s);
        return sucursales;        
    }
    
}    
/*
public Sucursal sucursalMayorEmpleados(){
        Sucursal cantMayor = null;
        for (Sucursal s : this.sucursal.values()) {
            if (cantMayor == null)
                cantMayor = sucursal.get(listarTodosEmpleados());           
        }        
        return cantMayor;
    }
*/
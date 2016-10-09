package ArrayList;

import java.util.*;

public class Sucursal {
    private String ciudad;
    private int numEmpleados;
    private HashMap<String, Empleado> emp;

    public Sucursal() {
    }

    public void Sucursal(){        
    }
    public Sucursal(String ciudad) {
        this.ciudad = ciudad;
        this.numEmpleados = 0;
        this.emp = new HashMap<>();
    }
    
    public boolean ingresarEmp(Empleado e){
        if (this.emp.containsKey(e)){
            return false;
        }else{
            this.emp.put(e.getCedula(), e);
        }
        return true;
    }
    
    public ArrayList<Empleado> listarTodosEmpleados(){
        ArrayList <Empleado> empleados = new ArrayList <>();
        for (Empleado e : this.emp.values()) 
            empleados.add(e);
        return empleados;       
    }
    
    public Empleado listEmpleadoMayor(){
        Empleado mayor = null;
        for (Empleado e : this.emp.values()) {
            if(mayor == null){
                mayor = e;
            }else{
             if(e.getEdad() > mayor.getEdad()){
                 mayor =  e;
             }            
            }            
        }
        return mayor;
    }
    
    public Empleado buscarEmpleado(String cedula){
        Empleado e = null;
        e = this.emp.get(cedula);
        return e;                
    }
}


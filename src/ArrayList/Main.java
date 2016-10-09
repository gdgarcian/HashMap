package ArrayList;

import java.util.*;
public class Main {
    
    
    public static void main(String[] args) {
        Empleado e1 = new Empleado("186223", "Trevor", 39);
        Empleado e2 = new Empleado("322681", "Franklin", 25);
        Empleado e3 = new Empleado("262831", "Michael", 45);
        Sucursal s = new Sucursal("Bogotá");
        Empresa em = new Empresa("Empresa");
        
        if(!s.ingresarEmp(e1)) System.out.println("Error");
        if(!s.ingresarEmp(e2)) System.out.println("Error");
        if(!s.ingresarEmp(e3)) System.out.println("Error");
        
        Empleado e = s.buscarEmpleado("186223");
        if (e != null) System.out.println(e);
        else System.out.println("No existe");
        
        ArrayList <Empleado> emp = s.listarTodosEmpleados();
        for(Empleado emp1 : emp){
            System.out.println(emp1);
        }    
        
        Scanner t = new Scanner(System.in);        
        int n;
        System.out.print("Selleccione una opción : ");
        System.out.println("1) Suprimir empleados");
        System.out.println("2) Listar empleados");
        System.out.println("3) Listar todas las sucursales");
        n = t.nextInt();
        if(n == 1){
            s.listarTodosEmpleados().clear();
        }else if(n == 2){
            s.listarTodosEmpleados();
        }else if(n == 3){
            em.listarTodasSucursales();
        }
        
        
    }
}


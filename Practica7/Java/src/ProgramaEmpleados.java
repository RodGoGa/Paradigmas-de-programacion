import java.util.ArrayList;
import java.util.List;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        // Crear lista de empleados
        List<Empleado> empleados = new ArrayList<>();

        // Crear diferentes tipos de empleados
        EmpleadoTiempoCompleto empleadoTC = new EmpleadoTiempoCompleto("Juan Pérez", "EMP001", 2000);
        EmpleadoMedioTiempo empleadoMT = new EmpleadoMedioTiempo("María García", "EMP002", 1500);
        EmpleadoPorHoras empleadoPH = new EmpleadoPorHoras("Carlos Rodríguez", "EMP003", 1000);

        // Establecer horas trabajadas para el empleado por horas
        empleadoPH.setHorasTrabajadas(40);

        // Agregar empleados a la lista
        empleados.add(empleadoTC);
        empleados.add(empleadoMT);
        empleados.add(empleadoPH);

        // Mostrar salarios de cada empleado
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("ID: " + empleado.getId());
            System.out.println("Salario: $" + empleado.calcularSalario());
            System.out.println("-------------------");
        }
    }
}

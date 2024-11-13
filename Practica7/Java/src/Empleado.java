public class Empleado {
    private String nombre;
    private String id;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    // Método para calcular salario
    public double calcularSalario() {
        return salarioBase;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

// Empleado Tiempo Completo
class EmpleadoTiempoCompleto extends Empleado {
    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.10; // 10% de bono
    }
}

// Empleado Medio Tiempo
class EmpleadoMedioTiempo extends Empleado {
    public EmpleadoMedioTiempo(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 0.5; // 50% del salario base
    }
}

// Empleado Por Horas
class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private static final double TARIFA_POR_HORA = 15.0; // Tarifa fija por hora

    public EmpleadoPorHoras(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = 0;
    }

    public void setHorasTrabajadas(int horas) {
        this.horasTrabajadas = horas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * TARIFA_POR_HORA;
    }
}

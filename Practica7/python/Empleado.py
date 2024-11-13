class Empleado:
    def __init__(self, nombre, id, salario_base):
        self.nombre = nombre
        self.id = id
        self.salario_base = salario_base

    def calcular_salario(self):
        return self.salario_base

    # Getters y Setters
    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_salario_base(self):
        return self.salario_base

    def set_salario_base(self, salario_base):
        self.salario_base = salario_base


class EmpleadoTiempoCompleto(Empleado):
    def __init__(self, nombre, id, salario_base):
        super().__init__(nombre, id, salario_base)

    def calcular_salario(self):
        return self.salario_base * 1.10  # 10% de bono


class EmpleadoMedioTiempo(Empleado):
    def __init__(self, nombre, id, salario_base):
        super().__init__(nombre, id, salario_base)

    def calcular_salario(self):
        return self.salario_base * 0.5  # 50% del salario base


class EmpleadoPorHoras(Empleado):
    TARIFA_POR_HORA = 15.0  # Tarifa fija por hora

    def __init__(self, nombre, id, salario_base):
        super().__init__(nombre, id, salario_base)
        self.horas_trabajadas = 0

    def set_horas_trabajadas(self, horas):
        self.horas_trabajadas = horas

    def calcular_salario(self):
        return self.horas_trabajadas * self.TARIFA_POR_HORA


# Programa principal
if __name__ == "__main__":
    # Crear lista de empleados
    empleados = []

    # Crear diferentes tipos de empleados
    empleado_tc = EmpleadoTiempoCompleto("Juan Pérez", "EMP001", 2000)
    empleado_mt = EmpleadoMedioTiempo("María García", "EMP002", 1500)
    empleado_ph = EmpleadoPorHoras("Carlos Rodríguez", "EMP003", 1000)

    # Establecer horas trabajadas para el empleado por horas
    empleado_ph.set_horas_trabajadas(40)

    # Agregar empleados a la lista
    empleados.append(empleado_tc)
    empleados.append(empleado_mt)
    empleados.append(empleado_ph)

    # Mostrar salarios de cada empleado
    for empleado in empleados:
        print("Nombre:", empleado.get_nombre())
        print("ID:", empleado.get_id())
        print("Salario: $", empleado.calcular_salario())
        print("-------------------")

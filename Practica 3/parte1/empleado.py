print("Programa para calcular el pago de un empleado")
horas = int(input("Ingresa la horas trabajadas: "))
sueldo = float(input("Ingresa el sueldo por hora: "))

if horas<=40:
    print("Ganaste $" + str(sueldo*horas))
else:
    horas_extra = horas - 40
    sueldo_extra = (sueldo*1.5)
    pago_regular = sueldo*40
    pago_extra = sueldo_extra * horas_extra

    print("Ganaste $" + str(pago_regular) + " por trabajar 40 horas")
    print("Pero por trbajar " + str(horas_extra) + " horas extra ganas $" + str(pago_extra))
    print ("Terminaste ganando $" + str((pago_regular + pago_extra)))
import java.util.ArrayList;
import java.util.List;

abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int year;

    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract void describir();
}

class Auto extends Vehiculo {

    public Auto(String marca, String modelo, int year) {
        super(marca, modelo, year);
    }

    @Override
    public void encender() {
        System.out.println("El auto " + marca + " " + modelo + " está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El auto " + marca + " " + modelo + " está apagado.");
    }

    @Override
    public void describir() {
        System.out.println("Este es un auto de marca " + marca + ", modelo " + modelo + ", del year " + year + ".");
    }
}

class Motocicleta extends Vehiculo {

    public Motocicleta(String marca, String modelo, int year) {
        super(marca, modelo, year);
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta " + marca + " " + modelo + " está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La motocicleta " + marca + " " + modelo + " está apagada.");
    }

    @Override
    public void describir() {
        System.out.println("Esta es una motocicleta de marca " + marca + ", modelo " + modelo + ", del year " + year + ".");
    }
}

class Camion extends Vehiculo {

    public Camion(String marca, String modelo, int year) {
        super(marca, modelo, year);
    }

    @Override
    public void encender() {
        System.out.println("El camión " + marca + " " + modelo + " está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El camión " + marca + " " + modelo + " está apagado.");
    }

    @Override
    public void describir() {
        System.out.println("Este es un camión de marca " + marca + ", modelo " + modelo + ", del year " + year + ".");
    }
}



public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Toyota", "Corolla", 2020));
        vehiculos.add(new Motocicleta("Yamaha", "MT-07", 2021));
        vehiculos.add(new Camion("Ford", "F-150", 2019));

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.encender();
            vehiculo.describir();
            vehiculo.apagar();
            System.out.println();
        }
    }
}
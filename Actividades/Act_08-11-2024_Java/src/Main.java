//Rodrigo González Garcés 3BV2
class Animal {
    protected int edad;
    private String color;

    public Animal(int edad, String color) {
        this.edad = edad;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void comer() {
        System.out.println("El animal está comiendo");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}

class Perro extends Animal {
    public Perro(int edad, String color) {
        super(edad, color);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo huesos");
    }
}

class Gato extends Animal {
    public Gato(int edad, String color) {
        super(edad, color);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo pescado");
    }
}

class Pajaro extends Animal {
    public Pajaro(int edad, String color) {
        super(edad, color);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro canta");
    }

    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo semillas");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal(5, "Gris");
        miAnimal.hacerSonido();
        miAnimal.comer();

        Perro miPerro = new Perro(7, "Marrón");
        miPerro.hacerSonido();
        miPerro.comer();

        Gato miGato = new Gato(4, "Negro");
        miGato.hacerSonido();
        miGato.comer();

        Pajaro miPajaro = new Pajaro(1, "Amarillo");
        miPajaro.hacerSonido();
        miPajaro.comer();

        System.out.println("Color del perro: " + miPerro.getColor());
        miPerro.setColor("Blanco");
        System.out.println("Nuevo color del perro: " + miPerro.getColor());
    }
}

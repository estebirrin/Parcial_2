import java.util.ArrayList;

// Clase de prueba
public class PruebaAnimales {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Canidos("Canis lupus familiaris", "Ladrido", "Carnivora", "Domestico"));
        animales.add(new Canidos("Canis lupus", "Aullido", "Carnivora", "Bosque"));
        animales.add(new Felino("Panthera leo", "Rugido","Carnivora","Pradera"));
        animales.add(new Felino("Felis silvestris catus","Maullido","Ratones","Domestico"));

        for (Animal animal : animales) {
            System.out.println("Nombre Científico: " + animal.getNombreCientífico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentacion: " + animal.getAlimentos());
            System.out.println("Hábitat: " + animal.getHabitat());
            System.out.println();
        }
    }
}
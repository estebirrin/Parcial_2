public class Canidos extends Animal {
    public Canidos(String nombreCientífico, String sonidos, String alimentos, String habitat) {
        super(sonidos, alimentos, habitat, nombreCientífico);
    }

    public String getSonido() {
        return super.sonidos;
    }

    public String getAlimentos() {
        return super.alimentos;
    }

    public String getHabitat() {
        return super.habitat;
    }

    public String getNombreCientífico() {
        return super.nombreCientífico;
    }
}

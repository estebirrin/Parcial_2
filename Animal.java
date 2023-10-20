public abstract class Animal {
    protected String sonidos;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientífico;

    public Animal(String sonidos, String alimentos, String habitat, String nombreCientífico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientífico = nombreCientífico;
    }

    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
    public abstract String getNombreCientífico();
}
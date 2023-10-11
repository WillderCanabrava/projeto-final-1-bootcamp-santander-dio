public abstract class Acai {

    private String description;

    public Acai(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

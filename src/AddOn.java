public abstract class AddOn extends Acai {

    protected Acai acai;

    public AddOn(String description, Acai acai) {
        super(description);
        this.acai = acai;
    }

    public abstract String getDescription();
}

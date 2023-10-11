public class TapiocaFlour extends AddOn {

    public TapiocaFlour(Acai acai) {
        super("Tapioca flour", acai);
    }

    @Override
    public double cost() {
        return acai.cost() + 3;
    }

    @Override
    public String getDescription() {
        return acai.getDescription() + " with tapioca flour" ;
    }
}

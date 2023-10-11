public class CupuacuCream  extends AddOn{


    public CupuacuCream(Acai acai) {
        super("Cupuacu cream", acai);
    }

    @Override
    public double cost() {
        return acai.cost() + 4;
    }

    @Override
    public String getDescription() {
        return acai.getDescription() + " with cupuacu cream";
    }
}

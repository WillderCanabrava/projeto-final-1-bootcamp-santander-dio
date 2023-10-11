public class AcaiShop {

    public static void main(String[] args) {

        AcaiFromPara acaiFromPara = new AcaiFromPara();
        System.out.println(acaiFromPara.getDescription() + ": " + acaiFromPara.cost());

        TapiocaFlour tapiocaFlour = new TapiocaFlour(acaiFromPara);
        System.out.println(tapiocaFlour.getDescription() + ": " + tapiocaFlour.cost());

        CupuacuCream cupuacuCream = new CupuacuCream(tapiocaFlour);
        System.out.println(cupuacuCream.getDescription() + ": " + cupuacuCream.cost());

    }
}

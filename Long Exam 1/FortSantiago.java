public class FortSantiago implements Locations {

    static int airFare = 80;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
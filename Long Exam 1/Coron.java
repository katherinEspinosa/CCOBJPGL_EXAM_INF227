public class Coron implements Locations {

    static int airFare = 100;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

}
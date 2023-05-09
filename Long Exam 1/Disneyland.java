public class Disneyland implements Locations {

    static int airFare = 300;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
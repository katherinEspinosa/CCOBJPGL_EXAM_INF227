public class Granada implements Locations {

    int airFare = 400;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
interface Tourist {

    int budget = 0;
    int airFare = 0;

    void visit();

    void visit(Boracay boracay);
    void visit (Coron coron);
    void visit (Disneyland disneyland);
    void visit (ElNido elnido); 
    void visit (FortSantiago fortsantiago); 
    void visit (Granada granada);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    }

    void checkBudget();
}
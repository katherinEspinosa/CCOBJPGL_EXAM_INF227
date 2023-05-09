public class Me implements Tourist {

    static int budget = 1000;
   // int airFare;
    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        // Define your visit
        checkBudget();
        if (budget < boracay.airFare) {
            System.out.println("Not enough money to fly to Boracay");
        }
        else {
            budget = budget - boracay.airFare;
            System.out.println("I am surfing in Boracay");
        }
        System.out.println ("Remaining Budget: "); checkBudget();
    }

    public void visit(Coron coron) {
        // Define your visit
        checkBudget();
        if (budget < coron.airFare) {
            System.out.println("Not enough money to fly to Coron");
        }
        else {
            budget = budget - coron.airFare;
            System.out.println("I am island hopping in Coron");
        }
        System.out.println ("Remaining Budget: "); checkBudget();
    }

    public void visit(Disneyland disneyland) {
        // Define your visit
        checkBudget();
        if (budget < disneyland.airFare) {
            System.out.println("Not enough money to fly to Disneyland");
        }
        else {
            budget = budget - disneyland.airFare;
            System.out.println("I am hugging Olaf in Disneyland");
        }
        System.out.println ("Remaining Budget: "); checkBudget();
    }

    public void visit(ElNido elnido) {
        // Define your visit
        checkBudget();
        if (budget < elnido.airFare) {
            System.out.println("Not enough money to fly to El Nido");
        }
        else {
            budget = budget - elnido.airFare;
            System.out.println("I am diving in El Nido");
        }
        System.out.println ("Remaining Budget: "); checkBudget();
    }

    public void visit(FortSantiago fortsantiago) {
        // Define your visit
        checkBudget();
        if (budget < fortsantiago.airFare) {
            System.out.println("Not enough money to drive to Fort Santiago");
        }
        else {
            budget = budget - fortsantiago.airFare;
            System.out.println("I am remembering the past in Fort Santiago");
        }
        System.out.println ("Remaining Budget: "); checkBudget();
    }

    public void visit(Granada granada) {
        // Define your visit
        checkBudget();
        if (budget < granada.airFare) {
            System.out.println("Not enough money to fly to Granada :((");
        }
        else {
            budget = budget - granada.airFare;
            System.out.println("I am roaming in Granada");
        }
        System.out.println ("Remaining Budget: "); checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is "+ budget);
    }
   

}

  

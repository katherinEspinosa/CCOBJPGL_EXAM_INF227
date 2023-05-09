public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit (done)
        // 2. Each location should have an airFare.(done)
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Locations boracay = new Boracay();
        Locations coron = new Coron();
        Locations disneyland = new Disneyland();
        Locations elnido = new ElNido();
        Locations fortsantiago = new FortSantiago();
        Locations granada = new Granada();
        
        Tourist tourist = new Me(); 

        boracay.accept(tourist);
        System.out.println();

        coron.accept(tourist);        
        System.out.println();

        disneyland.accept(tourist);
        System.out.println();

        elnido.accept(tourist);
        System.out.println();

        fortsantiago.accept(tourist);
        System.out.println();

        granada.accept(tourist);
        System.out.println();

        System.out.println("Submitted by: Katherine Maegan G. Espinosa");
        }

        
    }


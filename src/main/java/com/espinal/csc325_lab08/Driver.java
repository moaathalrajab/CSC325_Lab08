package com.espinal.csc325_lab08;

/**
 * Driver class.
 *
 * @author Jonathan
 */
public class Driver {

    private static Application configureApplication() {

        Application app;
        GarmentFactory factory;

        // Desired clothing type
        String choice = "I want Professional clothes.";

        if (choice.contains("Professional")) {
            factory = new ProfessionalFactory();
        } else if (choice.contains("Casual")) {
            factory = new CasualFactory();
        } else {
            factory = new PartyFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealContent();
    }
}

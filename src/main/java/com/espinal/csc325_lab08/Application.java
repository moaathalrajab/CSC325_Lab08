package com.espinal.csc325_lab08;

/**
 * Application class. Generates outfit based on supplied GarmentFactory.
 *
 * @author Jonathan
 */
public class Application {
    //Application to describe an outfit

    private Tops tops;
    private Pants pants;
    private Shoes shoes;

    /**
     * Generates a top, pants, shoes according to desire type.
     *
     * @param factory Factory to generate style from.
     */
    public Application(GarmentFactory factory) {
        tops = factory.generateTops();
        pants = factory.generatePants();
        shoes = factory.generateShoes();
    }

    /**
     * Show type of each garment generated.
     */
    public void revealContent() {
        tops.typeOfTop();
        pants.typeOfPants();
        shoes.typeOfShoes();
    }

}

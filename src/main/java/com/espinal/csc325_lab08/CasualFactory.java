package com.espinal.csc325_lab08;

/**
 * CasualFactory is responsible for generating all casual garments.
 *
 * @author Jonathan
 */
public class CasualFactory implements GarmentFactory {

    /**
     * Generates a casual top.
     *
     * @return A casual top object.
     */
    @Override
    public Tops generateTops() {
        return new CasualTop();
    }

    /**
     * Generates a casual pants.
     *
     * @return A casual pants object.
     */
    @Override
    public Pants generatePants() {
        return new CasualPants();
    }

    /**
     * Generates casual shoes.
     *
     * @return A casual shoes object.
     */
    @Override
    public Shoes generateShoes() {
        return new CasualShoes();
    }
}

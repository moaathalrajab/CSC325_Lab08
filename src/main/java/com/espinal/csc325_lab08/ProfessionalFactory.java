package com.espinal.csc325_lab08;

/**
 * ProfessionalFactory is responsible for generating all professional garments.
 *
 * @author Jonathan
 */
public class ProfessionalFactory implements GarmentFactory {

    /**
     * Generates a professional top.
     *
     * @return A professional top object.
     */
    @Override
    public Tops generateTops() {
        return new ProfessionalTop();
    }

    /**
     * Generates professional pants.
     *
     * @return A professional pants object.
     */
    @Override
    public Pants generatePants() {
        return new ProfessionalPants();
    }

    /**
     * Generates professional shoes.
     *
     * @return A professional shoes object.
     */
    @Override
    public Shoes generateShoes() {
        return new ProfessionalShoes();
    }

}

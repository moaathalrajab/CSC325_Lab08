package com.espinal.csc325_lab08;

/**
 * PartyFactory is responsible for generating all party garments.
 *
 * @author Jonathan
 */
public class PartyFactory implements GarmentFactory {

    /**
     * Generates a party top.
     *
     * @return A party top object.
     */
    @Override
    public Tops generateTops() {
        return new PartyTop();
    }

    /**
     * Generates party pants.
     *
     * @return A party pants object.
     */
    @Override
    public Pants generatePants() {
        return new PartyPants();
    }

    /**
     * Generates party shoes.
     *
     * @return A party shoes object.
     */
    @Override
    public Shoes generateShoes() {
        return new PartyShoes();
    }
}

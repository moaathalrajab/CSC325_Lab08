package com.espinal.csc325_lab08;

/**
 * Interface outlining the functions required of a garment factory.
 *
 * @author Jonathan
 */
public interface GarmentFactory {

    Tops generateTops();

    Pants generatePants();

    Shoes generateShoes();
}

package model;

import java.io.Serializable;

public class Vehicul implements Serializable {

    public int nrRoti;
    public static String nume = "Toyota";

    public transient String nrInmatriculare;

    @Override
    public String toString() {
        return "Vehicul{" +
                "nrRoti=" + nrRoti +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                '}';
    }
}

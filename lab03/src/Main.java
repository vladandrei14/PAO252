import model.Produs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] vector1 = {1,2 ,7, 0x56};

        int vector2[] = { 7, 4, 78, -9};

        int[] vector3 = new int[3];

        int[][] matrice = {{1,2}, {3,4}};


        System.out.println(vector1);

        System.out.println(Arrays.toString(vector1));


        Arrays.sort(vector2);
        System.out.println(Arrays.toString(vector2));

        int pozitie = Arrays.binarySearch(vector2, 7);

        System.out.println(pozitie);

        Produs p = new Produs();

    }
}

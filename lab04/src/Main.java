public class Main {


    public static void main(String[] args) {

        Animal a = new Mamifer();


        // Compilation error because a is a Animal type reference and Animal does not have an <canisa> atribute
        // check references.png
        System.out.println(a.canisa);
    }
}

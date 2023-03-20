public class Main {

    public static void main(String[] args) {

        String text = "Ana are mere";
        text.replace("mere","pere").toUpperCase();
        System.out.println(text);

        String a = "Ana";
        String b = a;
        String c = "Ana";
        String d = new String("Ana");
        String e = new String ("Ana");

    }
}
public class Main {

    public static void main(String[] args) {

        String text = "Ana are mere";
        text = text.replace("mere","pere").toUpperCase();
        System.out.println(text);

        String s = "Ana";
        String s2 = new String("Ana");
        String s3 = "Ana";

        System.out.println(s == s2);
        System.out.println(s.equals(s2));

        StringBuilder sb = new StringBuilder();
        sb.append(s).append(s2).append(s3);

    }
}
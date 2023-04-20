import model.Vehicul;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        LocalDate to = LocalDate.now();
        LocalDate from = LocalDate.now().minusYears(2).minusDays(90);

        System.out.println(ChronoUnit.DAYS.between(from, to));


        File file = new File("C:\\Users\\vbalauta\\test.txt");
        Path path = Path.of("C:\\Users\\vbalauta\\test.txt");

        file.createNewFile();

        Reader reader = new FileReader(file);
        Writer writer = new FileWriter("content.txt");

        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream("content2.txt");

        int i = reader.read();
        while(i != -1){
            writer.write(i);
            i = reader.read();
        }
        reader.close();
        writer.close();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.readAllBytes();

        String content = Files.readString(path);
        Files.writeString(Path.of("content2.txt"), content);

        Vehicul v = new Vehicul();
        v.nrRoti = 4;
        v.nrInmatriculare = "B123URS";


        OutputStream os = new FileOutputStream(new File("vehicul.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(v);

        InputStream is = new FileInputStream(new File("vehicul.txt"));
        ObjectInputStream ois = new ObjectInputStream(is);
        Vehicul v2 = (Vehicul) ois.readObject();

        System.out.println(v2.toString());


    }
}
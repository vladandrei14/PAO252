import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        FileLogger fl = new FileLogger();
        fl.log(LogLevel.DEBUG, "Ana are mere!");

        try {
            test();
        } catch (MyException me) {
            me.printStackTrace();
            System.out.println("Catched my exception");
        } catch (Exception e){
            System.out.println("Catched all exceptions");
        }
        finally {
            System.out.println("Print final block!");
        }
    }

    private static void test() throws MyException{
        throw new MyException("CRAPAU");
    }

}
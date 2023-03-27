public class FileLogger implements Logger, Test {

    @Override
    public void log(LogLevel loglevel, String message) {
        //This is how we access interface members with the same name (like constants)
        System.out.println(Logger.config);
        System.out.println(Test.config);

        System.out.println(String.format("%s: %s", loglevel, message));
    }

}

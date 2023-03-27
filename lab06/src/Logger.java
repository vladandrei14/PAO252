public interface Logger {

    //  public identifier is redundant since interfaces dont allow other access modifiers.
    //      the members need to be accessed outside the interface location;
    //  final static keywords are redundant since interface members are CONSTANTS (== final static)
    public final static String config = "config.txt";

    default void logInfo(String message){
        log(LogLevel.INFO, message);
    }

    void log(LogLevel loglevel, String message);
}

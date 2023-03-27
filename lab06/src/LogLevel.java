public enum LogLevel {

    INFO(0), WARNING(1), DEBUG(2), ERROR(3);

    int level;

    LogLevel(int level) {
        this.level = level;
    }

    public int length(){
        return LogLevel.values().length;
    }
}

package Activity;

public enum Impressions {
    CHEERFUL("весел "),
    AFRAID("он испугался"),
    UNSPEAKABLY("несказанно "),
    EXCITING("Прекрасные "),
    FAIRYTALING("сказочные дни"),
    HAPPINESS("счастлив"),
    MOODUP("подъема настроения");

    private String message;
    Impressions (String message){
        this.message = message;
    }

    public String getDescription() {
        return message;
    }
}

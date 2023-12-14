package Enums;

public enum Time {
    FUTURE("будущее "),
    PAST("прошлое "),
    NOW("настоящее ");
    private String message;

    Time (String message){
        this.message = message;
    }

    public String getDescription() {
        return message;
    }

}

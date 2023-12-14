package Activity;

import Characters.Character;

public enum Actions {
    THANKS("поблагодарил ", "поблагодарила "),
    BETOO("был так ", "была так "),
    DONTNEED("не нуждался в пяти эре"),
    DOHAPPY("радует"),
    DONTDENY("отрицать не будет"),
    GOAWAY("прошли"),
    SAW("увидел");

    private final String malemessage;
    private final String femalemessage;

    Actions(String message){
        this.malemessage = message;
        this.femalemessage = message;
    }

    Actions(String malemessage, String femalemessage){
        this.malemessage = malemessage;
        this.femalemessage = femalemessage;
    }

    public String getDescription(Character character) {
        String s = character.isMale() ? malemessage : femalemessage;
        return s;
    }
    public String getDescription() {
        String s = malemessage;
        return s;
    }
}

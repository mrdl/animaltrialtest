package global;

import interfaces.Flyable;
import interfaces.Singable;
import interfaces.Swimmable;
import interfaces.Walkable;
import models.Animal;

import java.util.ArrayList;
import java.util.List;

public class Translator {

    private static Language language = Language.ENGLISH;

    public static String translate(String tag){
        if (tag.equals("rooster_sound")){
            switch (language){
                case ENGLISH: return "Cock-a-doodle-doo";
                case DANISH: return "kykyliky";
                case DUTCH: return "kykyliky";
                case FINNISH: return "kukko kiekuu";
                case FRENCH: return "cocorico";
                case GERMAN: return "kikeriki";
                case GREEK: return "kikeriki";
                case HEBREW: return "coo-koo-ri-koo";
                case HUNGARIAN: return "coo-koo-ri-koo";
                case ITALIAN: return "chicchirichi";
                case JAPANESE: return "ko-ke-kok-ko-o";
                case PORTUGUESE: return "cucurucu";
                case RUSSIAN: return "kukareku";
                case SWEDISH: return "kuckeliku";
                case TURKISH: return "kuk-kurri-kuuu";
                case URDU: return "kuklooku";
                default:
                    return tag;
            }
        }
        return tag;
    }

    public static Language getLanguage() {
        return language;
    }

    public static void setLanguage(Language language) {
        Translator.language = language;
    }
}

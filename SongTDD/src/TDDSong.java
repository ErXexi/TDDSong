import java.util.List;

public class TDDSong {

    private static String animal1 ;
    private static String animal2 ;
    private static String animal3;
    public static String createSong(List<String> animals) {
        int listSize = animals.size();
        String song = "";
        switch (listSize){
            case 1-> song+= songSize1(animals);
            case 2-> song+= songSize2(animals);
            case 3-> song+= songSize3(animals);
            default -> {
                return song;
            }
        }
        return song;
    }

    public static String songSize1(List<String> animals){
        animal1 = animals.get(0);
        String[] frases = fillPhrases();
        return frases[0];
    }

    public static String songSize2(List<String> animals) {
        animal1 = animals.get(0);
        animal2 = animals.get(1);
        String[] frases = fillPhrases();
        return frases[0] + frases[1];
    }

    public static String songSize3(List<String> animals) {
        animal1 = animals.get(0);
        animal2 = animals.get(1);
        animal3 = animals.get(2);
        String[] frases = fillPhrases();
        return frases[0] + frases[1] + frases[2];
    }

    public static String[] fillPhrases(){
        return  new String[]{"\"There was an old lady who swallowed a " + animal1 +".\n" +
                "\"I don't know why she swallowed a " +  animal1 + " - perhaps she'll die!\n\"",
                "\"There was an old lady who swallowed a " + animal2 +
                ".\n\"" + "\"That wriggled and wiggled and tickled inside her.\n\"" +
                "\"She swallowed the " + animal2 + " to catch the "+ animal1 +"\n\"" +
                "\"I don't know why she swallowed a "+ animal1 +" - perhaps she'll die!\n\"",
                "\"There was an old lady who swallowed a "+ animal3 +";\n\"" +
                "" + "\"How absurd to swallow a "+ animal3 +".\n\"" +
                "\"She swallowed the "+ animal3 +" to catch the "+ animal2 +",\n\"" +
                "\"She swallowed the "+ animal2 +" to catch the "+ animal1 +";\n\"" +
                "\"I don't know why she swallowed a "+ animal1 +" - perhaps she'll die!\n\"" +
                "\n"};
    }
}
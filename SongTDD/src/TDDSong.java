import java.util.List;

public class TDDSong {
    public String createSong(List<String> animals) {
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

    public String songSize1(List<String> animals){
        String animal1 = animals.get(0);
        return "\"There was an old lady who swallowed a " + animal1 +".\n" +
                "\"I don't know why she swallowed a " +  animal1 + " - perhaps she'll die!\n\"";
    }

    public String songSize2(List<String> animals) {
        String animal1 = animals.get(0);
        String animal2 = animals.get(1);
        String paragraph = "";
        paragraph += songSize1(animals);
        paragraph += "\"There was an old lady who swallowed a " + animal2 +
                ".\n\"" + "\"That wriggled and wiggled and tickled inside her.\n\"" +
                "\"She swallowed the " + animal2 + " to catch the "+ animal1 +"\n\"" + "\"I don't know why she swallowed a "+ animal1 +" - perhaps she'll die!\n\"";
        return paragraph;
    }

    public String songSize3(List<String> animals) {
        String animal1 = animals.get(0);
        String animal2 = animals.get(1);
        String animal3 = animals.get(2);
        String paragraph = "";
        paragraph += songSize2(animals);
        paragraph += "\"There was an old lady who swallowed a "+ animal3 +";\n\"" +
                "" + "\"How absurd to swallow a "+ animal3 +".\n\"" +
                "\"She swallowed the "+ animal3 +" to catch the "+ animal2 +",\n\"" +
                "\"She swallowed the "+ animal2 +" to catch the "+ animal1 +";\n\"" +
                "\"I don't know why she swallowed a "+ animal1 +" - perhaps she'll die!\n\"" +
                "\n";

        return paragraph;
    }
}
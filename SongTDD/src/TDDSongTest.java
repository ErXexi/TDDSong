import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class TDDSongTest {

    @Test
    public void testVacio(){
        TDDSong t1 = new TDDSong();
        List<String> animals = new ArrayList<>();
        String resultadoEsperado= "";
        String resultadoReal = t1.createSong(animals) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testFly(){
        TDDSong t1 = new TDDSong();
        List<String> animals = new ArrayList<>();
        String animal1 = "fly";
        animals.add(animal1);
        String resultadoEsperado= "\"There was an old lady who swallowed a fly.\n" +
                "\"I don't know why she swallowed a fly - perhaps she'll die!\n\"";
        String resultadoReal = t1.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSpider(){
        TDDSong t1 = new TDDSong();
        List<String> animals = new ArrayList<>();
        String animal1 = "spider";
        animals.add(animal1);
        String resultadoEsperado= "\"There was an old lady who swallowed a spider.\n" +
                "\"I don't know why she swallowed a spider - perhaps she'll die!\n\"";
        String resultadoReal = t1.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }


    @Test
    public void testFlySpider(){
        TDDSong t1 = new TDDSong();
        List<String> animals = new ArrayList<>();
        String animal1 = "fly";
        String animal2 = "spider";
        animals.add(animal1);
        animals.add(animal2);
        String resultadoEsperado= "\"There was an old lady who swallowed a fly.\n" +
                "\"I don't know why she swallowed a fly - perhaps she'll die!\n\"" +
        "\"There was an old lady who swallowed a spider" +
                ".\n\"" + "\"That wriggled and wiggled and tickled inside her.\n\"" +
                "\"She swallowed the spider to catch the fly\n\"" + "\"I don't know why she swallowed a fly - perhaps she'll die!\n\"";
        String resultadoReal = t1.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSpiderFly(){
        TDDSong t1 = new TDDSong();
        List<String> animals = new ArrayList<>();
        String animal1 = "spider";
        String animal2 = "fly";
        animals.add(animal1);
        animals.add(animal2);
        String resultadoEsperado= "\"There was an old lady who swallowed a spider.\n" +
                "\"I don't know why she swallowed a spider - perhaps she'll die!\n\"" +
                "\"There was an old lady who swallowed a fly" +
                ".\n\"" + "\"That wriggled and wiggled and tickled inside her.\n\"" +
                "\"She swallowed the fly to catch the spider\n\"" + "\"I don't know why she swallowed a spider - perhaps she'll die!\n\"";
        String resultadoReal = t1.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testFlySpiderBird(){
        TDDSong t1 = new TDDSong();
        List<String> animals = new ArrayList<>();
        String animal1 = "fly";
        String animal2 = "spider";
        String animal3 = "bird";
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        String resultadoEsperado= "\"There was an old lady who swallowed a fly.\n" +
                "\"I don't know why she swallowed a fly - perhaps she'll die!\n\"" +
                "\"There was an old lady who swallowed a spider" +
                ".\n\"" + "\"That wriggled and wiggled and tickled inside her.\n\"" +
                "\"She swallowed the spider to catch the fly\n\"" + "\"I don't know why she swallowed a fly - perhaps she'll die!\n\"" +
                "\"There was an old lady who swallowed a bird;\n\"" +
                "\"How absurd to swallow a bird.\n\"" +
                "\"She swallowed the bird to catch the spider,\n\"" +
                "\"She swallowed the spider to catch the fly;\n\"" +
                "\"I don't know why she swallowed a fly - perhaps she'll die!\n\"" +
                "\n";

        String resultadoReal = t1.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testBirdFlySpider(){
        TDDSong t1 = new TDDSong();
        List<String> animals = new ArrayList<>();
        String animal1 = "bird";
        String animal2 = "fly";
        String animal3 = "spider";
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        String resultadoEsperado= "\"There was an old lady who swallowed a bird.\n" +
                "\"I don't know why she swallowed a bird - perhaps she'll die!\n\"" +
                "\"There was an old lady who swallowed a fly" +
                ".\n\"" + "\"That wriggled and wiggled and tickled inside her.\n\"" +
                "\"She swallowed the fly to catch the bird\n\"" + "\"I don't know why she swallowed a bird - perhaps she'll die!\n\"" +
                "\"There was an old lady who swallowed a spider;\n\"" +
                "\"How absurd to swallow a spider.\n\"" +
                "\"She swallowed the spider to catch the fly,\n\"" +
                "\"She swallowed the fly to catch the bird;\n\"" +
                "\"I don't know why she swallowed a bird - perhaps she'll die!\n\"" +
                "\n";

        String resultadoReal = t1.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }



}

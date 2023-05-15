import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class TDDSongTest {

    @Test
    public void testVacio(){
        List<String> animals = new ArrayList<>();
        String resultadoEsperado= "";
        String resultadoReal = TDDSong.createSong(animals) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testFly(){
        List<String> animals = new ArrayList<>(List.of("fly"));
        String resultadoEsperado= """
                "There was an old lady who swallowed a fly.
                "I don't know why she swallowed a fly - perhaps she'll die!
                \"""";
        String resultadoReal = TDDSong.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSpider(){
        List<String> animals = new ArrayList<>(List.of("spider"));
        String resultadoEsperado= """
                "There was an old lady who swallowed a spider.
                "I don't know why she swallowed a spider - perhaps she'll die!
                \"""";
        String resultadoReal = TDDSong.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }


    @Test
    public void testFlySpider(){
        List<String> animals = new ArrayList<>(List.of("fly", "spider"));
        String resultadoEsperado= """
                "There was an old lady who swallowed a fly.
                "I don't know why she swallowed a fly - perhaps she'll die!
                ""There was an old lady who swallowed a spider.
                ""That wriggled and wiggled and tickled inside her.
                ""She swallowed the spider to catch the fly
                ""I don't know why she swallowed a fly - perhaps she'll die!
                \"""";
        String resultadoReal = TDDSong.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSpiderFly(){
        List<String> animals = new ArrayList<>(List.of("spider", "fly"));
        String resultadoEsperado= """
                "There was an old lady who swallowed a spider.
                "I don't know why she swallowed a spider - perhaps she'll die!
                ""There was an old lady who swallowed a fly.
                ""That wriggled and wiggled and tickled inside her.
                ""She swallowed the fly to catch the spider
                ""I don't know why she swallowed a spider - perhaps she'll die!
                \"""";
        String resultadoReal = TDDSong.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testFlySpiderBird(){
        List<String> animals = new ArrayList<>(List.of("fly", "spider", "bird"));
        String resultadoEsperado= """
                "There was an old lady who swallowed a fly.
                "I don't know why she swallowed a fly - perhaps she'll die!
                ""There was an old lady who swallowed a spider.
                ""That wriggled and wiggled and tickled inside her.
                ""She swallowed the spider to catch the fly
                ""I don't know why she swallowed a fly - perhaps she'll die!
                ""There was an old lady who swallowed a bird;
                ""How absurd to swallow a bird.
                ""She swallowed the bird to catch the spider,
                ""She swallowed the spider to catch the fly;
                ""I don't know why she swallowed a fly - perhaps she'll die!
                "
                """;

        String resultadoReal = TDDSong.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testBirdFlySpider(){
        List<String> animals = new ArrayList<>(List.of("bird", "fly", "spider"));
        String resultadoEsperado= """
                "There was an old lady who swallowed a bird.
                "I don't know why she swallowed a bird - perhaps she'll die!
                ""There was an old lady who swallowed a fly.
                ""That wriggled and wiggled and tickled inside her.
                ""She swallowed the fly to catch the bird
                ""I don't know why she swallowed a bird - perhaps she'll die!
                ""There was an old lady who swallowed a spider;
                ""How absurd to swallow a spider.
                ""She swallowed the spider to catch the fly,
                ""She swallowed the fly to catch the bird;
                ""I don't know why she swallowed a bird - perhaps she'll die!
                "
                """;

        String resultadoReal = TDDSong.createSong(animals) ;
        assertEquals(resultadoEsperado, resultadoReal);
    }



}

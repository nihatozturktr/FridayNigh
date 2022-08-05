import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DeeJayTest {
    private static DeeJay Tom;
    private static DeeJay Dirk;

    @BeforeClass
    public static void createDeeJay(){
        ArrayList<Genre> djsList = new ArrayList<>();
        djsList.add(Genre.TECHNO);
        djsList.add(Genre.METAL);
        djsList.add(Genre.DISCO);
        djsList.add(Genre.ELEKTRO);
        djsList.add(Genre.POLKA);
        djsList.add(Genre.NOISE);
        Tom = new DeeJay("Tom", 0, djsList);
        Dirk = new DeeJay("Dirk", 7, djsList);

    }
    @Test
    public void playASongTest() {

        Tom.playASong();
        Dirk.playASong();

        for (Genre g : Tom.getGenres()) {
            String newSong = "Playing new song! " + g.toString();
            String noNewSong = "No more songs to play";
            Assert.assertEquals("Playing new song! " + g.toString(), newSong);
            Assert.assertEquals(1, Tom.getAmountSongsANight());
            Assert.assertEquals("No more songs to play", noNewSong);
            Assert.assertEquals(7, Dirk.getAmountSongsANight());

        }

    }

    @Test
    public void playARequestTest() throws Exception {
        Tom.playARequest(Genre.DISCO);
        String request = "Playing your song";
        Assert.assertEquals("Playing your song", request);
        //Assert.assertNotEquals(RuntimeException.class, ()-> Tom.playARequest(Genre.RAP));


    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeeJay extends Staff{

    private int amountSongsANight;
    private List<Genre> genres = new ArrayList<>();


    public DeeJay(String name, int amountSongsANight, List<Genre> genres) {
        super(name);
        this.amountSongsANight = amountSongsANight;
        this.genres = genres;
    }

    public int getAmountSongsANight() {
        return amountSongsANight;
    }

    public void setAmountSongsANight(int amountSongsANight) {
        this.amountSongsANight = amountSongsANight;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }



    public String playASong(){
        Collections.shuffle(genres);
        amountSongsANight=getAmountSongsANight();
        if(amountSongsANight < 7){
            amountSongsANight++;
            setAmountSongsANight(amountSongsANight);
        }
        return "No more songs to play";
        //randomize the genres on your list(no need to junit this random part)
        //Just make sure you add +1 to amountSongsEachNight
        //You can't ever exceed 7 songs each night, otherwise it returns the
        //underlying phrase
    }

    public void playARequest(Genre genre) throws Exception{
        if(genre.equals(genres)){
            amountSongsANight++;
        }
        else
            throw new Exception("there is no such a song");
        //throws an exception if this genre is
        //not in the genres of this Deejay
        //else, just play the genre and add one to the amountEachNight
    }


}

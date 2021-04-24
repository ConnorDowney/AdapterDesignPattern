import java.util.ArrayList;

/**
 * A CD
 * @author Connor Downey
 */
public class CD implements DigitalAlbum{
    private ArrayList<String> songs;
    private int currentIndex;
    
    /**
     * Creates a CD
     * @param song1 A song to add to the array list
     * @param song2 A song to add to the array list
     * @param song3 A song to add to the array list
     * @param song4 A song to add to the array list
     * @param song5 A song to add to the array list
     */
    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        currentIndex = 0;
    }

    @Override
    /**
     * Plays the cd from the beginning
     * @return The song name
     */
    public String playFromBeginning() {
        currentIndex = 1;
        return "Playing song 1: "+songs.get(0);
    }

    @Override
    /**
     * Plays a song given a song number
     * @param num Song number
     * @return Correct play statement
     */
    public String playSong(int num) {
        if(num<1 || num>5) {
            return "Not a valid song number";
        }
        currentIndex = num;
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    @Override
    /**
     * Rewinds once and returns the number unless it is already at the beginning
     * @return The song number
     */
    public String prevSong() {
        if(currentIndex==0) {
            return "Already at the beginning of the CD";
        }
        currentIndex--;
        return "Skipping back and playing: "+songs.get(currentIndex-1);
    }

    @Override
    /**
     * Plays the current song and advances to the next index
     * @return The song name and number
     */
    public String nextSong() {
        if(currentIndex==5) {
            currentIndex = 0;
        }
        else {
            currentIndex++;
        }
        return "Playing: "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    @Override
    /**
     * Pauses the cd
     * @return Pause statement
     */
    public String stop() {
        currentIndex = 0;
        return "Stopping CD";
    }

    @Override
    /**
     * Pauses the cd
     * @return Pause statement
     */
    public String pause() {
        return "Pausing...";
    }
    
}

import java.util.ArrayList;

/**
 * A Cassett
 * @author Connor Downey
 */
public class Cassett implements AnalogAlbum{
    private ArrayList<String> songs;
    private int currentIndex;
    
    /**
     * Creates a Cassett
     * @param song1 A song to add to the array list
     * @param song2 A song to add to the array list
     * @param song3 A song to add to the array list
     * @param song4 A song to add to the array list
     * @param song5 A song to add to the array list
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
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
     * Plays the current song and advances to the next index
     * @return The song name and number
     */
    public String play() {
        currentIndex++;
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    @Override
    /**
     * Rewinds once and returns the number unless it is already at the beginning
     * @return The song number
     */
    public String rewind() {
        if(currentIndex==0) {
            return "Fully Re-Wound";
        }
        currentIndex--;
        return "Rewinding to song "+(currentIndex+1);
    }

    @Override
    /**
     * Fast forwards to the next song and returns the index. If it is on the last song it will advise the user that it has reached the end, and if it was already at the end then it will advise the user to rewind
     * @return The correct statement
     */
    public String ffwd() {
        if(currentIndex==4) {
            currentIndex++;
            return "Forwarded to  the end of the cassett";
        }
        if(currentIndex==5)
        {
            return "At the end of the cassett you need to rewind";
        }  
        currentIndex++;
        return "Forward to song "+(currentIndex+1);
    }

    @Override
    /**
     * Pauses the cassett
     * @return Pause statement
     */
    public String pause() {
        return "Pausing...";
    }

    @Override
    /**
     * Stops the cassett
     * @return The stop and eject statement
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
    
}

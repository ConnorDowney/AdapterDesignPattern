import java.util.ArrayList;

public class Cassett implements AnalogAlbum{
    private ArrayList<String> songs;
    private int currentIndex;
    
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
    public String play() {
        currentIndex++;
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    @Override
    public String rewind() {
        if(currentIndex==0) {
            return "Fully Re-Wound";
        }
        currentIndex--;
        return "Rewinding to song "+(currentIndex+1);
    }

    @Override
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
    public String pause() {
        return "Pausing...";
    }

    @Override
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
    
}

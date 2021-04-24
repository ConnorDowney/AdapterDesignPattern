import java.util.ArrayList;

public class CD implements DigitalAlbum{
    private ArrayList<String> songs;
    private int currentIndex;
    
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
    public String playFromBeginning() {
        currentIndex = 1;
        return "Playing song 1: "+songs.get(0);
    }

    @Override
    public String playSong(int num) {
        if(num<1 || num>5) {
            return "Not a valid song number";
        }
        currentIndex = num;
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    @Override
    public String prevSong() {
        if(currentIndex==0) {
            return "Already at the beginning of the CD";
        }
        currentIndex--;
        return "Skipping back and playing: "+songs.get(currentIndex-1);
    }

    @Override
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
    public String stop() {
        currentIndex = 0;
        return "Stopping CD";
    }

    @Override
    public String pause() {
        return "Pausing...";
    }
    
}

/**
 * An Analog Adapter
 * @author Connor Downey
 */
public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    /**
     * Creates an Analog Adapter
     * @param album Album passed through
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    @Override
    /**
     * Calls the nextSong method
     * @return String from nextSong method
     */
    public String play() {
        return album.nextSong();
    }

    @Override
    /**
     * Calls the prevSong method
     * @return String from prevSong method
     */
    public String rewind() {
        return album.prevSong();
    }

    @Override
    /**
     * Calls the nextSong method
     * @return String from nextSong method
     */
    public String ffwd() {
        return album.nextSong();
    }

    @Override
    /**
     * Calls the pause method
     * @return String from pause method
     */
    public String pause() {
        return album.pause();
    }

    @Override
    /**
     * Calls the stop method
     * @return String from stop method
     */
    public String stopEject() {
        return album.stop();
    }
    
}

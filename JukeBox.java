import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs;
    private Queue<String> songQueue = new LinkedList<String>();

    /**
     * get songs from dataloader and populate arraylist of songs from read file
     */
    private JukeBox() {
        songs = DataLoader.getSongs();
    }

    /**
     * 
     * @returncreate instance of a jukebox and or return it
     */
    public static JukeBox getInstance() {
        if (jukeBox == null) {
            System.out.println("Creating a juke box");
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * 
     * @return return a string for the current song playing while at the same time
     *         popping it from queue
     */
    public String playNextSong() {
        return "Let's jam out to " + songQueue.remove();
    }

    /**
     * 
     * @param title parameter input is song to be searched for in the array list of
     *              songs
     * @return if the song is found (by title) it is added to the queue, if it is
     *         not found a message is displayed telling the user it was not found
     */
    public String requestSong(String title) {
        for (Song i : songs) {
            // System.out.println(i.getTitle() + " vs " + title);
            if (i.getTitle().equals(title)) {
                songQueue.add(title);
                return title + " is number: " + songQueue.size() + " in the queue.";
            }
        }
        return "Sorry, we do not have that song.";
    }

    /**
     * 
     * @return whether or no the queue of songs is empty
     */
    public Boolean hasMoreSongs() {
        return !songQueue.isEmpty();
    }
}

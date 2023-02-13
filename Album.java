import java.util.Iterator;

public class Album {
    static final int MAX_SONGS = 20;
    private Song[] songs = new Song[MAX_SONGS];
    private int numOfSongs = 0;
    private String name;

    /**
     * 
     * @param name set the album name
     */
    public Album(String name) {
        this.name = name;
    }

    /**
     * 
     * @param name   takes in name of the song
     * @param artist name of the artist
     * @param length length of the song
     * @param genre  genre of the music
     * @return this will return a false if the album is at maximum capacity, true
     *         othertise and add it to the song array
     */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        if (numOfSongs < MAX_SONGS) {
            Song newSong = new Song(name, artist, length, genre);
            songs[numOfSongs] = newSong;
            numOfSongs++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @return this will return a new song iterator for the currect song which is
     *         the position of the song on the album
     */
    public AlbumIterator createIterator() {
        return new AlbumIterator(songs);
    }

    /**
     * 
     * @return this will return the song name
     */
    public String getName() {
        return this.name;
    }
}
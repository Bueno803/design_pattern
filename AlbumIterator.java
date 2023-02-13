public class AlbumIterator implements Iterator {
    /**
     * Array of songs
     * integer storing the position of the song in the album
     */
    private Song[] song;
    private int position;

    /**
     * 
     * @param songs initialize this song to currect song passed in
     */
    public AlbumIterator(Song[] songs) {
        this.song = songs;
    }

    /**
     * @return false you are at the end of the album list or the album is empty,
     *         true otherwise
     */
    public boolean hasNext() {
        if (position >= song.length || song[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @return the next song in the album array
     */
    public Song next() {
        if (!hasNext())
            return null;
        Song nextSong = song[position];
        position++;
        return nextSong;
    }
}
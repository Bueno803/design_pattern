public class Song {

    private String title;
    private String artist;

    /**
     * 
     * @param title  is set to object song title
     * @param artist is set to object song artist
     */
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    /**
     * 
     * @return returns current song title
     */
    public String getTitle() {
        // System.out.println(title);
        return title;
    }

    /**
     * @return concatenated title and artist string
     */
    public String toString() {
        return "Title: " + title + " Artist: " + artist;
    }
}

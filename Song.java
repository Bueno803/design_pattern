public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    /**
     * 
     * @param name   sets the name of the current song
     * @param artist sets artist who made the song
     * @param length sets length of the song as a double
     * @param genre  sets genre of the song
     */
    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * @return returns the string displaying current song, artist, length and genre
     */
    public String toString() {
        return name + " by " + artist + " category: " +
                genre + " length: " + length + " min";
    }
}
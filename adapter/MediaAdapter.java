package adapter;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;  

public class MediaAdapter implements Media {
    private LittleMedia littleMedia;

    /**
     * constructor for a media adapter
     * @param littleMedia set current instance of little media to passed in little media
     */
    public MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;
    }

    /**
     * get title from LittleBook
     * @return book title
     */
    public String getTitle() {
        return littleMedia.getTitle();
    }

    /**
     * create an instance of an Author, get the LittleBook method for the author which is a first name and last name
     * that is separated with a space. Use an array to split the text by space. Initially the Author object with
     * first and last name of author from LittleBook
     * @return the Author object which contains the first and last name of an author
     */
    public Author getAuthor() {
        String[] splitStr = littleMedia.getAuthor().split(" ");
        Author author = new Author(splitStr[0], splitStr[1]);

        return author;
    }

    /**
     * get the description of a LittleBook
     * @return the string description of a LittleBook
     */
    public String getDescription() {
        return littleMedia.getDescription();
    }

    /**
     * add the review of LittleBook in the littlemedia method. THe first param is a username which is just first
     * name and last name separated by a space
     * @param firstName First name of reviewer
     * @param lastName Last name of reviewer
     * @param date Date of the review
     * @param rating Rating of the book
     * @param comment the comment the reviewer left of the book
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        int tempRating = (int)rating;
        littleMedia.addReview(firstName+" "+lastName, date, tempRating, comment);
    }

    /**
     * get the review of the LittleBook as an ArrayList of strings. Separate the review params by a space
     * between each value and enter them into a Review Object. Add each review (Created by helper method) to 
     * an ArrayList of Reviews.
     * @return The ArrayList of Reviews
     */
    public ArrayList<Review> getReviews() {
        ArrayList<String> reviewStrings = littleMedia.getReviews();
        String[] splitStr;
        ArrayList<Review> returnList = new ArrayList<Review>();

        String firstName = "";
        String lastName = "";
        double rating;
        String curDate = "";
        Date date = new Date();
        String comment = "";
        int j = 1;
        char rate;

        for(String i : reviewStrings) {
            j=1;
            firstName = "";
            lastName = "";
            curDate = "";
            comment = "";
            
            for(; j < i.length(); j++) {
                if (i.charAt(j) == '-') {
                    j+=2;
                    break;
                }
            }

            for(; j < i.length(); j++) {
                if (i.charAt(j) == '.') {
                    j += 5;
                    break;
                } else {
                    comment +=  i.charAt(j);
                }
            }

            for (; j < i.length(); j++) {
                if (i.charAt(j) == ' ') {
                    j++;
                    break;
                } else {
                    firstName +=  i.charAt(j);
                }
            }

            for (; j < i.length(); j++) {
                if (i.charAt(j) == ' ') {
                    j+=3;
                    break;
                } else {
                    lastName +=  i.charAt(j);
                }
            }

            for (; j < i.length(); j++) {
                if (i.charAt(j) == ' ') {
                    j++;
                    break;
                } else {
                    curDate +=  i.charAt(j);
                }
            }

            rate = i.charAt(0);
            rating = (double) (rate - '0');
            try {
                date = dateConverter(curDate);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // comment = splitStr[4];

            returnList.add(addReviewHelper(firstName, lastName, date, rating, comment));
            //splitStr = null;
        }
        return returnList;
    }

    /**
     * Helper method that creates a review and enter param values into it's constructor.
     * @param firstName First name of reviewer
     * @param lastName Last name of reviewer
     * @param date Date of the review
     * @param rating Rating of the book
     * @param comment the comment the reviewer left of the book
     * @return The review object
     */
    public Review addReviewHelper(String firstName, String lastName, Date date, double rating, String comment) {
        Review returnReview = new Review(firstName, lastName, date, rating, comment);
        return returnReview;
    }

    /**
     * create a Data Formatter to take in a date as a string and return it as a Date Object
     * @param dateString date as a string
     * @return date as a Date object
     * @throws ParseException
     */
    public Date dateConverter(String dateString) throws ParseException {
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        Date date1=formatter1.parse(dateString);
        return date1;
    }
}

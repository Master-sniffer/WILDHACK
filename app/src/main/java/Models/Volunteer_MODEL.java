package Models;


public class Volunteer_MODEL {

    private int VOL_ID;
    private String VOL_NAME;
    private String VOL_SURNAME;
    private String VOL_MIDDLENAME;

    private String VOL_DATEOFBIRTH;

    private String VOL_EMAIL;
    private String VOL_TELEPHONE;
    private String VOL_SOCIALNETWORK;

    private String VOL_PLACE_WHERE_LIVES;
    private String VOL_EXPERIENCE;
    private String VOL_ACTIONS;
    private String VOL_FAR_AWAY;


    public Volunteer_MODEL() {
    }

    public Volunteer_MODEL(int VOL_ID, String VOL_NAME, String VOL_SURNAME, String VOL_MIDDLENAME, String VOL_DATEOFBIRTH, String VOL_EMAIL, String VOL_TELEPHONE, String VOL_SOCIALNETWORK, String VOL_PLACE_WHERE_LIVES, String VOL_EXPERIENCE, String VOL_ACTIONS, String VOL_FAR_AWAY) {
        this.VOL_ID = VOL_ID;
        this.VOL_NAME = VOL_NAME;
        this.VOL_SURNAME = VOL_SURNAME;
        this.VOL_MIDDLENAME = VOL_MIDDLENAME;
        this.VOL_DATEOFBIRTH = VOL_DATEOFBIRTH;
        this.VOL_EMAIL = VOL_EMAIL;
        this.VOL_TELEPHONE = VOL_TELEPHONE;
        this.VOL_SOCIALNETWORK = VOL_SOCIALNETWORK;
        this.VOL_PLACE_WHERE_LIVES = VOL_PLACE_WHERE_LIVES;
        this.VOL_EXPERIENCE = VOL_EXPERIENCE;
        this.VOL_ACTIONS = VOL_ACTIONS;
        this.VOL_FAR_AWAY = VOL_FAR_AWAY;
    }

    @Override
    public String toString() {
        return "Volunteer_MODEL{" +
                "VOL_ID=" + VOL_ID +
                ", VOL_NAME='" + VOL_NAME + '\'' +
                ", VOL_SURNAME='" + VOL_SURNAME + '\'' +
                ", VOL_MIDDLENAME='" + VOL_MIDDLENAME + '\'' +
                ", VOL_DATEOFBIRTH='" + VOL_DATEOFBIRTH + '\'' +
                ", VOL_EMAIL='" + VOL_EMAIL + '\'' +
                ", VOL_TELEPHONE='" + VOL_TELEPHONE + '\'' +
                ", VOL_SOCIALNETWORK='" + VOL_SOCIALNETWORK + '\'' +
                ", VOL_PLACE_WHERE_LIVES='" + VOL_PLACE_WHERE_LIVES + '\'' +
                ", VOL_EXPERIENCE='" + VOL_EXPERIENCE + '\'' +
                ", VOL_ACTIONS='" + VOL_ACTIONS + '\'' +
                ", VOL_FAR_AWAY='" + VOL_FAR_AWAY + '\'' +
                '}';
    }

    public int getVOL_ID() {
        return VOL_ID;
    }

    public void setVOL_ID(int VOL_ID) {
        this.VOL_ID = VOL_ID;
    }

    public String getVOL_NAME() {
        return VOL_NAME;
    }

    public void setVOL_NAME(String VOL_NAME) {
        this.VOL_NAME = VOL_NAME;
    }

    public String getVOL_SURNAME() {
        return VOL_SURNAME;
    }

    public void setVOL_SURNAME(String VOL_SURNAME) {
        this.VOL_SURNAME = VOL_SURNAME;
    }

    public String getVOL_MIDDLENAME() {
        return VOL_MIDDLENAME;
    }

    public void setVOL_MIDDLENAME(String VOL_MIDDLENAME) {
        this.VOL_MIDDLENAME = VOL_MIDDLENAME;
    }

    public String getVOL_DATEOFBIRTH() {
        return VOL_DATEOFBIRTH;
    }

    public void setVOL_DATEOFBIRTH(String VOL_DATEOFBIRTH) {
        this.VOL_DATEOFBIRTH = VOL_DATEOFBIRTH;
    }

    public String getVOL_EMAIL() {
        return VOL_EMAIL;
    }

    public void setVOL_EMAIL(String VOL_EMAIL) {
        this.VOL_EMAIL = VOL_EMAIL;
    }

    public String getVOL_TELEPHONE() {
        return VOL_TELEPHONE;
    }

    public void setVOL_TELEPHONE(String VOL_TELEPHONE) {
        this.VOL_TELEPHONE = VOL_TELEPHONE;
    }

    public String getVOL_SOCIALNETWORK() {
        return VOL_SOCIALNETWORK;
    }

    public void setVOL_SOCIALNETWORK(String VOL_SOCIALNETWORK) {
        this.VOL_SOCIALNETWORK = VOL_SOCIALNETWORK;
    }

    public String getVOL_PLACE_WHERE_LIVES() {
        return VOL_PLACE_WHERE_LIVES;
    }

    public void setVOL_PLACE_WHERE_LIVES(String VOL_PLACE_WHERE_LIVES) {
        this.VOL_PLACE_WHERE_LIVES = VOL_PLACE_WHERE_LIVES;
    }

    public String getVOL_EXPERIENCE() {
        return VOL_EXPERIENCE;
    }

    public void setVOL_EXPERIENCE(String VOL_EXPERIENCE) {
        this.VOL_EXPERIENCE = VOL_EXPERIENCE;
    }

    public String getVOL_ACTIONS() {
        return VOL_ACTIONS;
    }

    public void setVOL_ACTIONS(String VOL_ACTIONS) {
        this.VOL_ACTIONS = VOL_ACTIONS;
    }

    public String getVOL_FAR_AWAY() {
        return VOL_FAR_AWAY;
    }

    public void setVOL_FAR_AWAY(String VOL_FAR_AWAY) {
        this.VOL_FAR_AWAY = VOL_FAR_AWAY;
    }
}


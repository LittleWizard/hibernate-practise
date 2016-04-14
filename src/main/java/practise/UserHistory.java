package practise;


import java.util.Date;

public class UserHistory {

    private int id;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private User user;


    public UserHistory() {

    }

    public UserHistory(Date entryTime, String entry) {
        super();
        this.entryTime = entryTime;
        this.entry = entry;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        UserHistory that = (UserHistory) o;
//
//        if (entryTime != null ? !entryTime.equals(that.entryTime) : that.entryTime != null) return false;
//        return !(entry != null ? !entry.equals(that.entry) : that.entry != null);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = entryTime != null ? entryTime.hashCode() : 0;
//        result = 31 * result + (entry != null ? entry.hashCode() : 0);
//        return result;
//    }


    private Date entryTime;
    private String entry;
}

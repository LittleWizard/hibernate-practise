package practise;


public class GoalAlert {

    private int id;

    public GoalAlert(String message) {
        super();
        this.message = message;
    }
    public GoalAlert() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}

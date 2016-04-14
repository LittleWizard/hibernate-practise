package practise;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public ProteinData getProteinData() {
        return proteinData;
    }

    public void setProteinData(ProteinData proteinData) {
        this.proteinData = proteinData;
        proteinData.setUser(this);
    }

  //  private ProteinData proteinData = new ProteinData();

    private ProteinData proteinData;

    public User() {
        setProteinData(new ProteinData());
    }



    /*public Set<UserHistory> getHistory() {
        return history;
    }

    public void setHistory(Set<UserHistory> history) {
        this.history = history;
    }

    private Set<UserHistory> history = new HashSet<UserHistory>();*/


    public List<UserHistory> getHistory() {
        return history;
    }

    public void setHistory(List<UserHistory> history) {
        this.history = history;
    }

    private List<UserHistory> history = new ArrayList<UserHistory>();

    public void addHistory(UserHistory history) {
        history.setUser(this);
        this.history.add(history);
    }

   /* public GoalAlert getGoalAlert() {
        return goalAlert;
    }

    public void setGoalAlert(GoalAlert goalAlert) {
        this.goalAlert = goalAlert;
    }

    private GoalAlert goalAlert;*/

    public Set<GoalAlert> getGoalAlerts() {
        return goalAlerts;
    }

    public void setGoalAlerts(Set<GoalAlert> goalAlerts) {
        this.goalAlerts = goalAlerts;
    }

    private Set<GoalAlert> goalAlerts = new HashSet<>();

}

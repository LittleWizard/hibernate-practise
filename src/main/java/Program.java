import org.hibernate.Session;
import practise.GoalAlert;
import practise.HibernateUtilities;
import practise.User;
import practise.UserHistory;

import java.util.Date;

//docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 -d mysql


public class Program {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Session session = HibernateUtilities.getSessionFactory().openSession();

        session.beginTransaction();

        User user = new User();
        user.setName("wizard");
      //  user.getHistory().add(new UserHistory(new Date(), "Set name to wizard"));
        user.addHistory(new UserHistory(new Date(), "Set name to wizard"));
        user.getProteinData().setGoal(200);
        user.getProteinData().setTotal(0);

      //  user.getHistory().add(new UserHistory(new Date(), "Set the goal to 200"));

        user.addHistory(new UserHistory(new Date(), "Set the goal to 200"));

       /* user.setGoalAlert(new GoalAlert("Very good !!!!"));*/

        user.getGoalAlerts().add(new GoalAlert("Very good !!!!"));
        user.getGoalAlerts().add(new GoalAlert("You did it!!!!"));

        session.save(user);
        session.getTransaction().commit();

        session.beginTransaction();
        User loadedUser = session.get(User.class, 1);
        System.out.println("loaded user name " + loadedUser.getName());
        System.out.println(loadedUser.getProteinData().getTotal());


        for(UserHistory history: loadedUser.getHistory()) {
            System.out.println(history.getEntryTime().toString() + " " + history.getEntry());
        }

        loadedUser.getProteinData().setTotal(loadedUser.getProteinData().getTotal() + 50);
        //loadedUser.getHistory().remove(1);
        //loadedUser.getHistory().add(new UserHistory(new Date(), "Added 50 protein"));
        user.addHistory(new UserHistory(new Date(), "Added 50 protein"));
        loadedUser.setName("Tanmoy Majumdar");
       // session.save(loadedUser);

        session.getTransaction().commit();

        session.close();
        HibernateUtilities.getSessionFactory().close();
    }
}

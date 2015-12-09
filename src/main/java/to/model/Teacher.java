package to.model;

import java.util.List;

/**
 * Created by wikla on 09.12.15.
 */
public class Teacher extends User {

    private List<Group> groups;
    private List<Task> tasks;

    public Teacher(String firstName, String lastName, String username, List<Group> groups, List<Task> tasks) {
        super(firstName, lastName, username);
        this.groups = groups;
        this.tasks = tasks;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}

package to.model;

import java.util.Date;
import java.util.List;

/**
 * Created by wikla on 09.12.15.
 */
public class Task {

    private Teacher teacher;
    private List<Group> groups;
    private Date dueDate;
    private int timeLimit;
    private String testInput;
    private String testOutput;

    public Task(Teacher teacher, List<Group> groups, Date dueDate, int timeLimit, String testInput, String testOutput) {
        this.teacher = teacher;
        this.groups = groups;
        this.dueDate = dueDate;
        this.timeLimit = timeLimit;
        this.testInput = testInput;
        this.testOutput = testOutput;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getTestInput() {
        return testInput;
    }

    public void setTestInput(String testInput) {
        this.testInput = testInput;
    }

    public String getTestOutput() {
        return testOutput;
    }

    public void setTestOutput(String testOutput) {
        this.testOutput = testOutput;
    }
}

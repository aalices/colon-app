package to.model;

import java.util.List;

/**
 * Created by wikla on 09.12.15.
 */
public class Student extends User{

    private List<Solution> solutions;

    public Student(String firstName, String lastName, String username, List<Solution> solutions) {
        super(firstName, lastName, username);
        this.solutions = solutions;
    }

    public List<Solution> getSolutions() {
        return solutions;
    }

    public void setSolutions(List<Solution> solutions) {
        this.solutions = solutions;
    }

}

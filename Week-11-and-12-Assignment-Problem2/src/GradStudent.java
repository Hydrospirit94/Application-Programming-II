public class GradStudent extends Student {

    private int GREScore;

    public int getGREScore() {
        return GREScore;
    }

    public GradStudent(String studentID, String studentName, int GREScore) {
        super(studentID, studentName);
        this.GREScore = GREScore;
    }
}

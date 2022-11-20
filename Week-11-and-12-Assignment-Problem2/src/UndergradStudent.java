public class UndergradStudent extends Student {

    private int SATScore;
    private int ACTScore;

    public int getSATScore() {
        return SATScore;
    }

    public int getACTScore() {
        return ACTScore;
    }

    public UndergradStudent(String studentID, String studentName, int SATScore, int ACTScore) {
        super(studentID, studentName);
        this.SATScore = SATScore;
        this.ACTScore = ACTScore;
    }
}

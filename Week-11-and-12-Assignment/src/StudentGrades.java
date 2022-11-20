public class StudentGrades {

    private int studentID;
    private double grades[];

    public StudentGrades() {

        grades = new double[5];

        for(int i = 0; i < grades.length; i++){
            grades[i] = 0;
        }
    }

    public StudentGrades(int studentID, double[] studentGrades) {
        this.studentID = studentID;
        this.grades = grades;
    }

    public int getStudentID() {
        return studentID;

    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;

    }

    public double[] getStudentGrades() {
        return grades;

    }

    public void setStudentGrades(double[] grades) {
        this.grades = grades;

    }

    public void printStudentGrades(){

        for(int i = 0; i < grades.length; i++){
            System.out.println(grades[i]);
        }
    }

    public void updateStudentGrade(int studentID, double grade){
        grades[studentID] = grade;
    }

}

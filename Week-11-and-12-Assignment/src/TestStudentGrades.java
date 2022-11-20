public class TestStudentGrades {

    public static void main(String[] args){

        StudentGrades stGr1 = new StudentGrades();

        int studentID = 0;
        double[] grades = new double[5];

        double[] testGetter = stGr1.getStudentGrades();

        for(int i = 0; i < grades.length; i++){
            System.out.println(testGetter[i]);
        }

        grades[studentID] = 5.0;
        stGr1.setStudentGrades(grades);
        double[] gradeGetter = stGr1.getStudentGrades();

        for(int i = 0; i < grades.length; i++){
            System.out.println(gradeGetter[i]);
        }

        stGr1.printStudentGrades();

        StudentGrades stGr2 = new StudentGrades(studentID, grades);

        stGr2.updateStudentGrade(2,40.5);
    }
}

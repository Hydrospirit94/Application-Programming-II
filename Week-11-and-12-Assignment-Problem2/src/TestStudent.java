public class TestStudent {

    public static void main(String[]args){

        Student stuObj1[] = new Student[6];

        stuObj1[0] = new Student("1234", "Nick");
        stuObj1[1] = new Student("2761", "Ben");
        stuObj1[2] = new GradStudent("5678", "Bobby", 300);
        stuObj1[3] = new GradStudent("5942", "Alice", 335);
        stuObj1[4] = new UndergradStudent("0101", "Stan", 1276, 32);
        stuObj1[5] = new UndergradStudent("9223", "Corey", 1490, 27);

        System.out.println("Student ID: " + ((Student)stuObj1[1]).getStudentID());
        System.out.println("Student Name: " + ((Student)stuObj1[1]).getStudentName());

        System.out.println("Student ID: " + ((GradStudent)stuObj1[3]).getStudentID());
        System.out.println("Student Name: " + ((GradStudent)stuObj1[3]).getStudentName());
        System.out.println("GRE Score: " + ((GradStudent)stuObj1[3]).getGREScore());

        System.out.println("Student ID: " + ((UndergradStudent)stuObj1[5]).getStudentID());
        System.out.println("Student Name: " + ((UndergradStudent)stuObj1[5]).getStudentName());
        System.out.println("SAT Score: " + ((UndergradStudent)stuObj1[5]).getSATScore());
        System.out.println("ACT Score: " + ((UndergradStudent)stuObj1[5]).getACTScore());
    }
}

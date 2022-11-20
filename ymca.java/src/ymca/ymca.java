package ymca;
import javax.swing.JOptionPane;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class ymca {
    public static void main(String[] args) {
        int mcount = -1, i;
        int[] code = new int[100];
        String[] type = new String[100];
        String[] name = new String[100];
        int[] age = new int[100];
        String[] gender = new String[100];
        double[] payment = new double[100];

        String[] classname = new String[100];
        int[] membercode = new int[100];
        int rCount = -1;

        int selection;
        String snumber;
        mcount = read_member(mcount, code, name, type, age, gender, payment);
        rCount = read_registration(rCount, membercode, classname);
        selection = menu();
        while (selection != 4) {
            if (selection == 1)
                mcount = Modify_member(mcount, code, name, type, age, gender, payment);
            else if (selection == 2)
                rCount = Modify_registration(rCount, membercode, classname);
            else if (selection == 3)
                Report(rCount, membercode, classname, mcount, code, name, type, age, gender, payment);
            selection = menu();
        }//while loop
        exit_program(mcount, rCount, code, classname, membercode, name, type, age, gender, payment);
        System.exit(0);
    }//main method
//*******************************************************************


    public static int read_member(int mcount, int[] code, String[] name, String[] type, int[] age, String[] gender, double[] payment) {
        int i;
        String newLine;
        try {
            //define a file variable for Buffered read
            BufferedReader member_file = new BufferedReader(new FileReader("member.txt"));
            //read lines in file until there are no more lines in the file to read
            while ((newLine = member_file.readLine()) != null) {
                //there is a "#" between each data item in each line
                StringTokenizer delimiter = new StringTokenizer(newLine, "#");
                mcount = mcount + 1;
                code[mcount] = Integer.parseInt(delimiter.nextToken());
                name[mcount] = delimiter.nextToken();
                type[mcount] = delimiter.nextToken();
                age[mcount] = Integer.parseInt(delimiter.nextToken());
                gender[mcount] = delimiter.nextToken();
                payment[mcount] = Double.parseDouble(delimiter.nextToken());
            }//while loop
            member_file.close();
        }//end try
        catch (IOException error) {
            //there was an error on the file writing
            System.out.println("Error on file read " + error);
        }//error on read
        return mcount;
    }
//*******************************************************************


    public static int read_registration(int rCount, int[] membercode, String[] classname) {
        String newLine;
        try {
            BufferedReader register_file = new BufferedReader(new FileReader("register.txt"));

            while ((newLine = register_file.readLine()) != null) {

                StringTokenizer delimiter = new StringTokenizer(newLine, "#");
                rCount = rCount + 1;
                membercode[rCount] = Integer.parseInt(delimiter.nextToken());
                classname[rCount] = delimiter.nextToken();
            }
            register_file.close();
        } catch (IOException error) {
            System.out.println("Error on file read " + error);
        }
        return rCount;
    }
//*******************************************************************

    public static int menu() {
        String snum;
        int selection;
        String Output = "Pittsburgh Area YMCA" + "\n" +
                "1. Add/Modify Member Information" + "\n" +
                "2. Add/Modify Class Registrations " + "\n" +
                "3. Report Section" + "\n" +
                "4. Exit the System" + "\n" + "\n" +
                "Please make your selection";
        snum = JOptionPane.showInputDialog(null,
                Output, "", JOptionPane.QUESTION_MESSAGE);
        selection = Integer.parseInt(snum);
        return selection;
    }
//*******************************************************************

    public static int Modify_member(int mcount, int[] code, String[] name, String[] type, int[] age, String[] gender, double[] payment) {
        String value;
        int select;
        int delvalue, position = 0, i;
        int modvalue, changeit;
        String output = "Modify Member Information" + "\n" +
                "1. Add Member" + "\n" +
                "2. Modify Member" + "\n" +
                "3. Delete Member" + "\n" +
                "4. Exit Modify" + "\n" +
                "please make your selection ";
        value = JOptionPane.showInputDialog(null,
                output, " ", JOptionPane.QUESTION_MESSAGE);
        select = Integer.parseInt(value);
        while (select != 4) {
            if (select == 1) {
                mcount = mcount + 1;
                output = "Enter the ID";
                value = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);
                code[mcount] = Integer.parseInt(value);


                output = "Enter the Name";
                name[mcount] = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);


                output = "Enter the Type";
                type[mcount] = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);


                output = "Enter the age";
                value = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);
                age[mcount] = Integer.parseInt(value);


                output = "Enter the Gender";
                gender[mcount] = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);


                output = "Enter the Payment";
                payment[mcount] = Double.parseDouble(JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE));
            } else if (select == 2) {
                output = " Enter the ID to modify ";
                value = JOptionPane.showInputDialog(null, output, " ", JOptionPane.QUESTION_MESSAGE);
                modvalue = Integer.parseInt(value);

                for (i = 0; i <=mcount; ++i) {
                    if (code[i] == modvalue) {
                        position = i;
                    }
                }

                output = "1. Change the ID " + "\n" +
                        "2. Change the Name " + "\n" +
                        "3. Change the Type " + "\n" +
                        "4. Change the Age " + "\n" +
                        "5. Change the Gender " + "\n" +
                        "6. Change the Payment " + "\n" +
                        "Enter Your selection ";
                value = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);
                changeit = Integer.parseInt(value);
                if (changeit == 1) {
                    output = "Enter the NEW ID";
                    code[position] = Integer.parseInt(JOptionPane.showInputDialog(null,
                            output, " ", JOptionPane.QUESTION_MESSAGE));
                } else if (changeit == 2) {
                    output = "Enter the NEW Name";
                    value = JOptionPane.showInputDialog(null,
                            output, " ", JOptionPane.QUESTION_MESSAGE);
                    name[position] = value;
                } else if (changeit == 3) {
                    output = "Enter the NEW Type";
                    value = JOptionPane.showInputDialog(null,
                            output, " ", JOptionPane.QUESTION_MESSAGE);
                    type[position] = value;
                } else if (changeit == 4) {
                    output = "Enter the NEW Age";
                    value = JOptionPane.showInputDialog(null,
                            output, " ", JOptionPane.QUESTION_MESSAGE);
                    age[position] = Integer.parseInt(value);
                } else if (changeit == 5) {
                    output = "Enter the NEW Gender";
                    value = JOptionPane.showInputDialog(null,
                            output, " ", JOptionPane.QUESTION_MESSAGE);
                    gender[position] = value;
                } else if (changeit == 6) {
                    output = "Enter the NEW Payment";
                    value = JOptionPane.showInputDialog(null,
                            output, " ", JOptionPane.QUESTION_MESSAGE);
                    payment[position] = Double.parseDouble(value);
                }

            } else if (select == 3) {
                output = " Enter the ID to delete ";
                value = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);
                delvalue = Integer.parseInt(value);
                for (i = 0; i <= mcount; ++i) {
                    if (code[i] == delvalue) {
                        position = i;
                    }
                }

                for (i = position; i <= mcount - 1; ++i) {
                    code[i] = code[i + 1];
                    name[i] = name[i + 1];
                    type[i] = type[i + 1];
                    age[i] = age[i + 1];
                    gender[i] = gender[i + 1];
                    payment[i] = payment[i + 1];

                }
                mcount = mcount - 1;
            }//end of select=3
            output = "Modify Member Information" + "\n" +
                    "1. Add Member" + "\n" +
                    "2. Modify Member" + "\n" +
                    "3. Delete Member" + "\n" +
                    "4. Exit Modify" + "\n" +
                    "Please make your selection ";
            value = JOptionPane.showInputDialog(null,
                    output, " ", JOptionPane.QUESTION_MESSAGE);
            select = Integer.parseInt(value);
        }//end of while loop
        return mcount;
    }
//*******************************************************************


    public static int Modify_registration(int rCount, int[] membercode, String[] classname) {
        String value;
        int select;
        int delvalue, position = 0, i;
        int modvalue, changeit;
        String output = "Modify Registration Information" + "\n" +
                "1. Add Registration" + "\n" +
                "2. Modify Registration" + "\n" +
                "3. Delete Registration" + "\n" +
                "4. Exit Modify" + "\n" +
                "please make your selection ";
        value = JOptionPane.showInputDialog(null,
                output, " ", JOptionPane.QUESTION_MESSAGE);
        select = Integer.parseInt(value);
        while (select != 4) {
            if (select == 1) {
                rCount = rCount + 1;
                output = "Enter the ID";
                value = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);
                membercode[rCount] = Integer.parseInt(value);

                String classPrompt = "Enter the Class Name\n" + "Available Classes" + "\n" +
                        "1.  Yoga" + "\n" +
                        "2.	 Karate" + "\n" +
                        "3.	 AerobicsI" + "\n" +
                        "4.	 AerobicsII" + " \n" +
                        "5.	 SwimmingI" + " \n" +
                        "6.	 SwimmingII" + " \n" +
                        "    Please make your selection ";

                int selection = -1;
                while (selection < 1 || selection > 6) {
                    selection = Integer.parseInt(JOptionPane.showInputDialog(null, classPrompt, JOptionPane.QUESTION_MESSAGE));
                    if (selection == 1) {
                        classname[rCount] = "Yoga";
                    } else if (selection == 2) {
                        classname[rCount] = "Karate";
                    } else if (selection == 3) {
                        classname[rCount] = "AerobicsI";
                    } else if (selection == 4) {
                        classname[rCount] = "AerobicsII";
                    } else if (selection == 5) {
                        classname[rCount] = "SwimmingI";
                    } else if (selection == 6) {
                        classname[rCount] = "SwimmingII";
                    } else {
                        System.out.println("Invalid Selection Please Try Again");
                    }
                }
            } else if (select == 2) {
                output = " Enter the ID to modify ";
                value = JOptionPane.showInputDialog(null, output, " ", JOptionPane.QUESTION_MESSAGE);
                int idvalue = Integer.parseInt(value);

                output = "Enter the Class Name to Modify\n" + "Available Classes" + "\n" +
                        "Yoga" + "\n" +
                        "Karate" + "\n" +
                        "AerobicsI" + "\n" +
                        "AerobicsII" + " \n" +
                        "SwimmingI" + " \n" +
                        "SwimmingII" + " \n" +
                        "Please make your selection ";
                String classvalue = JOptionPane.showInputDialog(null, output, " ", JOptionPane.QUESTION_MESSAGE);


                for (i = 0; i <=rCount; ++i) {
                    if (membercode[i] == idvalue && classname[i].equals(classvalue)) {
                        position = i;
                    }
                }

                output = "1. Change the ID " + "\n" +
                        "2. Change the Class Name " + "\n" +
                        "Enter Your selection ";
                value = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);
                changeit = Integer.parseInt(value);
                if (changeit == 1) {
                    output = "Enter the NEW ID";
                    membercode[position] = Integer.parseInt(JOptionPane.showInputDialog(null,
                            output, " ", JOptionPane.QUESTION_MESSAGE));
                } else if (changeit == 2) {
                    output = "Enter the NEW Class Name";
                    value = JOptionPane.showInputDialog(null,
                            output, " ", JOptionPane.QUESTION_MESSAGE);
                    classname[position] = value;
                }

            } else if (select == 3) {
                output = " Enter the ID to delete ";
                value = JOptionPane.showInputDialog(null,
                        output, " ", JOptionPane.QUESTION_MESSAGE);
                delvalue = Integer.parseInt(value);
                for (i = 0; i <= rCount; ++i) {
                    if (membercode[i] == delvalue) {
                        position = i;
                    }
                }

                for (i = position; i <= rCount - 1; ++i) {
                    membercode[i] = membercode[i + 1];
                    classname[i] = classname[i + 1];

                }
                rCount = rCount - 1;
            }//end of select=3
             output = "Modify Registration Information" + "\n" +
                    "1. Add Registration" + "\n" +
                    "2. Modify Registration" + "\n" +
                    "3. Delete Registration" + "\n" +
                    "4. Exit Modify" + "\n" +
                    "please make your selection ";
            value = JOptionPane.showInputDialog(null,
                    output, " ", JOptionPane.QUESTION_MESSAGE);
            select = Integer.parseInt(value);
        }//end of while loop

        return rCount;
    }
//*******************************************************************


    public static void Report(int rCount, int[] membercode, String[] classname, int mcount, int[] code, String[] name, String[] type, int[] age, String[] gender, double[] payment) {
        int selection, i;
        String value;
        String words = "Pittsburgh Area YMCA" + "\n" +
                "1.  All Member Info" + "\n" +
                "2.	 All Registration Information" + "\n" +
                "3.	 All Members of a Specific type" + "\n" +
                "4.	 All Members between a specific age range" + " \n" +
                "5.	 All Members of a specific gender" + " \n" +
                "6.	 Specific Member's Registration" + " \n" +
                "7.	 Report 7" + "\n" +
                "8.	 Report 8" + " \n" +
                "9.	 Report 9" + " \n" +
                "10. Report 10" + "\n" +
                "11.	 Exit Report Menu" + "\n" +
                "    Please make your selection ";
        value = JOptionPane.showInputDialog(null, words, "Input Data", JOptionPane.QUESTION_MESSAGE);
        selection = Integer.parseInt(value);
        while (selection != 11) {
            if (selection == 1) {
                System.out.println("All Member Information");
                for (i = 0; i <= mcount; ++i) {
                    System.out.println(code[i] + " " + name[i] + " " + type[i] + " " + age[i] + " " + gender[i] + " " + payment[i]);
                }
            }//end of report 1
            else if (selection == 2) {
                System.out.println("All Registration Information");
                for (i = 0; i <= rCount; ++i) {
                    System.out.println(membercode[i] + " " + classname[i]);
                }
            }//end of report 2
            else if (selection == 3) {
                System.out.println("All Members of a Specific type");
                String typeSelection = JOptionPane.showInputDialog(null, "Choose Type", "Choose Type", JOptionPane.QUESTION_MESSAGE);
                for (i = 0; i <= mcount; ++i) {
                    if (type[i].equals(typeSelection)) {
                        System.out.println(code[i] + " " + name[i] + " " + type[i] + " " + age[i] + " " + gender[i] + " " + payment[i]);
                    }
                }
            }//end of report 3
            else if (selection == 4) {
                    System.out.println("All Members between a specific age range");
                    int minAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Minimum Age", "Enter Minimum Age", JOptionPane.QUESTION_MESSAGE));
                    int maxAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Maximum Age", "Enter Maximum Age", JOptionPane.QUESTION_MESSAGE));

                    for (i = 0; i <= mcount; ++i) {
                        if (age[i] >= minAge && age[i] <= maxAge) {
                            System.out.println(code[i] + " " + name[i] + " " + type[i] + " " + age[i] + " " + gender[i] + " " + payment[i]);
                        }
                    }
                }//end of report 4
                else if (selection == 5) {
                    System.out.println("All Members of a specific gender");
                    String genderSelection = JOptionPane.showInputDialog(null, "Enter Gender", "Enter Gender", JOptionPane.QUESTION_MESSAGE);
                    for (i = 0; i <= mcount; ++i) {
                        if (gender[i].equals(genderSelection)) {
                            System.out.println(code[i] + " " + name[i] + " " + type[i] + " " + age[i] + " " + gender[i] + " " + payment[i]);
                        }
                    }
                }//end of report 5
                else if (selection == 6) {
                    System.out.println("Specific Member's Registration");
                    int memberSelection = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Member Code", "Enter Member Code", JOptionPane.QUESTION_MESSAGE));
                    for (i = 0; i <= mcount; ++i) {
                        if (code[i] == memberSelection) {
                            System.out.println(code[i] + " " + name[i] + " " + type[i] + " " + age[i] + " " + gender[i] + " " + payment[i]);
                        }
                    }
                    for (i = 0; i <= rCount; ++i) {
                        if (membercode[i] == memberSelection) {
                            System.out.println(membercode[i] + " " + classname[i]);
                        }
                    }
                }//end of report 6
                else if (selection == 7) {
                    System.out.println("Add Code here for Report #7");
                }//end of report 7
                else if (selection == 8) {
                    System.out.println("Add Code here for Report #8");
                }//end of report 8
                else if (selection == 9) {
                    System.out.println("Add Code here for Report #9");
                }//end of report 9
                else if (selection == 10) {
                    System.out.println("Add Code here for Report #10");
                }//end of report 10
                value = JOptionPane.showInputDialog(null, words, "Input Data", JOptionPane.QUESTION_MESSAGE);
                selection = Integer.parseInt(value);
            }//end of while loop
        }
//*******************************************************************

    public static void exit_program ( int mcount, int rCount, int[] code, String[] classname,
        int[] memberCode, String[] name, String[]type,int[] age, String[] gender,double[] payment){
            try {
                BufferedWriter register_file = new BufferedWriter(new FileWriter("register.txt"));

                for (int i = 0; i <= rCount; i++) {
                    String line = memberCode[i] + "#" + classname[i] + "#";
                    register_file.write(line);

                    if(i != rCount) {
                        register_file.newLine();
                    }
                }
                register_file.close();
                BufferedWriter member_file = new BufferedWriter(new FileWriter("member.txt"));

                for (int i = 0; i <= mcount; i++) {
                    String line = code[i] + "#" + name[i] + "#" + type[i] + "#" + age[i] + "#" + gender[i] +
                            "#" + payment[i] + "#";
                    member_file.write(line);

                    if(i != mcount) {
                        member_file.newLine();
                    }
                }
                member_file.close();
            } catch (IOException error) {
                System.out.println("Error on file write " + error);
            }
//*******************************************************************
        }
    }

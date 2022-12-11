package university1;

import java.util.ArrayList;

class Course {
    private String name;
    private int sks;
    private int score;

    Course(String param_name, int param_sks, int param_score) {
        // Completed the code
        name = param_name;
        sks = param_sks;
        score = param_score;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getSks() {
        return sks;
    }

    void setSks(int sks) {
        this.sks = sks;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    String getGrade() {
        // Completed the code
        /*
         * Method getGrade called to return grade from score with rule below
         * score >= 85 => return "A"
         * score >= 70 => return "B"
         * score >= 55 => return "C"
         * score < 55 => return "D"
         */

        if(score>=85){
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 55) {
            return "C";
        } else {
            return "D";
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> listCourse = new ArrayList<Course>();

    Student(String param_name) {
        this.name = param_name;
    }

    String getName() {
        return name;
    }

    public void setListCourse(ArrayList<Course> listCourse) {
        this.listCourse = listCourse;
    }

    void setName(String name) {
        this.name = name;
    }

    ArrayList<Course> getListCourse() {
        return listCourse;
    }

    void setListCourse(Course Course) {
        this.listCourse.add(Course);
    }

    int countTotalSKS() {
        // Completed the code
        /*
         * Method countTotalSKS return total SKS from the student
         */
        int totSks = 0;
        for(Course matkul : listCourse){
            totSks += matkul.getSks();
        }
        return totSks;
    }
}

class University {
    private String name;
    private Student obj_student;

    University(String param_name) {
        this.name = param_name;
    }

    Student getObj_student() {
        return obj_student;
    }

    void setObj_student(Student obj_student) {
        this.obj_student = obj_student;
    }

    void studentStatus() {
        // Completed the code
        /*
         * Method studentStatus return status of the student with this condition
         * - If total SKS < 10 then show
         * "[Student Name] Credit is not enough to graduate"
         * - If the student has at least one Course with grade D, then show
         * "Sorry, [Student Name] Not Pass"
         * - If the student passed 2 rules above, then show
         * "Congrats, [Student Name] Pass"
         */

        System.out.println(name + " Information :");
        if (obj_student.countTotalSKS() < 10){
            System.out.println(obj_student.getName()+" Credit is not enough to graduate");
            return;
        }
        for(Course matkul : obj_student.getListCourse()){
            if(matkul.getGrade().equals("D")){
                System.out.println("Sorry, "+obj_student.getName()+ " Not Pass");
                return;
            }
        }System.out.println("Congrats, "+ obj_student.getName() + " Pass");
    }
}


public class Main {

    public static void main(String[] args) {
        Course Course1 = new Course("Programming", 2, 50);
        Course Course2 = new Course("Database", 4, 50);
        Course Course3 = new Course("Algoritma", 3, 80);
        Student Bill = new Student("Bill");

        Bill.setListCourse(Course1);
        Bill.setListCourse(Course2);
        Bill.setListCourse(Course3);

        University Univ = new University("CodingID Learning Center");
        Univ.setObj_student(Bill);
        Univ.studentStatus();

        Course Course11 = new Course("Programming", 3, 70);
        Course Course22 = new Course("Database", 3, 90);
        Course Course33 = new Course("Algoritma", 4, 50);
        Student Jonathan = new Student("Jonathan");
        Jonathan.setListCourse(Course11);
        Jonathan.setListCourse(Course22);
        Jonathan.setListCourse(Course33);

        University Univ1 = new University("CodingID Learning Center");
        Univ1.setObj_student(Jonathan);
        Univ1.studentStatus();

        Course Course111 = new Course("Programming", 4, 70);
        Course Course222 = new Course("Database", 4, 60);
        Course Course333 = new Course("Algoritma", 4, 60);
        Student Wardoyo = new Student("Wardoyo");
        Wardoyo.setListCourse(Course111);
        Wardoyo.setListCourse(Course222);
        Wardoyo.setListCourse(Course333);

        University Univ2 = new University("CodingID Learning Center");
        Univ2.setObj_student(Wardoyo);
        Univ2.studentStatus();


    }
}
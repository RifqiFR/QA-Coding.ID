package university2;

import java.util.Scanner;
import java.util.ArrayList;

class Course{
    private String name;
    private int sks;
    private int score;

    public void setName(String name){
        //completed the code
        this.name = name;
    }

    public void setSks(int sks){
        //completed the code
        this.sks = sks;
    }

    public void setScore(int score){
        //completed the code
        this.score = score;
    }

    public String getName(){
        return this.name;

    }

    public int getSKS(){
        return this.sks;
    }

    public int getScore(){
        return this.score;
    }


}

class Student{
    private String name;
    private ArrayList<Course> arrCourse = new ArrayList<Course>();

    public void setName(String name){
        //completed the code
        this.name = name;
    }

    //tambahkan 1 object Course ke dalam attribute array course
    public void addCourse(Course objCourse){
        //Complete code here
        this.arrCourse.add(objCourse);
    }

    public void showStatus(){
        //completed the code

        //Show status per Student
        /*
            Syarat kelulusan
            1. Tidak boleh ada matkul yang nilainya < 60
            2. Min.SKS yang sudah diambil 10 SKS
        */

        /*Expected Output
            Cyntia has taken courses :
            Course Name : Math with 3 and score 80
            Course Name : OOP with 4 and score 70
            Cyntia has Failed
        */
        int totSks = 0;
        boolean isScoreMin60 = true;
        System.out.println(name+" has taken courses :");
        for(Course matkul : arrCourse){
            System.out.println("Course Name : "+matkul.getName()+" with "+ matkul.getSKS()+ " and score "+ matkul.getScore());
            totSks += matkul.getSKS();
            if(matkul.getScore()<60){
                isScoreMin60 = false;
            }
        }
        System.out.print(name + " has ");
        if (totSks >= 10 && isScoreMin60)
            System.out.println("Passed");
        else System.out.println("Failed");



    }

}


class University{
    private String name;
    private ArrayList<Student> arrStudents = new ArrayList<Student>();

    public void setName(String name){
        //completed the code
        this.name = name;
    }

    //tambahkan 1 object Student ke dalam attribute array student
    public void addStudent(Student objStudent){
        //Complete code here
        this.arrStudents.add(objStudent);

    }

    public void showGraduates(){
        //completed the code
        //You can use/call objStudent.showStatus() here
        System.out.println(name + " University has " + arrStudents.size() +" Students, here is the detail :");

        for(Student mahasiswa : arrStudents){
            mahasiswa.showStatus();
        }
        /*Expected Output
            Kampus Maju Terus University has 3 Students, here is the detail :
            Badrun has taken courses :
            Course Name : Math with 3 and score 50
            Course Name : Algo with 4 and score 70
            Course Name : OOP with 4 and score 70
            Badrun has Failed
            Mala has taken courses :
            Course Name : Math with 3 and score 60
            Course Name : Algo with 4 and score 70
            Course Name : OOP with 4 and score 70
            Mala has Passed
            Cyntia has taken courses :
            Course Name : Math with 3 and score 80
            Course Name : OOP with 4 and score 70
            Cyntia has Failed

        */
    }
}

public class ScoreUniversity {

    public static void main(String[] args) {
        University objUniversity = new University();
        objUniversity.setName("Kampus Maju Terus");

        //Student 1
        Student objStudent1 = new Student();
        objStudent1.setName("Badrun");

        Course objCourse1 = new Course();
        objCourse1.setName("Math");
        objCourse1.setSks(3);
        objCourse1.setScore(50);

        Course objCourse2 = new Course();
        objCourse2.setName("Algo");
        objCourse2.setSks(4);
        objCourse2.setScore(70);

        Course objCourse3 = new Course();
        objCourse3.setName("OOP");
        objCourse3.setSks(4);
        objCourse3.setScore(70);

        objStudent1.addCourse(objCourse1);
        objStudent1.addCourse(objCourse2);
        objStudent1.addCourse(objCourse3);

        objUniversity.addStudent(objStudent1);

        //Student 2
        Student objStudent2 = new Student();
        objStudent2.setName("Mala");

        Course objCourse4 = new Course();
        objCourse4.setName("Math");
        objCourse4.setSks(3);
        objCourse4.setScore(60);

        Course objCourse5 = new Course();
        objCourse5.setName("Algo");
        objCourse5.setSks(4);
        objCourse5.setScore(70);

        Course objCourse6 = new Course();
        objCourse6.setName("OOP");
        objCourse6.setSks(4);
        objCourse6.setScore(70);

        objStudent2.addCourse(objCourse4);
        objStudent2.addCourse(objCourse5);
        objStudent2.addCourse(objCourse6);

        objUniversity.addStudent(objStudent2);

        //Student 3
        Student objStudent3 = new Student();
        objStudent3.setName("Cyntia");

        Course objCourse7 = new Course();
        objCourse7.setName("Math");
        objCourse7.setSks(3);
        objCourse7.setScore(80);

        Course objCourse8 = new Course();
        objCourse8.setName("OOP");
        objCourse8.setSks(4);
        objCourse8.setScore(70);

        objStudent3.addCourse(objCourse7);
        objStudent3.addCourse(objCourse8);

        objUniversity.addStudent(objStudent3);


        objUniversity.showGraduates();


    }
}

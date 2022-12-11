package company2;

import java.util.ArrayList;

class Point{
    private String reason;
    private int amount;

    public void setPointDetail(String reason, int amount){
        //complete the code 10 points
        this.reason = reason;
        this.amount = amount;

    }

    public String getReason(){
        return this.reason;
    }

    public int getAmount(){
        return this.amount;
    }

}

class Employee {
    public String name;
    public ArrayList<Point> arrPoint;

    Employee(String name){
        this.name = name;

        this.arrPoint = new ArrayList<Point>();
    }

    public void addPoint(Point objPoint){
        //complete the code 10 points
        //add one object Point to #arrPoint (array of Point)
        this.arrPoint.add(objPoint);
    }

    public int currentPoints(){
        //complete the code 20 points
        //Return an integer current point
        int totAmount = 0;
        for(Point poin : arrPoint){
            totAmount += poin.getAmount();
        }
        return totAmount;
    }

    public String getName(){
        return this.name;
    }

    public void printHistoryPoints(){
        System.out.println("This is History Point from " + this.name);

        //complete the code 30 points
        /*
            Expected Output :
                This is History Point from Badrun
                Added 100 cause Project OnTime
                Added 25 cause Innovation for Team
                Current Point : 125 Points
        */
        for(Point poin : arrPoint){
            if(poin.getAmount()>0){
                System.out.println("Added "+ poin.getAmount() +" cause " + poin.getReason());
            }
            else System.out.println("Substraction "+ poin.getAmount() +" cause "+ poin.getReason());
        }
        System.out.println("Current Point : "+ currentPoints() +" Points");
    }

}


class Division{
    public String name;
    public ArrayList<Employee> arrEmployee;

    Division(String name){
        this.name = name;
        this.arrEmployee = new ArrayList<Employee>();
    }

    public void addEmployee(Employee objEmployee){
        this.arrEmployee.add(objEmployee);
    }

    public String getName(){
        return this.name;
    }

    public void getBestEmployee(){
        //complete the code 30 points
        /*
            Expected Output :
                The Best Employee from Project Division is Badrun with 125 Points
        */
        int maxPoin = 0;
        String bestPegawai = "";

        for(Employee pegawai : arrEmployee){
            if(pegawai.currentPoints() > maxPoin){
                bestPegawai = pegawai.getName();
                maxPoin = pegawai.currentPoints();
            }
        }
        System.out.println("The Best Employee from "+ name +" is "+ bestPegawai + " with "+ maxPoin +" Points");
    }
}

public class TheBestEmployee {
    public static void main(String[] args) {
        Employee empBadrun = new Employee("Badrun");
        Employee empSusi = new Employee("Susi");
        Employee empMakmur = new Employee("Makmur");

        Division divProject = new Division("Project");
        Division divFinance = new Division("Finance");

        Point pointPlusProject = new Point();
        pointPlusProject.setPointDetail("Project OnTime", 100);
        empBadrun.addPoint(pointPlusProject);
        empMakmur.addPoint(pointPlusProject);

        Point pointPlusTarget = new Point();
        pointPlusTarget.setPointDetail("Target Q1 Achieved", 50);
        empSusi.addPoint(pointPlusTarget);

        Point pointPlusInovation = new Point();
        pointPlusInovation.setPointDetail("Innovation for Team", 25);
        empBadrun.addPoint(pointPlusInovation);
        empSusi.addPoint(pointPlusInovation);

        Point pointMinusMistakes = new Point();
        pointMinusMistakes.setPointDetail("Mistakes from team", -10);
        empSusi.addPoint(pointMinusMistakes);
        empMakmur.addPoint(pointMinusMistakes);

        empBadrun.printHistoryPoints();
        System.out.println("==============================");
        empMakmur.printHistoryPoints();
        System.out.println("==============================");
        empSusi.printHistoryPoints();
        System.out.println("==============================");

        divProject.addEmployee(empBadrun);
        divProject.addEmployee(empMakmur);
        divFinance.addEmployee(empSusi);

        divProject.getBestEmployee();
        divFinance.getBestEmployee();
    }
}


package cashOfTheCompany;

import java.util.ArrayList;

class Project{
    private int price;

    public void setPrice(int price){
        //completed the code
        this.price = price;
    }

    public int getPrice(){
        //completed the code
        return this.price;
    }

}

class Employee{
    private String name;
    private int salary;

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public void getInfo(){
        System.out.println(name + " has salary Rp" + salary);
    }
}

class Company{
    private String name;
    private int companyCash = 100000000;
    private ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
    private ArrayList<Project> arrProject = new ArrayList<Project>();
    private int month = 0;

    public void setName(String name){
        this.name = name;
    }

    //tambahkan 1 object employee ke dalam attribute array employee
    public void addArrEmployee(Employee objEmployee){
        //Complete code here
        this.arrEmployee.add(objEmployee);
    }

    //menambahkan bulan berjalan sesuai parameter yang dimasukkan
    public void addMonth(int month){
        this.month += month;
        this.calculateCompanyCash();
    }

    /*
        Print status company (ubah isi dari console.log dan sesuaikan dengan expected output)
        Menghasilkan 1x print status perusahaan contoh : PT Coding.ID sudah berdiri selama 0 memiliki 0 orang karyawan dengan Cash sebesar Rp100000000
    */
    public void getCompanyStatus(){
        //Complete code here
        System.out.println(name +" sudah berdiri selama "+ month +" memiliki "+ arrEmployee.size() + " orang karyawan dengan Cash sebesar Rp" + companyCash);
    }

    //menghitung ulang cash yang dimiliki perusahaan sesuai dengan bulan berjalan saat ini
    //Perusahaan diharuskan membayar gaji bulanan semua karyawan sesuai dengan jumlah bulan berjalan
    public void calculateCompanyCash(){
        //Complete code here
        for (Employee pegawai : arrEmployee){
            companyCash -= pegawai.getSalary();
        }
    }

    //Add project to company (arrproject) and add cash based on price of the project
    public void addProject(Project objProject){
        //completed the code
        this.arrProject.add(objProject);
        companyCash += objProject.getPrice();
    }

    //Keluarkan karyawan dari arrayEmployee berdasarkan nama yang dimasukan
    public void employeeResignByName(String employeeName){
        //completed the code
        arrEmployee.removeIf(pegawai -> employeeName.equals(pegawai.getName()));
    }
}

public class StatusCompany {

    public static void main(String[] args) {
        //Write your code here

        //Membuat perusahaan baru
        Company objCompany = new Company();
        objCompany.setName("PT Coding.ID");

        //print status perusahaan
        //objCompany.getCompanyStatus();

        //Menambahkan 1 karyawan
        Employee objEmployeeBadrun = new Employee();
        objEmployeeBadrun.setName("Badrun");
        objEmployeeBadrun.setSalary(5000000);

        objCompany.addArrEmployee(objEmployeeBadrun);

        //Bulan pertama perusahaan berjalan
        objCompany.addMonth(1);

        //print status perusahaan
        objCompany.getCompanyStatus();

        //Menambahkan 2 karyawan lagi

        Employee objEmployeeAni = new Employee();
        objEmployeeAni.setName("Ani");
        objEmployeeAni.setSalary(4500000);

        objCompany.addArrEmployee(objEmployeeAni);

        Employee objEmployeeMurni = new Employee();
        objEmployeeMurni.setName("Murni");
        objEmployeeMurni.setSalary(4500000);

        objCompany.addArrEmployee(objEmployeeMurni);

        //Bulan kedua perusahaan berjalan
        objCompany.addMonth(1);

        //print status perusahaan
        objCompany.getCompanyStatus();

        //pada bulan kedua perusahan mendapatkan project pertama
        Project objProject1 = new Project();
        objProject1.setPrice(10000000);
        objCompany.addProject(objProject1);

        //print status perusahaan
        objCompany.getCompanyStatus();

        //Perusahaan menambahkan 2 karyawan lagi
        Employee objEmployeeTechLead = new Employee();
        objEmployeeTechLead.setName("Rey");
        objEmployeeTechLead.setSalary(15000000);

        objCompany.addArrEmployee(objEmployeeTechLead);

        Employee objEmployeeQAEngineer = new Employee();
        objEmployeeQAEngineer.setName("Rosna");
        objEmployeeQAEngineer.setSalary(5000000);

        objCompany.addArrEmployee(objEmployeeQAEngineer);

        //Bulan ketiga perusahaan berjalan
        objCompany.addMonth(1);

        //print status perusahaan
        objCompany.getCompanyStatus();

        //1 orang karyawan resign pada bulan ke empat
        objCompany.employeeResignByName("Badrun");

        //Bulan keempat perusahaan berjalan
        objCompany.addMonth(1);

        //print status perusahaan
        objCompany.getCompanyStatus();
    }
}
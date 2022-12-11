package company1;

import java.util.ArrayList;

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

    public void getInfo(){
        System.out.println(name + " has salary Rp" + salary);
    }
}

class Company{
    private String name;
    private int companyCash = 100000000;
    private ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
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
}

public class StatusOfTheCompany {

    public static void main(String[] args) {
        //Write your code here

        /*
        Employee objEmployee = new Employee();
        objEmployee.setName("Badrun");
        objEmployee.setSalary(1000000);
        objEmployee.getInfo();*/

        //Membuat perusahaan baru
        Company objCompany = new Company();
        objCompany.setName("PT Coding.ID");

        //print status perusahaan
        objCompany.getCompanyStatus();

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
    }
}
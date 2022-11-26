package lab.rob1;

public class People {

    private int age;
    private double timeWorkInCompany;
    private double salary;
    private int timeOfWork;
    private String peopleName;
    private String position;
    private double allSalary = 0;
    private String info;
    private double money;

    private String sex;


    public People(int age, double timeWorkInCompany, double salary, int timeOfWork, String peopleName, String position) {
        this.age = age;
        this.timeWorkInCompany = timeWorkInCompany;
        this.salary = salary;
        this.timeOfWork = timeOfWork;
        this.peopleName = peopleName;
        this.position = position;
    }

    public People(int age, String sex, double money) {
        this.age = age;
        this.sex = sex;
        this.money = money;
    }

    public People(int age, String peopleName) {
        this.age = age;
        this.peopleName = peopleName;
    }

    public double salary(){
        allSalary += salary;
        System.out.println(peopleName+" \uD83E\uDD11заробляє: " + allSalary+" - на посаді "+position);
        return allSalary;
    }

    public int age(int age){
        if(age<18){
            System.out.println("\uD83C\uDF7BАлкоголь заборонений!");
        }else{
            System.out.println("Доступні всі категорії товарів!");
        }
        return 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTimeWorkInCompany() {
        return timeWorkInCompany;
    }

    public void setTimeWorkInCompany(double timeWorkInCompany) {
        this.timeWorkInCompany = timeWorkInCompany;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTimeOfWork() {
        return timeOfWork;
    }

    public void setTimeOfWork(int timeOfWork) {
        this.timeOfWork = timeOfWork;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(double allSalary) {
        this.allSalary = allSalary;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}

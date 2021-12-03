package hw5;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String post;
    private String email;
    private String telNumber;
    private double salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String surname, String patronymic, String post, String email, String telNumber, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public void EmployeeToString() {
        System.out.println("ФИО Сотрудника: " + surname + " " + name + " " + patronymic + "\n" + "Должность: " + post + "\n" + "Мыло: " + email + "\n" + "Телефон: " + telNumber + "\n" + "Заработная плата: " + salary + "\n" + "Возраст: " + age + "\n");
    }

    @Override
    public String toString() {
        return "Имя ='" + name + '\'' +
                ", Фамилия ='" + surname + '\'' +
                ", Отчество ='" + patronymic + '\'' +
                ", Должность ='" + post + '\'' +
                ", Мыло ='" + email + '\'' +
                ", Телефон ='" + telNumber + '\'' +
                ", Заработная плата =" + salary +
                ", Возраст =" + age;
    }
}


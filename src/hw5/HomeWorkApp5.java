package hw5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Иван", "Васечкин", "Иванович", "директор", "milo", "89991234", 115000.00, 44);
        Employee e2 = new Employee("Петр", "Кукушкин", "Петрович", "менеджер", "milo", "8989", 10000.00, 30);
        Employee e3 = new Employee("Жорж", "Пупочкин", "Евгеньевич", "менеджер", "milo", "8989", 10500.00, 32);
        Employee e4 = new Employee("Ибрагим", "Карандух", "Олегович", "менеджер", "milo", "8989", 30000.00, 78);
        Employee e5 = new Employee("Зиновий", "Петухов", "Антонович", "менеджер", "milo", "8989", 20000.00, 91);
        Employee employees[] = {e1, e2, e3, e4, e5};
        for(Employee e : employees) {
            if(e.getAge() > 40)
            System.out.println(e.toString());
        }
    }
}

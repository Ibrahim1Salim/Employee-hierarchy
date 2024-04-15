public class Main {
    public static void main(String[] args) {
        Employee hourlyEmployee=new HourlyEmployee(1,"Eli",500);
        System.out.println(hourlyEmployee.calculateSalary());
        Employee salariedEmployee=new SalariedEmployee("Emil",800);
        System.out.println(salariedEmployee.calculateSalary());
        Employee commissiedEmployee=new CommisiedEmployee("Sadiq",1000,2);
        System.out.println(commissiedEmployee.calculateSalary());

    }
}
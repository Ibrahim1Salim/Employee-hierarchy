public class CommisiedEmployee extends Employee{

    private int commission;
    public CommisiedEmployee(String name,float salary,int commission){
        super(name, salary);
        this.commission=commission;
    }

    public int getCommission(){
        return this.commission;
    }



    @Override
    public float calculateSalary() {
        float commissiedSalary=getSalary()+(getSalary()*this.commission)/100;
        System.out.println("Komissiyali emekhaqqi: ");
        return commissiedSalary;
    }

}

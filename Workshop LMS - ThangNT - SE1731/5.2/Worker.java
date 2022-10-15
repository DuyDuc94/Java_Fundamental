
import java.text.DecimalFormat;

/*
 * DuyDuc94.
 */
public class Worker extends Person{
    private double bSalary;
    private double rate;

    public Worker(){}
    public Worker(String name, double bSalary, double rate) {
        super(name);
        this.bSalary = bSalary;
        this.rate = rate;
    }

    @Override
    public void display(){
        System.out.println("-------------------------------------");
        System.out.println("Name = " + super.name);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Salary = " + df.format(getSalary()));
    }
    
    @Override
    public double getSalary(){
        return bSalary*rate;
    }
    
    public Worker input(){
        String nameLocal;
        double salaryBasic, rateLocal;
//        System.out.println("Enter name: ");
        nameLocal = Validation.checkInputString();
//        System.out.print("Enter salary basic: ");
        salaryBasic = Validation.checkInputDouble();
//        System.out.print("Enter rate: ");
        rateLocal = Validation.checkInputDouble();
        Worker wk = new Worker(nameLocal, salaryBasic, rateLocal);
        System.out.println("Add worker's information sucessful!");
        return wk;
    }

    @Override
    public String toString() {
        return super.name +  ", " + bSalary + ", " + rate ;
    }
}

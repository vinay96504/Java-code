import java.util.Scanner;

public class Salaryslip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SALARY OF USER:");
        float salary = sc.nextFloat();
        double hra = calculateHRA(salary);
        double ta = calculateTA(salary);
        double da = calculateDA(salary);
        int pf = 1500;
        System.out.println(hra);
        System.out.println(ta);
        System.out.println(da);

        double netSalary = calculateNetSalary(salary, hra, ta, da, pf);

        System.out.println("NET SALARY IS " + netSalary);
        sc.close();
    }

    public static double calculateHRA(float salary) {
        return salary * 0.3;
    }

    public static double calculateTA(float salary) {
        return salary * 0.2;

    }

    public static double calculateDA(float salary) {
        return salary * 0.1;
    }

    public static double calculateNetSalary(float salary, double hra, double ta, double da, int pf) {
        return salary + hra + ta + da - pf;
    }
}

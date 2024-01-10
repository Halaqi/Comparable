public class RegularDeveloper extends Developer{
    double monthlySalary;
    RegularDeveloper(int id , String fullName, double monthlySalary)
    {
        super(id, fullName);
        this.monthlySalary=monthlySalary;
    }
    double income()
    {
        return monthlySalary;
    }
}


public class FreelanceDeveloper extends Developer implements BonusSalaryBehaviour {
    int unitPrice;
    int hours;
    FreelanceDeveloper(int id, String fullName, int hours)
    {
        super(id, fullName);
        this.hours=hours;
    }
    public double getBonusSalary()
    {
        return hours*15;
    }

    @Override
    double income() {
        return hours*unitPrice+getBonusSalary();
    }
}

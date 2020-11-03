class CompanyEmpWage
{
    final String COMPANY_NAME;
    final int WAGE_PER_HR;
    final int MAX_WORKING_DAYS;
    final int MAX_WORKING_HRS;
    int totalEmpWage;
    CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalEmpWage = 0;
    }
    void getTotalEmployeeWage(int totalEmpWage)
    {
        this.totalEmpWage = totalEmpWage;
    }
    public String toString()
    {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("        ");
        System.err.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalEmpWage + "\n";
    }
}
public class EmpWageBuilder
{
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    int noOfCompanies;
    int i;
    CompanyEmpWage[] companies;
    public void EmpWageComputation(int noOfCompanies)
    {
        this.noOfCompanies = noOfCompanies;
        companies = new CompanyEmpWage[noOfCompanies];
        i= 0;
    }
    void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        companies[i++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);

    }
    int generateEmpCheck()
    {
        return (int) (Math.random() * 100) % 3;
    }
    int getWorkingHrs(int empCheck)

    {

        switch (empCheck)

        {

        case FULL_TIME:

            return 8;

        case PART_TIME:

            return 4;

        default:

            return 0;

        }

   }
}


package demo.vacation;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Employee implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private int age;
   private int yearsService;

   private int vacationEntitlement;

   public Employee()
   {
   }

   public int getAge()
   {
      return this.age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public int getYearsService()
   {
      return this.yearsService;
   }

   public void setYearsService(int yearsService)
   {
      this.yearsService = yearsService;
   }

   public int getVacationEntitlement()
   {
      return this.vacationEntitlement;
   }

   public void setVacationEntitlement(int vacationEntitlement)
   {
      this.vacationEntitlement = vacationEntitlement;
   }

   public Employee(int age, int yearsService, int vacationEntitlement)
   {
      this.age = age;
      this.yearsService = yearsService;
      this.vacationEntitlement = vacationEntitlement;
   }

}
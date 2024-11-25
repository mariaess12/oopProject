public class Employee extends Person{
    public Employee(String firstName, String lastName, String email, String address) {
        super(firstName, lastName, email, address);
    }
    private int empNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }
    @Override
    public String toString(){
        return super.toString()+String.format(" Employer Number: %d",empNo);
    }
}

public class Customer extends Person{
    public Customer(String firstName, String lastName, String email, String address, int custNo){
        super(firstName,lastName,email,address);
        this.custNo=custNo;
    }
    private int custNo;

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }
    @Override
    public String toString(){
        return super.toString()+String.format(" Customer Id: %d", custNo);
    }
}

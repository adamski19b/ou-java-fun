public class ContractExists {
    // Attributes

    Boolean exists;
    Object customerName;
    Object contract;
    Object startdate;
    Object startTime;

    // Constructors

    public ContractExists(String customerName, Object contractId, String startDate, String startTime){
        this.exists = true;
        this.customerName = customerName;
        this.contract = contractId;
        this.startdate = startDate;
        this.startTime = startTime;
    }
}
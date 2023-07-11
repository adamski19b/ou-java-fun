import java.util.Random;

public class Contract {
    // Attributes

    Object phase;
    Object contractId;
    Object supplierId;
    Object contractExists;

    // Associations

    private Random rand = new Random();

    // Methods

    public String createContract(String startDate, String startTime, String customerName){
        
        ContractExists contractExists = new ContractExists(customerName,this.contractId,startDate,startTime);
        
        return contractExists.toString();
    }
    // Constructors

    public Contract(Integer supplierId){
        this.phase = "--not-set--";
        this.contractId = rand.nextInt(7000,8000);
        this.supplierId = supplierId.toString();
    }
    
}

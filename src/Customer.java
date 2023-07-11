import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Customer {
    // Attributes

    private Object userType;
    private Object sysView;
    private Object properties;
    private Object customerName;
    private Object address;
    private Object customerId;

    // Associations

    private Random rand = new Random();
    private ExternalUser userSchema = new ExternalUser();
    
    // Methods

    public Map<Object,Object> createCustomer(String address,String startDate,String startTime,String customerName, Integer supplierId) {

        Contract contract = new Contract(supplierId);
        String result = contract.createContract(startDate,startTime,customerName);
        
        Map<Object, Object> customer = new HashMap<>();

        customer.put("address", this.address);
        customer.put("customerId", this.customerId);
        customer.put("customerName", this.customerName);
        customer.put("properties", this.properties);
        customer.put("sysView", this.sysView);
        customer.put("userType", this.userType);
        customer.put("contractId", contract.contractId);
        customer.put("phase", contract.phase);
        customer.put("supplierId", contract.supplierId);
        customer.put("contract", contract);
        customer.put("contractExists", result);

        return customer;

    }

    // Constructors

    public Customer (String address, String customerName){
        this.userType = "Customer";
        this.sysView = "Customer";
        this.customerId = String.valueOf(rand.nextInt(5000,6000));
        this.address = address;
        this.properties = userSchema.toString();
        this.customerName = customerName;
    }
}

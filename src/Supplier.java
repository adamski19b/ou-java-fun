import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Supplier {

    // Associations

    private Random rand = new Random();
    private ExternalUser userSchema = new ExternalUser();
    
    // Attributes

    private Object userType;
    private Object sysView;
    private Object supplierId;
    private Object address;
    private Object properties;
    private Object supName;

    // Methods

    public Map<Object,Object> createSupplier(int supplyChainRecord, int directRecord, Map<Object,Object> envData){

        EnvSchema envSchema = new EnvSchema();
        envSchema.createEnvSchema(envData);
        
            if (supplyChainRecord == 1){

            SupplyChainRecord supChainRecord = new SupplyChainRecord();
            supChainRecord.CreateSupplyChainRecord();

            Map<Object, Object> supplier = new HashMap<>();

            supplier.put("name", this.supName);
            supplier.put("address", this.address);
            supplier.put("supplierId", this.supplierId);
            supplier.put("properties",this.properties);
            supplier.put("sysView",this.sysView);
            supplier.put("userType",this.userType);
            supplier.put("supChainRecId", supChainRecord.CreateSupplyChainRecord());
            supplier.put("missionStatement", envSchema.missionStatement);
            supplier.put("sustainabilityPolicies", envSchema.sustainabilityPolicies);
            supplier.put("sustainabilityCerts", envSchema.sustainabilityCerts);
            supplier.put("envSocFeatures", envSchema.envSocFeatures);
            supplier.put("envSustainability", envSchema.envSustainability);
            supplier.put("fairLabour", envSchema.fairLabour);
            supplier.put("wasteManagement", envSchema.wasteManagement);
            supplier.put("carbonFootRed", envSchema.carbonFootRed);
            supplier.put("carbonWasteHandling", envSchema.carbonWasteHandling);
            supplier.put("envSchema", envSchema);

            return supplier;

        }

            else {

            DirectRecord dirRecord = new DirectRecord();
            dirRecord.CreateDirectRecord();

            Map<Object, Object> supplier = new HashMap<>();

            supplier.put("name", this.supName);
            supplier.put("address", this.address);
            supplier.put("supplierId", this.supplierId);
            supplier.put("properties",this.properties);
            supplier.put("sysView",this.sysView);
            supplier.put("userType",this.userType);
            supplier.put("dirRecId", dirRecord.CreateDirectRecord());
            supplier.put("missionStatement", envSchema.missionStatement);
            supplier.put("sustainabilityPolicies", envSchema.sustainabilityPolicies);
            supplier.put("sustainabilityCerts", envSchema.sustainabilityCerts);
            supplier.put("envSocFeatures", envSchema.envSocFeatures);
            supplier.put("envSustainability", envSchema.envSustainability);
            supplier.put("fairLabour", envSchema.fairLabour);
            supplier.put("wasteManagement", envSchema.wasteManagement);
            supplier.put("carbonFootRed", envSchema.carbonFootRed);
            supplier.put("carbonWasteHandling", envSchema.carbonWasteHandling);
            supplier.put("envSchema", envSchema);

            return supplier;

        }

        }


    // Constructors
    
    public Supplier (String address, String supName){
        this.userType = "Supplier";
        this.sysView = "Supplier";
        this.supplierId = rand.nextInt(5000,6000);
        this.address = address;
        this.properties = userSchema.toString();
        this.supName = supName;
    }
}

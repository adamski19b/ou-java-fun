import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class DataEntryTest {
    
    @Test
    public void testEnterCxDetails() {

        // Post Condition - Assert that an instance of DataEntry, Contract, ContracExists and Customer is instantiated

        DataEntry dataEntry = new DataEntry();

        Customer customer = new Customer("dummy","dummy");
        Map<Object,Object> result = customer.createCustomer("dummy","dummy","dummy","dummy",1);

        result.put("customer", customer);

        if (result.get("contract") != null && result.get("contractExists") != null 
        && result.get("customer") != null && dataEntry.getClass().getSimpleName() == "DataEntry"){
            Boolean expResult = true;
            assertEquals(expResult, true);
        }

        else {
            Boolean expResult = false;
            assertEquals(expResult, true);
        }


    }

    @Test
    public void testEnterPartnerDetails() {

    // Post Condition - Assert that an instance of DataEntry, Supplier, SupplyChainRecord and EnvSchema is instantiated

    DataEntry dataEntry = new DataEntry();

    Map<Object, Object> envData = new HashMap<>();
    envData.put("missionStatement", 3);
    envData.put("sustainabilityPolicies", 3);
    envData.put("sustainabilityCerts", 3);
    envData.put("envSocFeatures", 3);
    envData.put("envSustainability", 3);
    envData.put("fairLabour", 3);
    envData.put("wasteManagement", 3);
    envData.put("carbonFootRed", 3);
    envData.put("carbonWasteHandling", 3);
        
    Supplier supplier = new Supplier("dummy", "dummy");
    Map<Object,Object> result = supplier.createSupplier(1,0,envData);

    result.put("supplier", supplier);

    if (result.get("supplier") != null && result.get("supChainRecId") != null 
    && result.get("envSchema") != null && dataEntry.getClass().getSimpleName() == "DataEntry"){
        Boolean expResult = true;
        assertEquals(expResult, true);
    }

    else {
        Boolean expResult = false;
        assertEquals(expResult, true);
    }

    }

    @Test
    public void testEnterPartnerDetails1() {

    // Post Condition - Assert that an instance of DataEntry, Supplier, DirectRecord and EnvSchema is instantiated

    DataEntry dataEntry = new DataEntry();

    Map<Object, Object> envData = new HashMap<>();
    envData.put("missionStatement", 3);
    envData.put("sustainabilityPolicies", 3);
    envData.put("sustainabilityCerts", 3);
    envData.put("envSocFeatures", 3);
    envData.put("envSustainability", 3);
    envData.put("fairLabour", 3);
    envData.put("wasteManagement", 3);
    envData.put("carbonFootRed", 3);
    envData.put("carbonWasteHandling", 3);
        
    Supplier supplier = new Supplier("dummy", "dummy");
    Map<Object,Object> result = supplier.createSupplier(0,1,envData);

    result.put("supplier", supplier);

    if (result.get("supplier") != null && result.get("dirRecId") != null 
    && result.get("envSchema") != null && dataEntry.getClass().getSimpleName() == "DataEntry"){
        Boolean expResult = true;
        assertEquals(expResult, true);
    }

    else {
        Boolean expResult = false;
        assertEquals(expResult, true);
    }

    }
}

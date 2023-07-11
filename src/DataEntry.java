import java.util.Map;
import java.util.Random;

public class DataEntry {

        // Associations

        private Random rand = new Random();
        
        // Variables

        private int dataEntryUniqueId = rand.nextInt(10000,11000);

        // Methods

        public Map<Object,Object> enterPartnerDetails(String supName, String address, int supplyChainRecord, int directRecord, Map<Object,Object> envData ){
            
            Supplier supplier = new Supplier(address, supName);
            Map<Object,Object> result = supplier.createSupplier(supplyChainRecord,directRecord,envData);

            result.put("dataEntryUniqueId", dataEntryUniqueId);
            result.put("supplier", supplier);

            return result;
        }

        public Map<Object,Object> enterCxDetails(String customerName, String address, String startdate, String starttime, Integer supplierId){
            
            Customer customer = new Customer(address,customerName);
            Map<Object,Object> result = customer.createCustomer(address,startdate,starttime,customerName,supplierId);

            result.put("dataEntryUniqueId", dataEntryUniqueId);
            result.put("customer", customer);

            return result;
        }
}

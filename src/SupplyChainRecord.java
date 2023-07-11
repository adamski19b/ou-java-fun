import java.util.Random;
public class SupplyChainRecord {

    // Associations

    private Random rand = new Random();
    
    // Attributes

    private Object supChainRecId;

    // Methods

    public String CreateSupplyChainRecord(){      
        this.supChainRecId = "supply-" + rand.nextInt(50,60);
        return this.supChainRecId.toString();
    }

}
import java.util.Random;
public class DirectRecord {

    // Associations

    private Random rand = new Random();
    
    // Attributes

    private Object dirRecId;

    // Methods

    public String CreateDirectRecord(){      
        this.dirRecId = "direct-" + rand.nextInt(50,60);
        return this.dirRecId.toString();
    }

}
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

    // Associations

    DataEntry dataEntry = new DataEntry();

    // Parameters

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
       
    Map<Object,Object> sresult = dataEntry.enterPartnerDetails("Awazin","60 Holborn Viaduct",1,0,envData);

    System.out.println(sresult);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Supplier Id: ");
    int suppId = sc.nextInt();

    Date date = new java.util.Date();
    SimpleDateFormat dateformatter = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat timeformatter = new SimpleDateFormat("HH:mm:ss");

    String dateval = dateformatter.format(date);
    String timeval = timeformatter.format(date);

    Map<Object,Object> cresult = dataEntry.enterCxDetails("Lisa's Env Conscious Business**", "Somewhere, DoTheRightThingShire, England", dateval, timeval, suppId);
    System.out.println(cresult);

    sc.close();

    }
}
import java.util.Map;

public class EnvSchema {
    // Attributes

    Object missionStatement;
    Object sustainabilityPolicies;
    Object sustainabilityCerts;
    Object envSocFeatures;
    Object envSustainability;
    Object fairLabour;
    Object wasteManagement;
    Object carbonFootRed;
    Object carbonWasteHandling;

    // Associations

    // Methods

    public void createEnvSchema(Map<Object,Object> envData){
        
        this.missionStatement = envData.get("missionStatement");
        this.sustainabilityPolicies = envData.get("sustainabilityPolicies");
        this.sustainabilityCerts = envData.get("sustainabilityCerts");
        this.envSocFeatures = envData.get("envSocFeatures");
        this.envSustainability = envData.get("envSustainability");
        this.fairLabour = envData.get("fairLabour");
        this.wasteManagement = envData.get("wasteManagement");
        this.carbonFootRed = envData.get("carbonFootRed");
        this.carbonWasteHandling = envData.get("carbonWasteHandling");
    }
}
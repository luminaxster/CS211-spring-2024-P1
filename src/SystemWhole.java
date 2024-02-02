// DO NOT INCLUDE THIS IMPORT WHEN SENT FOR GRADING, THIS IS HERE TO HELP YOU DEBUG THE PROGRAM STATE
import java.util.Arrays;

public class SystemWhole {
    public static String[] emergences; // To store JSON strings representing emergences
    public static Machine[] parts; // To store Machine objects directly as an array

    public static void main(String[] args) {
        // Sample JSON strings representing different "emergences"
        String[] emergences = {
                "{\"kind\": \"Humanoid\", \"bodyType\": \"physical\", \"faceType\": \"anthropomorphic\", \"reverie\": \"mechatypical\"}",
                "{\"kind\": \"Humanoid\", \"bodyType\": \"physical\", \"faceType\": \"anthropomorphic\", \"reverie\": \"biotypical\"}",
                "{\"kind\": \"Robot\", \"material\": \"metal\", \"function\": \"industrial\"}",
                "{\"kind\": \"Humanoid\", \"bodyType\": \"physical\", \"faceType\": \"anthropomorphic\"}"
        };

        // Parse the emergences and set them to the SystemWhole state
        emergencesFromPhenomena(emergences);
        // Analyze the shapes based on the set emergences
        reifyFrameOfReference();
        System.out.println("Prelude of the Rise of the Machines: " + Arrays.deepToString(parts));
        parts[0].emergeFromLimitations();
        // Track humanoid machines and identify singularities
        Machine[] singularities = trackSingularityMachines();
        System.out.println("Singularities: " + Arrays.deepToString(singularities));
    }

   //Visibility modifiers: public vs private
    public static void emergencesFromPhenomena(String[] emergences) {
        //Class and Object State: static vs this
        SystemWhole.emergences = emergences;
    }

   public static void reifyFrameOfReference() {
        SystemWhole.parts= new Machine[emergences.length];
        int i = 0; // not elegant =(
        for (String emergence:emergences){
            SystemWhole.parts[i++] = ShapeAnalyzer.analyze(emergence); 
        }
        
    }

    public static boolean isHumanoid(Object[] machineProperties) {
        throw new UnsupportedOperationException("Not implemented");
    }

    // SystemWhole's logic to determine if a Machine is humanoid and count them
    public static int identitySingularityMachines() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Machine[] trackSingularityMachines() {
        throw new UnsupportedOperationException("Not implemented");
    }

}

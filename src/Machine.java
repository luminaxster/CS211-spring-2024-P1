public class Machine {
    private final Object kind; // Type of shape as Object
    private final Object[] properties; // Properties of the shape as an array of Object
    private final boolean humanConstrained; // Stores the result of the humanoid check
    private boolean humanEmergence; // Stores the result of the humanoid check

    public Machine(Object kind, Object[] partStates, boolean humanConstrained) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public Object[] getProperties() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void emergeFromLimitations() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean isHumanoid() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String toString() {
        return String.format("Machine{kind=%s, humanoid=%s, properties=%s}", kind, humanConstrained,
                propertiesToString(properties));
    }

    public static String propertiesToString(Object[] machineProperties) {
        throw new UnsupportedOperationException("Not implemented");
    }
}

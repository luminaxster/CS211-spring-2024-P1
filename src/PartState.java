public class PartState {
    private final String property;
    private final Object value;

    public PartState(String property, Object value) {
        this.property = property;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("PartState{%s=%s}", property, value);
    }
}

public class ChickenBouillon {

    private boolean value;

    public ChickenBouillon(boolean value) {
        this.value = value;
    }

    enum BouillonValues {
        TRUE,
        FALSE
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean getValue () {
        return value;
    }

    @Override
    public String toString() {
        return (value ? "true" : "false" );
    }
}

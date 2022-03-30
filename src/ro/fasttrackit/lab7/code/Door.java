package ro.fasttrackit.lab7.code;

/**
 * @author flo
 * @since 30.03.2022.
 */
public class Door {
    boolean open;
    String purpose;

    Door(boolean initialState) {
        open = initialState;
    }

    Door(boolean initialState, String initialPurpose) {
        open = initialState;
        purpose = initialPurpose;
    }

    boolean isOpen() {
        return open;
    }

    boolean isClosed() {
        return !open;
    }

    String getPurpose() {
        return purpose;
    }
}

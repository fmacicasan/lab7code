package ro.fasttrackit.lab7.code;

/**
 * @author flo
 * @since 30.03.2022.
 */
public class Apratment {
    public static void main(String[] args) {
        Door myFrontDoor = new Door(true, "front");
        Door kitchenDoor = new Door(false, "kitchen");

        printDoor(myFrontDoor);
        printDoor(kitchenDoor);
    }

    public static void printDoor(Door door) {
        if (door.isOpen()) {
            System.out.println("The " + door.purpose + " door is open.");
        } else {
            System.out.println("The " + door.getPurpose() + " door is closed.");
        }
    }
}

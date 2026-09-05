package main.java.string.classproblem;

public class third {

    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Product: " + fields[0] + " | SKU: " + fields[1] + " | Qty: " + fields[2]);
    }

    public static void main(String[] args) {
        // Test cases
        parseInventoryRecord("Wireless Mouse,WM-2201,150"); // Output: Product: Wireless Mouse | SKU: WM-2201 | Qty: 150
        parseInventoryRecord("Wireless Mouse,150");         // Output: Invalid Record
    }
}
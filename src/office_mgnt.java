public class OfficeManager {
    private String officeName;
    private int currentEmployees;
    private final int MAX_CAPACITY = 50;

    public OfficeManager(String name, int employees) {
        this.officeName = name;
        this.currentEmployees = employees;
    }

    public boolean isOverCapacity() {
        return currentEmployees > MAX_CAPACITY;
    }

    public String getOfficeStatus() {
        if (isOverCapacity()) {
            return "Office " + officeName + " is full.";
        }
        return "Office " + officeName + " has space available.";
    }

    public int getCurrentEmployees() {
        return currentEmployees;
    }
}
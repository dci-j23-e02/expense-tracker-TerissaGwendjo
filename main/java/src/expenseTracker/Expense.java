package expenseTracker;

public class Expense {
    //declare private attributes for category, amount, date, and description.
    private String category;
    private double amount;
    private String date;
    private String description;

    //a constructor to initialize these attributes,
    public Expense(String category, double amount, String date, String description) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    // Getters and setters for attributes

    @Override
    public String toString() {
        return "Expense{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

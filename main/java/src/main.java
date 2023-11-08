import expenseTracker.Category;
import expenseTracker.Expense;
import expenseTracker.ExpenseTracker;

public class main {

    // Methods to add, remove, and display categories
    public static void main(String[] args) {
        // Create an instance of the ExpenseTracker class
        ExpenseTracker tracker = new ExpenseTracker();

        // Add categories and expenses
        Category foodCategory = new Category("Food");
        foodCategory.addExpense(new Expense("Food", 50.0, "2023-11-01", "Dinner"));
        foodCategory.addExpense(new Expense("Food", 30.0, "2023-11-02", "Lunch"));

        Category travelCategory = new Category("Travel");
        travelCategory.addExpense(new Expense("Travel", 100.0, "2023-11-03", "Gas"));
        travelCategory.addExpense(new Expense("Travel", 40.0, "2023-11-04", "Parking"));

        tracker.addCategory(foodCategory);
        tracker.addCategory(travelCategory);

        // Display categories and expenses
        tracker.displayCategories();

        // Remove a category and an expense
        tracker.removeCategory("Food");
        travelCategory.removeExpense("2023-11-03");

        // Display categories and expenses again
        tracker.displayCategories();
    }
}

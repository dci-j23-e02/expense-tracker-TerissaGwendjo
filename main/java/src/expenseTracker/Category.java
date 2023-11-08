package expenseTracker;

import java.util.LinkedList;

public class Category {
    private String categoryName;
    private LinkedList<Expense> expenses;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.expenses = new LinkedList<>();
    }

    // Methods to add, remove, and display expenses
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public String getCategoryName() {
        return categoryName;
    }

    //Method to remove an expense based on date
    public void removeExpense(String date) {
        for (Expense expense : expenses) {
            if (expense.getDate().equals(date)) {
                expenses.remove(expense);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", expenses=" + expenses +
                '}';
    }

}


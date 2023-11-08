package expenseTracker;

import java.util.ArrayList;

public class ExpenseTracker {
    private ArrayList<Category> categories;

    public ExpenseTracker() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    // Method to remove a category based on the category name
    public void removeCategory(String categoryName) {
        Category categoryToRemove = null;
        for (Category category : categories) {
            if (category.getCategoryName().equals(categoryName)) {
                categoryToRemove = category;
                break;
            }
        }
        if (categoryToRemove != null) {
            categories.remove(categoryToRemove);
        }
    }

    public void displayCategories() {
        System.out.println("Categories in Expense Tracker:");
        for (Category category : categories) {
            System.out.println(category);
        }
    }
}


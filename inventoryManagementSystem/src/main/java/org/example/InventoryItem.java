package org.example;

public class InventoryItem {
    private String name;
    private int quantity;
    private double price;

    public InventoryItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Item: " + name + ", Quantity: " + quantity + ", Price: R" + price;
    }
}

// Class for managing the inventory
class Inventory {
    private InventoryItem[] items;
    private int itemCount;

    public Inventory(int size) {
        items = new InventoryItem[size];
        itemCount = 0;
    }

    public void addItem(InventoryItem item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
            System.out.println("Item added: " + item.getName());
        } else {
            System.out.println("Inventory is full. Cannot add more items.");
        }
    }

    public void removeItem(String name) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getName().equalsIgnoreCase(name)) {
                items[i] = items[itemCount - 1];
                items[itemCount - 1] = null;
                itemCount--;
                System.out.println("Item removed: " + name);
                return;
            }
        }
        System.out.println("Item not found: " + name);
    }

    public void displayInventory() {
        System.out.println("\nInventory Report:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i]);
        }
    }
}



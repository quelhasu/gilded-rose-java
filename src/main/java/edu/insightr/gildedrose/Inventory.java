package edu.insightr.gildedrose;

/**
 * TODO - updateSellin
 *
 * @author qunnamed
 */
public class Inventory {

    private Item[] items;

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }
    
    

    public Inventory() {
        super();
        items = new Item[]{
            new OtherItem("+5 Dexterity Vest", 10, 20),
            new AgedBrie("Aged Brie", 2, 0),
            new OtherItem("Elixir of the Mongoose", 5, 7),
            new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
            new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new ConjuredItem("Conjured Mana Cake", 3, 6)
        };

    }

    public void printInventory() {
        System.out.println("***************");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("***************");
        System.out.println("\n");
    }

    public void updateQuality() {
        UpdateVisitor visitor = new UpdateVisitor();
        
        int sum=0; 
        for(Item item : items) 
        { 
            item.accept(visitor); 
        }         
//        for (int i = 0; i < items.length; i++) {
//            if (items[i].getName() != "Aged Brie"
//                && items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
//                if (items[i].getQuality() > 0) {
//                    if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
//                        items[i].setQuality(items[i].getQuality() - 1);
//                    }
//                }
//            } else {
//                if (items[i].getQuality() < 50) {
//                    items[i].setQuality(items[i].getQuality() + 1);
//
//                    if (items[i].getName() == "Backstage passes to a TAFKAL80ETC concert") {
//                        if (items[i].getSellIn() < 11) {
//                            if (items[i].getQuality() < 50) {
//                                items[i].setQuality(items[i].getQuality() + 1);
//                            }
//                        }
//
//                        if (items[i].getSellIn() < 6) {
//                            if (items[i].getQuality() < 50) {
//                                items[i].setQuality(items[i].getQuality() + 1);
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
//                items[i].setSellIn(items[i].getSellIn() - 1);
//                if (items[i].getName() == "Conjured Mana Cake") {
//                    items[i].setQuality(items[i].getQuality() - 1);
//                }
//            }
//
//            if (items[i].getSellIn() < 0) {
//                if (items[i].getName() != "Aged Brie") {
//                    if (items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
//                        if (items[i].getQuality() > 0) {
//                            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
//                                items[i].setQuality(items[i].getQuality() - 1);
//                            }
//                        }
//                    } else {
//                        items[i].setQuality(items[i].getQuality() - items[i].getQuality());
//                    }
//                } else {
//                    if (items[i].getQuality() < 50) {
//                        items[i].setQuality(items[i].getQuality() + 1);
//                    }
//                }
//            }
//        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        for (int i = 0; i < 10; i++) {
            inventory.updateQuality();
            inventory.printInventory();
        }
    }

    Item[] getItems() {
        return items;
    }
}

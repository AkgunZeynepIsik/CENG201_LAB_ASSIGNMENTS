package Lab1;
import Lab1.game.inventory.Item;  // we need to import package
import Lab1.game.inventory.Inventory;

public class GameShop {      //our demo class
    public static void main(String[] args) {
        Inventory shop = new Inventory();

        Item galaxy = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item shadow = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item pixel = new Item("Pixel Legends", "Strategy", 3, "PL-0091");
        shop.addItem(galaxy);
        shop.addItem(shadow);
        shop.addItem(pixel);
        shop.displayAll();

        System.out.println();
        galaxy.sell(4);
        shadow.sell(6); //error!!! there is only 5

        System.out.println();
        shop.displayAll();
        System.out.println();
        shop.auditSerialCodes();
    }
}
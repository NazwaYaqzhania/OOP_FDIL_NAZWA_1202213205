import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List<Menu> ListMenu = new ArrayList<>();

    // TODO Create Method to Insert Menu to Database
    public void InsertMenu (Menu menu) {
        ListMenu.add(menu);
    }

    // TODO Create Method to Show Menu from Database
    public void Showmenu () {
            System.out.println("Menu");
            System.out.println("==============================");
            for (int i = 0; i < ListMenu.size(); i++) {
                System.out.println((i + 1) + ". " + ListMenu.get(i).Name + " (" + ListMenu.get(i).Category + ") Rp. " + listMenu.get(i).Price + "\n");
            }
        }
    
    }
    // TODO Create Method to Search Menu from Database
 public void SearchMenu (String Keyword) {}
    System.out.println("Hasil Pencarian: " + keyword);
        System.out.println("==========================");
        for (int i = 0; i < ListMenu.size(); i++) 
            if (ListMenu.get(i).Name.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println((i + 1) + ". " + ListMenu.get(i).Name + " (" + ListMenu.get(i).Category + ") Rp. " + ListMenu.get(i).Price + "\n");
        }


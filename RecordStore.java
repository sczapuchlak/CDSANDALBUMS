package com.Stephanie;
import java.util.ArrayList;
import java.util.Scanner;
public class RecordStore {

    public static void main(String[] args) {

        Scanner stringScanner = new Scanner(System.in);

        //create some example cd's and add them to an inventory list
        ArrayList<CD> cdInventory = new ArrayList<CD>();
        CD testCD1 = new CD("Beyonce", "Lemonade", 9.99);
        CD testCD2 = new CD("Bob Dylan", "Basement Tapes", 6.99);

        cdInventory.add(testCD1);
        cdInventory.add(testCD2);

        //And some example LP's and add them to and inventory list
        ArrayList<LP> lpInventory = new ArrayList<LP>();
        LP testLP1 = new LP("Michael Jackson", "Thriller", 4, 9.99);
        LP testLP2 = new LP("Replacements", "Hootenany", 3, 7.99);

        lpInventory.add(testLP1);
        lpInventory.add(testLP2);

        System.out.println("All LP's in Inventory: ");
        for (LP lp : lpInventory) {
            System.out.println(lp);
        }
        System.out.println("All CD's in Inventory: ");
        for (CD cd : cdInventory) {
            System.out.println(cd);
        } 
        //create a master list with all albums in it
        ArrayList<Album> allInventory = new ArrayList<Album>();
        allInventory.add(lpInventory);
        allInventory.add(cdInventory);

        //search fpr any cd or lp that matches a search term
        System.out.println("Enter artist name or title to search for. Works for" +
                "partial artist/titles");
        String searchString = stringScanner.nextLine();
        searchForAlbum(allInventory, searchString);
    }

    private static void searchForAlbum(ArrayList<Album> albums, String searchTerm) {
        searchTerm = searchTerm.toLowerCase();//work in lowercase
        boolean found = false;
        for (Album a : albums) {
            //check both artist and title for searchterm
            if (a.getTitle().toLowerCase().contains(searchTerm) || a.getArtist().toLowerCase().contains(searchTerm)) {
                found = true;
                System.out.println(a);
            }
        }
        if (!found) {
            System.out.println("Sorry " + searchTerm + "was not found!");
        }
    }
}
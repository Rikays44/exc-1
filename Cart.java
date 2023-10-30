import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        List<String> cartlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your cart");

        while (true) {
            System.out.print(">");
            String input = scanner.nextLine().trim();
            if (input.equals("List")) {
                if (cartlist.isEmpty()) {
                System.out.println("Your cart is empty");
                
            } 
            else {
                for ( int i = 0; i < cartlist.size(); i++) {
                    System.out.println((i + 1) + "." +  cartlist.get(i));
                }
            }
            } else if (input.startsWith("add")) {
                String[] items = input.substring(4).split(",");
                for ( String item : items) {
                item = item.trim();
                if (!item.isEmpty() && !cartlist.contains(item)){
                    System.out.println(item + " has been added to your cart");
                    cartlist.add(item);
                } else if (cartlist.contains(item)) {
                    System.out.println(item +  " is already in your cart");
                } 
                }
            }else if (input.equals("exit")) {
                        System.out.println("Thank you for shopping with us");
                        break;
            }
             else if (input.startsWith("delete")) {
                String unwant = input.substring(7).trim();
                if (unwant.matches("\\d+")) {
                    int unwanted = Integer.parseInt(unwant);
                    if (unwanted >= 1 && unwanted <= cartlist.size()) {
                        String removeUnwanted = cartlist.remove(unwanted - 1);
                        System.out.println(removeUnwanted + " has been removed from your cart");

                    } else if (unwanted > cartlist.size()) {
                        System.out.println("invalid item index");
                    }  
                    else { 
                        System.out.println("invalid command");
                    }
                    
                     
                    
                    }
            } 
                
            
        }
    
}
} 
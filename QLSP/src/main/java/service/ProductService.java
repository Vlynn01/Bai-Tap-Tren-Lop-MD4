package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> products = new ArrayList<>();


    static {
        products.add(new Product(1,"BWM","https://th.bing.com/th/id/OIP.LtB_-jhnui3vNSvDehiI_AHaEK?w=291&h=180&c=7&r=0&o=5&pid=1.7", 20000.0));
        products.add(new Product(2,"Audi","https://th.bing.com/th/id/OIP.ZA5uLj8J1ZS8vJfmoj3WgwHaEL?w=301&h=180&c=7&r=0&o=5&pid=1.7", 30000.0));
        products.add(new Product(3,"Ferrari","https://th.bing.com/th/id/OIP.bLHpSavcILooyNVA0fdR1gHaFj?w=220&h=180&c=7&r=0&o=5&pid=1.7", 40000.0));
        products.add(new Product(4,"Mercedes","https://th.bing.com/th/id/OIP.hWF8G4Hgahqrxa185CfzEgHaEo?w=280&h=180&c=7&r=0&o=5&pid=1.7", 50000.0));
    }
    public static void add(Product product){
        products.add(product);
    }
    public  static void delete(int id){
        products.remove(findByid(id));
    }
    public static Product findByid(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id){
                return products.get(i) ;
            }
        }
        return null;
    }
//    public static void edit(int id,Product product){
//        for (int i = 0; i < products.size(); i++) {
//            if(products.get(i).getId()== id){
//                products.set(i,product);
//            }
//        }
//    }
}

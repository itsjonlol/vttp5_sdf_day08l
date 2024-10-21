package project01am;


import day08.Product;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//import Product;

public class App {
    public static void main(String[] args) {
        
        List<Product> productList = new ArrayList<>();
        LocalDate ldCreated = LocalDate.of(2024,10,21);
        Date createDt = Date.from(ldCreated.atStartOfDay(ZoneId.systemDefault()).toInstant());


        Product mouse = new Product(1L,"Mouse","For click UI on screen", "Computer",createDt,99.0f);
    
        
        Product keyboard = new Product(2L,"Keyboard","device that allows alphanumeric inputs","Computer",createDt,235.5f);
        Product monitor = new Product(3L,"15.6in monitor","Extened display panel", "Computer",createDt,157.5f);
        Product phone1 = new Product(4L,"Huawei Pura 70 Ultra","Huawei Phone","Mobile",createDt,900.0f);
        Product phone2 = new Product(5L,"Huawei Mate 50 Pr","Huawei Phone","Mobile",createDt,1200.0f);
        Product phone3 = new Product(6L,"iPhone 16 Pro","iPhone","Mobile",createDt,2000.0f);
        Product phone4 = new Product(7L, "iPhone 14 Pro" , "iPhone", "Mobile", createDt, 1800.0f);

        productList.add(mouse);
        productList.add(keyboard);
        productList.add(monitor);
        productList.add(phone1);
        productList.add(phone2);
        productList.add(phone3);
        productList.add(phone4);

        List<Product> filteredProducts = new ArrayList<>();
        filteredProducts = productList.stream().filter(p -> p.getProdCategory().equals("Mobile") && (p.getPrice() > 1500.0f)).collect(Collectors.toList());
        filteredProducts.forEach(System.out::println);
        

        //write the list of filtered objects to a file
        FileWriter fw;
        try {
            fw = new FileWriter(args[0],false);
            BufferedWriter bw = new BufferedWriter(fw);
            Iterator<Product> iterator = filteredProducts.iterator();
            while (iterator.hasNext()) {
                bw.write(iterator.next().toString());
                bw.newLine();
            }
            bw.flush();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        

        //using comparator to perform sorting
        //single column comparison

        //Comparator<Product> comparator = Comparator.comparing(p-> p.getProdName());
        Comparator<Product> comparator; // same. (reference method)
        comparator = Comparator.comparing(Product::getProdName);
        productList.sort(comparator);
        productList.forEach(System.out::println);

        productList.sort(comparator.reversed());
        productList.forEach(System.out::println);

        //sort an array of string 
        //sort ascending and print
        //sort descending and print

        String arr[] = {"Bernard","Zachary","Theophilis","Sammy","Christopher"};

        // Comparator<String> comparator2 = Comparator.comparing()


        
    }
    
}

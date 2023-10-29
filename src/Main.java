import Produtos.ImportedProduct;
import Produtos.Produto;
import Produtos.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        String name;
        Double price;
        Double CustomFee = 0.0;
        Date manufatureDate = formato.parse("00/00/0000");
        //sc.nextLine();
        //Date a = formato.parse(sc.next());
        System.out.print("Quantos produtos registar ? ");
        int numero = sc.nextInt();
        List<Produto> produtos = new ArrayList<Produto>();
        for (int i = 0; i < numero; i++) {
            System.out.print("Common, imported or used(1,2,3) ? ");
            int type = sc.nextInt();
            if (type == 1) {
                System.out.println("Produto #" + i + 1 + " data:");
                System.out.print("name:");
                name = sc.next();
                System.out.print("Price: ");
                price = sc.nextDouble();
                produtos.add(i, new Produto(name, price));
            } else if (type == 2) {
                System.out.println("Produto #" + i + 1 + " data:");
                System.out.print("name:");
                name = sc.next();
                System.out.print("Price: ");
                price = sc.nextDouble();
                System.out.print("Custon fee:");
                CustomFee = sc.nextDouble();

                produtos.add(i, new ImportedProduct(name, price, CustomFee));
            } else if (type == 3) {
                System.out.println("Produto #" + (i + 1) + " data:");
                System.out.print("name:");
                name = sc.next();
                System.out.print("Price: ");
                price = sc.nextDouble();
                System.out.print("Maufatura Date:");
                manufatureDate = formato.parse(sc.next());
                String a = manufatureDate.toString();
                produtos.add(new UsedProduct(name, price, manufatureDate));
            } else {
                System.out.println("não válido");
                break;


            }



        }

        for (int i = 0; i < numero; i++) {
            System.out.println(produtos.get(i).toString());
        }


        sc.close();
    }
}
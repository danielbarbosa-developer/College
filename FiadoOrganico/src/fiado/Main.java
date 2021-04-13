package fiado;

import java.util.Scanner;
import services.*;
import dtos.ConsumerDto;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	    System.out.println("Informe o nome do cliente: ");
	    String name = scanner.nextLine();


        System.out.println("Informe o telefone do cliente: ");
        String phone = scanner.nextLine();

        System.out.println("Informe o número itens no carrinho de compras: ");
        int products = Integer.valueOf(scanner.nextLine());

        ConsumerDto consumer = new ConsumerDto(products);
        int[] values = new int[products];

        System.out.println("Informe o valor da compra... ");

        for(int i = 1; i <= products; i++){
            System.out.println("Informe o valor do item... " + i);
            values[i-1] = Integer.valueOf(scanner.nextLine());
        }

        try{
            if(ConsumerValidation.ValidateName(name))
                consumer.SetName(name);
            else
                throw new java.lang.NullPointerException();
            if(ConsumerValidation.ValidatePhone(phone))
                consumer.SetPhone(phone);
            else
                throw new java.lang.NullPointerException();
            consumer.SetOnCredits(values);
            System.out.println("O valor total da compra é:" + Operations.SumWithForeach(consumer.GetOnCredits()));
        }
        catch (java.lang.NullPointerException e) {
            System.out.println("Erro ao efetuar o registro, dados incompletos");
        }
    }
}

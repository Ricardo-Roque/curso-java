package application.contract;

import entities.contract.Contract;
import entities.contract.Installments;
import model.services.contract.ContractService;
import model.services.contract.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContract {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int contractNumber = sc.nextInt();
        System.out.print("Data (dd/MM/yyy): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int months = sc.nextInt();

        Contract contract = new Contract(contractNumber, date, contractValue);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        System.out.println("Parcelas: ");
        for (Installments installment : contract.getInstallments()) {
            System.out.println(installment.toString());
        }


        sc.close();
    }
}

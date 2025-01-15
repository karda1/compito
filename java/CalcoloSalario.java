import java.util.Scanner;

// Questo programma calcola il salario settimanale di un dipendente.
// L'utente inserisce le ore lavorate e la tariffa oraria.
// Il programma tiene conto delle ore straordinarie (oltre 40 ore settimanali) che vengono pagate al 50% in più.

public class CalcoloSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ORE_SETTIMANALI = 40;
        final double TARIFFA_STRAORDINARIO = 1.5;

        System.out.print("Inserisci le ore lavorate nella settimana: ");
        double oreLavorate = input.nextDouble();

        System.out.print("Inserisci la tariffa oraria: ");
        double tariffaOraria = input.nextDouble();

        double salario;

        if (oreLavorate <= ORE_SETTIMANALI) {
            salario = oreLavorate * tariffaOraria;
        } else {
            salario = ORE_SETTIMANALI * tariffaOraria + (oreLavorate - ORE_SETTIMANALI) * tariffaOraria * TARIFFA_STRAORDINARIO;
        }

        System.out.printf("Il salario settimanale è: %.2f\n", salario);

        input.close();
    }
}

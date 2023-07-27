import java.time.LocalDate;
import java.util.Scanner;

public class Agenzia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            try {
            System.out.println("Vuoi inserire una vacanza (premi 1) o vuoi uscire (premi 0) ? ");
            int scelta = input.nextInt();
            if (scelta == 0) {
                exit = false;
            } else if (scelta == 1) {
                System.out.println("Inserire la destinazione:");
                input.nextLine();
                String destinazione = input.nextLine();

                System.out.println("Inserire la data di inizio della vacanza (ES: yyyy-MM-dd):");
                LocalDate dataInizio = LocalDate.parse(input.nextLine());

                System.out.println("Inserire la data della fine della vacanza (ES: yyyy-MM-dd):");
                LocalDate dataFine = LocalDate.parse(input.nextLine());

                Vacanza vacanza = new Vacanza(destinazione, dataInizio, dataFine);
                System.out.println("Hai prenotato una vacanza di " + vacanza.durataVacanza() + " giorni a " +
                        vacanza.getDestinazione() + " dal " + vacanza.getDataInizio() + " al " + vacanza.getDataFine());
            } else {
                System.out.println("Comando non valido. Riprova.");
            }
            } catch (RuntimeException e) {
                System.out.println("Errore durante la prenotazione: " + e.getMessage());
            }
        }


        }
    }


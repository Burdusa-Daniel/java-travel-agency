import java.time.LocalDate;
import java.time.Period;

public class Vacanza {
private String destinazione;
private LocalDate dataInizio;
private LocalDate dataFine;

    public Vacanza(String destinazione, LocalDate dataInizio, LocalDate dataFine) throws RuntimeException{
        if (destinazione == null|| destinazione.isEmpty()){
            throw new RuntimeException("the destination must not be null");
        }
        if (dataInizio == null||dataInizio.isBefore(LocalDate.now())){
            throw new RuntimeException("the date for the start of the vacantion is invalid");
        }
        if(dataFine == null||dataFine.isBefore(dataInizio)){
            throw new RuntimeException("the date for the end of the vacantion is invalid");
        }
        this.destinazione = destinazione;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }
    public String getDestinazione() {
        return destinazione;
    }
    public LocalDate getDataInizio() {
        return dataInizio;
    }
    public LocalDate getDataFine() {
        return dataFine;
    }
    public int durataVacanza(){
        Period vacantion = Period.between(dataInizio,dataFine);
        return vacantion.getDays();
    }
}

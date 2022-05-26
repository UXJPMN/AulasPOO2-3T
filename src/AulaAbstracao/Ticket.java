package AulaAbstracao;

import java.time.LocalDate;

public class Ticket extends DigitalProduct{
    private LocalDate date;
    private String ownership;
    private String address;
    private String company;
    private String eventInfo;
    private int ownershipChanges;
    public String identification;

    public String getAddress() {
        return address;
    }

    @Override
    public String getPublisherInfo() {
        return company + eventInfo;
    }

    @Override
    public boolean getProductIsValid() {
        LocalDate now = LocalDate.now();
        boolean equalDate = now.isEqual(date);

        return equalDate && identification.equals(ownership);
    }

    public Ticket(LocalDate date, String ownership, String address, String company, String eventInfo, String name, int id, String category, float price) {
        this.date = date;
        this.ownership = ownership;
        this.address = address;
        this.company = company;
        this.eventInfo = eventInfo;
        this.name = name;
        this.id = id;
        this.category = category;
        this.price = price;
        this.ownershipChanges = 0;
    }

    public void changeOwnership(String ownership) {
        if (ownershipChanges < 2) {
            this.ownership = ownership;
            ownershipChanges++;
        } else {
            System.out.println("Você não pode trocar a titularidade de um mesmo ingresso mais de 2x.");
        }
    }
}

package AulaAbstracao;

public abstract class DigitalProduct {
    protected String name;
    int id;
    protected String category;
    protected float price;

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getCategory() {
        return this.category;
    }

    public float getPrice() {
        return this.price;
    }

    public float calculateInstallments(int installments) {
        float multiplyFactor = 1 + ((float) installments / 40);

        return this.price * multiplyFactor / installments;
    }

    public abstract String getPublisherInfo();

    public abstract boolean getProductIsValid();
}

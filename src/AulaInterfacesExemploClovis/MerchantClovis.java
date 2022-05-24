package AulaInterfacesExemploClovis;

public class MerchantClovis implements IMerchant, IBoss {
    private String name;
    private int id;
    private String[] items;
    private float maxHp;
    private float hp;

    @Override
    public String sell(String item) {
        return "Item sold: " + item;
    }

    @Override
    public String buy(String item) {
        return "Item bought: " + item;
    }

    @Override
    public String talk(int iterations) {
        return iterations == 0 ? "Hello, stranger." : "Over here, stranger.";
    }

    @Override
    public float getHp() {
        return hp;
    }

    @Override
    public float getMaxHp() {
        return maxHp;
    }

    @Override
    public float attack(float damage) {
        return damage;
    }

    @Override
    public float receiveDamage(float damage) {
        hp -= damage;
        return damage;
    }

    @Override
    public String leave() {
        return "Enough talk!";
    }


    @Override
    public String lastWords() {
        return "I will be back!";
    }

    @Override
    public String humiliation() {
        return "You're weak, you lack hatred!";
    }

    @Override
    public float specialAttack() {
        return 250;
    }

    public MerchantClovis(String name, int id, String[] items) {
        this.name = name;
        this.id = id;
        this.items = items;
    }
}

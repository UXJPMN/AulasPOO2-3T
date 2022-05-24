package AulaInterfacesExemploClovis;

public interface IEnemy {
    float getHp();
    float getMaxHp();
    float attack(float damage);
    float receiveDamage(float damage);
}

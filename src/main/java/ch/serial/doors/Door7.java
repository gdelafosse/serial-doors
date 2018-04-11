package ch.serial.doors;

import javax.persistence.*;
import java.util.Collection;

public class Door7 {

    @Entity
    public static final class Drink
    {
        private String name;

        @Version
        private int version;

        private int amount;

        private int price;

        public String getName()
        {
            return name;
        }

        public void setName(final String name)
        {
            this.name = name;
        }

        public int getAmount()
        {
            return amount;
        }

        public void setAmount(final int amount)
        {
            this.amount = amount;
        }

        public int getPrice()
        {
            return price;
        }

        public void setPrice(final int price)
        {
            this.price = price;
        }

    }

    public static class DrinkService {

        @PersistenceContext(unitName = "drink-machine-pu")
        private EntityManager em;

        public Collection<Drink> listDrinks() {
            TypedQuery<Drink> result = em.createQuery("SELECT d FROM Drink d", Drink.class);
            return result.getResultList();
        }

        public Drink addDrink(Drink drink) {
            em.persist(drink);
            return drink;
        }

        public Drink updateDrink(String drinkName, int amount) {
            Drink drink = em.find(Drink.class, drinkName);
            drink.setAmount(amount);
            return drink;
        }

        public Drink getDrink(String drinkName) throws DrinkNotFoundException {
            Drink drink = em.find(Drink.class, drinkName);
            assertDrink(drink, drinkName);
            em.detach(drink);
            return drink;
        }

        private void assertDrink(Drink drink, String drinkName) throws DrinkNotFoundException {
            if (drink == null) {
                throw new DrinkNotFoundException(drinkName);
            }
        }
    }

    public static class DrinkNotFoundException extends Exception
    {
        public DrinkNotFoundException(String drinkName) {
            super(String.format("The drink called '%s' is no more available.", drinkName));
        }
    }
}

package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("example");

    public static void main(String[] args) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        Customer customer = new Customer("Bob", "Ross");

        entityManager.getTransaction().begin();

        entityManager.persist(customer);

        entityManager.getTransaction().commit();
        entityManager.close();
        ENTITY_MANAGER_FACTORY.close();
    }
}
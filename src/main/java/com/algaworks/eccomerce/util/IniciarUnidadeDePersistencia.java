package com.algaworks.eccomerce.util;

import com.algaworks.eccomerce.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IniciarUnidadeDePersistencia {

    public static void main(String[] args) {
        EntityManagerFactory enitityManagerFactory = Persistence.createEntityManagerFactory("Ecommerce-PU");

        EntityManager entityManager = enitityManagerFactory.createEntityManager();

        Produto produto = entityManager.find(Produto.class, 1);
        System.out.println(produto.getNome());

        entityManager.close();
        enitityManagerFactory.close();

    }
}

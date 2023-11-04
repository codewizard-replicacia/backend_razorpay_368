package com.apps.razorpay.repository;


import com.apps.razorpay.model.Card_Payment;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class Card_PaymentRepository extends SimpleJpaRepository<Card_Payment, String> {
    private final EntityManager em;
    public Card_PaymentRepository(EntityManager em) {
        super(Card_Payment.class, em);
        this.em = em;
    }
    @Override
    public List<Card_Payment> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"Card_Payment\"", Card_Payment.class).getResultList();
    }
}
package com.apps.razorpay.repository;


import com.apps.razorpay.model.Wallet_Payment;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class Wallet_PaymentRepository extends SimpleJpaRepository<Wallet_Payment, String> {
    private final EntityManager em;
    public Wallet_PaymentRepository(EntityManager em) {
        super(Wallet_Payment.class, em);
        this.em = em;
    }
    @Override
    public List<Wallet_Payment> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"Wallet_Payment\"", Wallet_Payment.class).getResultList();
    }
}
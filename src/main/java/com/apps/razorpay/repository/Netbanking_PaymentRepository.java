package com.apps.razorpay.repository;


import com.apps.razorpay.model.Netbanking_Payment;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class Netbanking_PaymentRepository extends SimpleJpaRepository<Netbanking_Payment, String> {
    private final EntityManager em;
    public Netbanking_PaymentRepository(EntityManager em) {
        super(Netbanking_Payment.class, em);
        this.em = em;
    }
    @Override
    public List<Netbanking_Payment> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"Netbanking_Payment\"", Netbanking_Payment.class).getResultList();
    }
}
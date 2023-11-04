package com.apps.razorpay.repository;


import com.apps.razorpay.model.Upi_Payment;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class Upi_PaymentRepository extends SimpleJpaRepository<Upi_Payment, String> {
    private final EntityManager em;
    public Upi_PaymentRepository(EntityManager em) {
        super(Upi_Payment.class, em);
        this.em = em;
    }
    @Override
    public List<Upi_Payment> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"Upi_Payment\"", Upi_Payment.class).getResultList();
    }
}
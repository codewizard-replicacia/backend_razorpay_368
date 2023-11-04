package com.apps.razorpay.repository;


import com.apps.razorpay.model.Subscription;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class SubscriptionRepository extends SimpleJpaRepository<Subscription, String> {
    private final EntityManager em;
    public SubscriptionRepository(EntityManager em) {
        super(Subscription.class, em);
        this.em = em;
    }
    @Override
    public List<Subscription> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"Subscription\"", Subscription.class).getResultList();
    }
}
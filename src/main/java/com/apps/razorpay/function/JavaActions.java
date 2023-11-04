package com.apps.razorpay.function;

import com.apps.razorpay.model.Subscription;
import com.apps.razorpay.model.Netbanking_Payment;
import com.apps.razorpay.model.Card_Payment;
import com.apps.razorpay.model.Wallet_Payment;
import com.apps.razorpay.model.Upi_Payment;




import com.apps.razorpay.model.complex.Upi;
import com.apps.razorpay.model.complex.Card;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  
package com.apps.razorpay.function;

import com.apps.razorpay.model.Subscription;
import com.apps.razorpay.model.Netbanking_Payment;
import com.apps.razorpay.model.Card_Payment;
import com.apps.razorpay.model.Wallet_Payment;
import com.apps.razorpay.model.Upi_Payment;
import com.apps.razorpay.model.complex.Upi;
import com.apps.razorpay.model.complex.Card;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.razorpay.repository.Wallet_PaymentRepository;
import com.apps.razorpay.repository.Upi_PaymentRepository;
import com.apps.razorpay.repository.SubscriptionRepository;
import com.apps.razorpay.repository.Card_PaymentRepository;
import com.apps.razorpay.repository.Netbanking_PaymentRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   

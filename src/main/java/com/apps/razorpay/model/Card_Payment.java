package com.apps.razorpay.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.razorpay.model.Subscription;
import com.apps.razorpay.model.Netbanking_Payment;
import com.apps.razorpay.model.Card_Payment;
import com.apps.razorpay.model.Wallet_Payment;
import com.apps.razorpay.model.Upi_Payment;
import com.apps.razorpay.model.complex.Upi;
import com.apps.razorpay.model.complex.Card;
import com.apps.razorpay.converter.DurationConverter;
import com.apps.razorpay.converter.UUIDToByteConverter;
import com.apps.razorpay.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Card_Payment")
@Table(name = "\"Card_Payment\"", schema =  "\"razorpay\"")
@Data
                        
public class Card_Payment {
	public Card_Payment () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"pId\"", nullable = true )
  private Long pId;
	  
  @Column(name = "\"Id\"", nullable = true )
  private String id;
  
	  
  @Column(name = "\"Entity\"", nullable = true )
  private String entity;
  
	  
  @Column(name = "\"Amount\"", nullable = true )
  private Long amount;
  
	  
  @Column(name = "\"Currency\"", nullable = true )
  private String currency;
  
	  
  @Column(name = "\"Base_amount\"", nullable = true )
  private String base_amount;
  
	  
  @Column(name = "\"Status\"", nullable = true )
  private String status;
  
	  
  @Column(name = "\"Order_id\"", nullable = true )
  private String order_id;
  
	  
  @Column(name = "\"Invoice_id\"", nullable = true )
  private String invoice_id;
  
	  
  @Column(name = "\"International\"", nullable = true )
  private String international;
  
	  
  @Column(name = "\"Method\"", nullable = true )
  private String method;
  
	  
  @Column(name = "\"Amount_refunded\"", nullable = true )
  private Long amount_refunded;
  
	  
  @Column(name = "\"amount_transferred\"", nullable = true )
  private Long amount_transferred;
  
	  
  @Column(name = "\"Refund_status\"", nullable = true )
  private String refund_status;
  
	  
  @Column(name = "\"Captured\"", nullable = true )
  private Boolean captured;
  
	  
  @Column(name = "\"Description\"", nullable = true )
  private String description;
  
	  
  @Column(name = "\"Card_id\"", nullable = true )
  private String card_id;
  
	  
  @Embedded
  @Column(name = "\"Card\"")
  @AttributeOverrides({
            	@AttributeOverride(name = "emi", column = @Column(name = "\"Card_Emi\"")) ,
            	@AttributeOverride(name = "entity", column = @Column(name = "\"Card_Entity\"")) ,
            	@AttributeOverride(name = "id", column = @Column(name = "\"Card_Id\"")) ,
            	@AttributeOverride(name = "iin", column = @Column(name = "\"Card_Iin\"")) ,
            	@AttributeOverride(name = "international", column = @Column(name = "\"Card_International\"")) ,
            	@AttributeOverride(name = "issuer", column = @Column(name = "\"Card_Issuer\"")) ,
            	@AttributeOverride(name = "last4", column = @Column(name = "\"Card_Last4\"")) ,
            	@AttributeOverride(name = "name", column = @Column(name = "\"Card_Name\"")) ,
            	@AttributeOverride(name = "network", column = @Column(name = "\"Card_Network\"")) ,
            	@AttributeOverride(name = "sub_type", column = @Column(name = "\"Card_Sub_type\"")) ,
            	@AttributeOverride(name = "type", column = @Column(name = "\"Card_Type\""))  }) 
  private Card card;
  
	  
  @Column(name = "\"Bank\"", nullable = true )
  private String bank;
  
	  
  @Column(name = "\"Wallet\"", nullable = true )
  private String wallet;
  
	  
  @Column(name = "\"Vpa\"", nullable = true )
  private String vpa;
  
	  
  @Column(name = "\"Email\"", nullable = true )
  private String email;
  
	  
  @Column(name = "\"Contact\"", nullable = true )
  private String contact;
  
	  
  @Column(name = "\"Customer_id\"", nullable = true )
  private String customer_id;
  
	  
  @Column(name = "\"Token_id\"", nullable = true )
  private String token_id;
  
	  
  @Column(name = "\"Notes\"", nullable = true )
  private String notes;
  
	  
  @Column(name = "\"Fee\"", nullable = true )
  private Long fee;
  
	  
  @Column(name = "\"Tax\"", nullable = true )
  private Long tax;
  
	  
  @Column(name = "\"Error_code\"", nullable = true )
  private String error_code;
  
	  
  @Column(name = "\"Error_description\"", nullable = true )
  private String error_description;
  
	  
  @Column(name = "\"Error_source\"", nullable = true )
  private String error_source;
  
	  
  @Column(name = "\"Error_step\"", nullable = true )
  private String error_step;
  
	  
  @Column(name = "\"Error_reason\"", nullable = true )
  private String error_reason;
  
	  
  @Column(name = "\"Acquirer_data\"", nullable = true )
  private String acquirer_data;
  
	  
  @Column(name = "\"Created_at\"", nullable = true )
  private String created_at;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Card_Payment [" 
  + "pId= " + pId  + ", " 
  + "Id= " + id  + ", " 
  + "Entity= " + entity  + ", " 
  + "Amount= " + amount  + ", " 
  + "Currency= " + currency  + ", " 
  + "Base_amount= " + base_amount  + ", " 
  + "Status= " + status  + ", " 
  + "Order_id= " + order_id  + ", " 
  + "Invoice_id= " + invoice_id  + ", " 
  + "International= " + international  + ", " 
  + "Method= " + method  + ", " 
  + "Amount_refunded= " + amount_refunded  + ", " 
  + "amount_transferred= " + amount_transferred  + ", " 
  + "Refund_status= " + refund_status  + ", " 
  + "Captured= " + captured  + ", " 
  + "Description= " + description  + ", " 
  + "Card_id= " + card_id  + ", " 
  + "Card= " + card  + ", " 
  + "Bank= " + bank  + ", " 
  + "Wallet= " + wallet  + ", " 
  + "Vpa= " + vpa  + ", " 
  + "Email= " + email  + ", " 
  + "Contact= " + contact  + ", " 
  + "Customer_id= " + customer_id  + ", " 
  + "Token_id= " + token_id  + ", " 
  + "Notes= " + notes  + ", " 
  + "Fee= " + fee  + ", " 
  + "Tax= " + tax  + ", " 
  + "Error_code= " + error_code  + ", " 
  + "Error_description= " + error_description  + ", " 
  + "Error_source= " + error_source  + ", " 
  + "Error_step= " + error_step  + ", " 
  + "Error_reason= " + error_reason  + ", " 
  + "Acquirer_data= " + acquirer_data  + ", " 
  + "Created_at= " + created_at 
 + "]";
	}
	
}
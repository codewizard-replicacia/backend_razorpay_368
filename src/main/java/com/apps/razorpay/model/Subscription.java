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

@Entity(name = "Subscription")
@Table(name = "\"Subscription\"", schema =  "\"razorpay\"")
@Data
                        
public class Subscription {
	public Subscription () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"sId\"", nullable = true )
  private Long sId;
	  
  @Column(name = "\"Id\"", nullable = true )
  private String id;
  
	  
  @Column(name = "\"Entity\"", nullable = true )
  private String entity;
  
	  
  @Column(name = "\"Plan_id\"", nullable = true )
  private String plan_id;
  
	  
  @Column(name = "\"Customer_id\"", nullable = true )
  private String customer_id;
  
	  
  @Column(name = "\"Status\"", nullable = true )
  private String status;
  
	  
  @Column(name = "\"Current_start\"", nullable = true )
  private Long current_start;
  
	  
  @Column(name = "\"Current_end\"", nullable = true )
  private Long current_end;
  
	  
  @Column(name = "\"Ended_at\"", nullable = true )
  private Long ended_at;
  
	  
  @Column(name = "\"Quantity\"", nullable = true )
  private Integer quantity;
  
	  
  @Column(name = "\"Notes\"", nullable = true )
  private String notes;
  
	  
  @Column(name = "\"Charge_at\"", nullable = true )
  private Long charge_at;
  
	  
  @Column(name = "\"Start_at\"", nullable = true )
  private Long start_at;
  
	  
  @Column(name = "\"End_at\"", nullable = true )
  private Long end_at;
  
	  
  @Column(name = "\"Auth_attempts\"", nullable = true )
  private Integer auth_attempts;
  
	  
  @Column(name = "\"Total_count\"", nullable = true )
  private Integer total_count;
  
	  
  @Column(name = "\"Paid_count\"", nullable = true )
  private Integer paid_count;
  
	  
  @Column(name = "\"Customer_notify\"", nullable = true )
  private Boolean customer_notify;
  
	  
  @Column(name = "\"Created_at\"", nullable = true )
  private Long created_at;
  
	  
  @Column(name = "\"Expire_by\"", nullable = true )
  private Long expire_by;
  
	  
  @Column(name = "\"Short_url\"", nullable = true )
  private String short_url;
  
	  
  @Column(name = "\"Has_scheduled_changes\"", nullable = true )
  private Boolean has_scheduled_changes;
  
	  
  @Column(name = "\"Change_scheduled_at\"", nullable = true )
  private String change_scheduled_at;
  
	  
  @Column(name = "\"Source\"", nullable = true )
  private String source;
  
	  
  @Column(name = "\"Payment_method\"", nullable = true )
  private String payment_method;
  
	  
  @Column(name = "\"Offer_id\"", nullable = true )
  private String offer_id;
  
	  
  @Column(name = "\"Remaining_count\"", nullable = true )
  private Integer remaining_count;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Subscription [" 
  + "sId= " + sId  + ", " 
  + "Id= " + id  + ", " 
  + "Entity= " + entity  + ", " 
  + "Plan_id= " + plan_id  + ", " 
  + "Customer_id= " + customer_id  + ", " 
  + "Status= " + status  + ", " 
  + "Current_start= " + current_start  + ", " 
  + "Current_end= " + current_end  + ", " 
  + "Ended_at= " + ended_at  + ", " 
  + "Quantity= " + quantity  + ", " 
  + "Notes= " + notes  + ", " 
  + "Charge_at= " + charge_at  + ", " 
  + "Start_at= " + start_at  + ", " 
  + "End_at= " + end_at  + ", " 
  + "Auth_attempts= " + auth_attempts  + ", " 
  + "Total_count= " + total_count  + ", " 
  + "Paid_count= " + paid_count  + ", " 
  + "Customer_notify= " + customer_notify  + ", " 
  + "Created_at= " + created_at  + ", " 
  + "Expire_by= " + expire_by  + ", " 
  + "Short_url= " + short_url  + ", " 
  + "Has_scheduled_changes= " + has_scheduled_changes  + ", " 
  + "Change_scheduled_at= " + change_scheduled_at  + ", " 
  + "Source= " + source  + ", " 
  + "Payment_method= " + payment_method  + ", " 
  + "Offer_id= " + offer_id  + ", " 
  + "Remaining_count= " + remaining_count 
 + "]";
	}
	
}
/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Oct 27 15:04:16 UTC 2017
 */
package org.apache.camel.component.salesforce.dto.generated;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * Salesforce Lookup class for SObject blng__Invoice__c_Lookup
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("blng__Invoice__c_Lookup")
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "Invoice_External_Id__c" })
public class blng__Invoice__c_Lookup {
    private String Invoice_External_Id__c;

    @JsonProperty("Invoice_External_Id__c")
    public void setInvoice_External_Id__c(String e){
    	this.Invoice_External_Id__c = e;
    }
    
    @JsonProperty("Invoice_External_Id__c")
    public String getInvoice_External_Id__c(){
    	return this.Invoice_External_Id__c;
    }
}
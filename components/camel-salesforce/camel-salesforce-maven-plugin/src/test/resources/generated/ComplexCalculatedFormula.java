/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Mar 09 16:15:49 ART 2017
 */
package $packageName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.camel.component.salesforce.api.dto.ActionOverride;
import org.apache.camel.component.salesforce.api.dto.FilteredLookupInfo;


/**
 * Salesforce DTO for SObject ComplexCalculatedFormula
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ComplexCalculatedFormula")
@JsonPropertyOrder({ "ComplexCalculatedFormula" })
public class ComplexCalculatedFormula extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // ComplexCalculatedFormula
    private String ComplexCalculatedFormula;

    @JsonProperty("ComplexCalculatedFormula")
    public String getComplexCalculatedFormula() {
        return this.ComplexCalculatedFormula;
    }

    @JsonProperty("ComplexCalculatedFormula")
    public void setComplexCalculatedFormula(String ComplexCalculatedFormula) {
        this.ComplexCalculatedFormula = ComplexCalculatedFormula;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();


        description.setMergeable(false);
        description.setUndeletable(true);
        description.setCreateable(true);
        description.setSearchLayoutable("true");
        description.setQueryable(true);
        description.setLabel("Complex Calculated Formula");
        description.setTriggerable(true);
        description.setReplicateable(true);
        description.setCustom(false);

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/Case/describe");
        sObjectDescriptionUrls1.setCaseArticleSuggestions("/services/data/v34.0/sobjects/Case/suggestedArticles");
        sObjectDescriptionUrls1.setLayouts("/services/data/v34.0/sobjects/Case/describe/layouts");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/Case");
        sObjectDescriptionUrls1.setUiEditTemplate("https://salesforce-host/{ID}/e");
        sObjectDescriptionUrls1.setQuickActions("/services/data/v34.0/sobjects/Case/quickActions");
        sObjectDescriptionUrls1.setCaseRowArticleSuggestions("/services/data/v34.0/sobjects/Case/{ID}/suggestedArticles");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/Case/{ID}");
        sObjectDescriptionUrls1.setListviews("/services/data/v34.0/sobjects/Case/listviews");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v34.0/sobjects/Case/describe/compactLayouts");
        sObjectDescriptionUrls1.setApprovalLayouts("/services/data/v34.0/sobjects/Case/describe/approvalLayouts");
        sObjectDescriptionUrls1.setUiNewRecord("https://salesforce-host/500/e");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://salesforce-host/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ComplexCalculatedFormula");
        description.setLayoutable(true);
        description.setCompactLayoutable(true);
        description.setDeprecatedAndHidden(false);

        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("ComplexCalculatedFormula", "A complex calculated formula", "string", "xsd:string", 1300, false, true, false, false, true, false, false);
        fields1.add(sObjectField1);

        description.setActivateable(false);
        description.setLabelPlural("ComplexCalculatedFormulas");
        description.setDeletable(true);
        description.setFeedEnabled(true);
        description.setSearchable(true);
        description.setCustomSetting(false);
        description.setRetrieveable(true);
        description.setKeyPrefix("500");

        return description;
    }
}

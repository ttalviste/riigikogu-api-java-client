/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import org.joda.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ajakirjandus.
 */
public class Ajakirjandus {
    /**
     * Koosseisu number.
     */
    @JsonProperty(value = "membershipNumber")
    private Integer membershipNumber;

    /**
     * Kirjeldus.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * URL.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Kuupäev.
     */
    @JsonProperty(value = "date")
    private LocalDate dateProperty;

    /**
     * Get koosseisu number.
     *
     * @return the membershipNumber value
     */
    public Integer membershipNumber() {
        return this.membershipNumber;
    }

    /**
     * Set koosseisu number.
     *
     * @param membershipNumber the membershipNumber value to set
     * @return the Ajakirjandus object itself.
     */
    public Ajakirjandus withMembershipNumber(Integer membershipNumber) {
        this.membershipNumber = membershipNumber;
        return this;
    }

    /**
     * Get kirjeldus.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set kirjeldus.
     *
     * @param description the description value to set
     * @return the Ajakirjandus object itself.
     */
    public Ajakirjandus withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get uRL.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set uRL.
     *
     * @param url the url value to set
     * @return the Ajakirjandus object itself.
     */
    public Ajakirjandus withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get kuupäev.
     *
     * @return the dateProperty value
     */
    public LocalDate dateProperty() {
        return this.dateProperty;
    }

    /**
     * Set kuupäev.
     *
     * @param dateProperty the dateProperty value to set
     * @return the Ajakirjandus object itself.
     */
    public Ajakirjandus withDateProperty(LocalDate dateProperty) {
        this.dateProperty = dateProperty;
        return this;
    }

}

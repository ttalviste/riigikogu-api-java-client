/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import org.joda.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Kasutajagrupi liige.
 */
public class KasutajagrupiLiige {
    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * Koosseisu number.
     */
    @JsonProperty(value = "membershipNumber")
    private Integer membershipNumber;

    /**
     * Liikmelisuse algus.
     */
    @JsonProperty(value = "startDate")
    private LocalDate startDate;

    /**
     * Liikmelisuse lõpp.
     */
    @JsonProperty(value = "endDate")
    private LocalDate endDate;

    /**
     * Roll.
     */
    @JsonProperty(value = "role")
    private KlassifikaatoriVRtus role;

    /**
     * Ametinimetus.
     */
    @JsonProperty(value = "jobTitle")
    private KlassifikaatoriVRtus jobTitle;

    /**
     * Get the _links value.
     *
     * @return the _links value
     */
    public List<Link> _links() {
        return this._links;
    }

    /**
     * Set the _links value.
     *
     * @param _links the _links value to set
     * @return the KasutajagrupiLiige object itself.
     */
    public KasutajagrupiLiige with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

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
     * @return the KasutajagrupiLiige object itself.
     */
    public KasutajagrupiLiige withMembershipNumber(Integer membershipNumber) {
        this.membershipNumber = membershipNumber;
        return this;
    }

    /**
     * Get liikmelisuse algus.
     *
     * @return the startDate value
     */
    public LocalDate startDate() {
        return this.startDate;
    }

    /**
     * Set liikmelisuse algus.
     *
     * @param startDate the startDate value to set
     * @return the KasutajagrupiLiige object itself.
     */
    public KasutajagrupiLiige withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get liikmelisuse lõpp.
     *
     * @return the endDate value
     */
    public LocalDate endDate() {
        return this.endDate;
    }

    /**
     * Set liikmelisuse lõpp.
     *
     * @param endDate the endDate value to set
     * @return the KasutajagrupiLiige object itself.
     */
    public KasutajagrupiLiige withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get roll.
     *
     * @return the role value
     */
    public KlassifikaatoriVRtus role() {
        return this.role;
    }

    /**
     * Set roll.
     *
     * @param role the role value to set
     * @return the KasutajagrupiLiige object itself.
     */
    public KasutajagrupiLiige withRole(KlassifikaatoriVRtus role) {
        this.role = role;
        return this;
    }

    /**
     * Get ametinimetus.
     *
     * @return the jobTitle value
     */
    public KlassifikaatoriVRtus jobTitle() {
        return this.jobTitle;
    }

    /**
     * Set ametinimetus.
     *
     * @param jobTitle the jobTitle value to set
     * @return the KasutajagrupiLiige object itself.
     */
    public KasutajagrupiLiige withJobTitle(KlassifikaatoriVRtus jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

}

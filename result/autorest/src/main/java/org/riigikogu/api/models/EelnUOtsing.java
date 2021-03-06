/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Eelnõu (otsing).
 */
public class EelnUOtsing {
    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * UUID.
     */
    @JsonProperty(value = "uuid")
    private String uuid;

    /**
     * Pealkiri.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Registreerimisnumber.
     */
    @JsonProperty(value = "mark")
    private Integer mark;

    /**
     * Koosseisu number.
     */
    @JsonProperty(value = "membership")
    private Integer membership;

    /**
     * Liik.
     */
    @JsonProperty(value = "draftTypeCode")
    private String draftTypeCode;

    /**
     * Aktiivne menetlusetapp.
     */
    @JsonProperty(value = "activeDraftStage")
    private String activeDraftStage;

    /**
     * Aktiivne staatus.
     */
    @JsonProperty(value = "activeDraftStatus")
    private String activeDraftStatus;

    /**
     * Menetluse staatus. Possible values include: 'IN_PROCESS', 'PROCESSED'.
     */
    @JsonProperty(value = "proceedingStatus")
    private String proceedingStatus;

    /**
     * Viimane staatuse muutumise kuupäev.
     */
    @JsonProperty(value = "activeDraftStatusDate")
    private LocalDate activeDraftStatusDate;

    /**
     * Juhtivkomisjon.
     */
    @JsonProperty(value = "leadingCommittee")
    private Subjekt leadingCommittee;

    /**
     * Algatamise kuupäev.
     */
    @JsonProperty(value = "initiated")
    private LocalDate initiated;

    /**
     * Muudatusettepanekute tähtaeg.
     */
    @JsonProperty(value = "amendmentsDeadline")
    private DateTime amendmentsDeadline;

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
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get uUID.
     *
     * @return the uuid value
     */
    public String uuid() {
        return this.uuid;
    }

    /**
     * Set uUID.
     *
     * @param uuid the uuid value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get pealkiri.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set pealkiri.
     *
     * @param title the title value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get registreerimisnumber.
     *
     * @return the mark value
     */
    public Integer mark() {
        return this.mark;
    }

    /**
     * Set registreerimisnumber.
     *
     * @param mark the mark value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withMark(Integer mark) {
        this.mark = mark;
        return this;
    }

    /**
     * Get koosseisu number.
     *
     * @return the membership value
     */
    public Integer membership() {
        return this.membership;
    }

    /**
     * Set koosseisu number.
     *
     * @param membership the membership value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withMembership(Integer membership) {
        this.membership = membership;
        return this;
    }

    /**
     * Get liik.
     *
     * @return the draftTypeCode value
     */
    public String draftTypeCode() {
        return this.draftTypeCode;
    }

    /**
     * Set liik.
     *
     * @param draftTypeCode the draftTypeCode value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withDraftTypeCode(String draftTypeCode) {
        this.draftTypeCode = draftTypeCode;
        return this;
    }

    /**
     * Get aktiivne menetlusetapp.
     *
     * @return the activeDraftStage value
     */
    public String activeDraftStage() {
        return this.activeDraftStage;
    }

    /**
     * Set aktiivne menetlusetapp.
     *
     * @param activeDraftStage the activeDraftStage value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withActiveDraftStage(String activeDraftStage) {
        this.activeDraftStage = activeDraftStage;
        return this;
    }

    /**
     * Get aktiivne staatus.
     *
     * @return the activeDraftStatus value
     */
    public String activeDraftStatus() {
        return this.activeDraftStatus;
    }

    /**
     * Set aktiivne staatus.
     *
     * @param activeDraftStatus the activeDraftStatus value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withActiveDraftStatus(String activeDraftStatus) {
        this.activeDraftStatus = activeDraftStatus;
        return this;
    }

    /**
     * Get menetluse staatus. Possible values include: 'IN_PROCESS', 'PROCESSED'.
     *
     * @return the proceedingStatus value
     */
    public String proceedingStatus() {
        return this.proceedingStatus;
    }

    /**
     * Set menetluse staatus. Possible values include: 'IN_PROCESS', 'PROCESSED'.
     *
     * @param proceedingStatus the proceedingStatus value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withProceedingStatus(String proceedingStatus) {
        this.proceedingStatus = proceedingStatus;
        return this;
    }

    /**
     * Get viimane staatuse muutumise kuupäev.
     *
     * @return the activeDraftStatusDate value
     */
    public LocalDate activeDraftStatusDate() {
        return this.activeDraftStatusDate;
    }

    /**
     * Set viimane staatuse muutumise kuupäev.
     *
     * @param activeDraftStatusDate the activeDraftStatusDate value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withActiveDraftStatusDate(LocalDate activeDraftStatusDate) {
        this.activeDraftStatusDate = activeDraftStatusDate;
        return this;
    }

    /**
     * Get juhtivkomisjon.
     *
     * @return the leadingCommittee value
     */
    public Subjekt leadingCommittee() {
        return this.leadingCommittee;
    }

    /**
     * Set juhtivkomisjon.
     *
     * @param leadingCommittee the leadingCommittee value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withLeadingCommittee(Subjekt leadingCommittee) {
        this.leadingCommittee = leadingCommittee;
        return this;
    }

    /**
     * Get algatamise kuupäev.
     *
     * @return the initiated value
     */
    public LocalDate initiated() {
        return this.initiated;
    }

    /**
     * Set algatamise kuupäev.
     *
     * @param initiated the initiated value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withInitiated(LocalDate initiated) {
        this.initiated = initiated;
        return this;
    }

    /**
     * Get muudatusettepanekute tähtaeg.
     *
     * @return the amendmentsDeadline value
     */
    public DateTime amendmentsDeadline() {
        return this.amendmentsDeadline;
    }

    /**
     * Set muudatusettepanekute tähtaeg.
     *
     * @param amendmentsDeadline the amendmentsDeadline value to set
     * @return the EelnUOtsing object itself.
     */
    public EelnUOtsing withAmendmentsDeadline(DateTime amendmentsDeadline) {
        this.amendmentsDeadline = amendmentsDeadline;
        return this;
    }

}

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Täiskogu hääletus.
 */
public class PlenaryVoting {
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
     * Hääletuse number.
     */
    @JsonProperty(value = "votingNumber")
    private Integer votingNumber;

    /**
     * Tüüp.
     */
    @JsonProperty(value = "type")
    private ClassifierValue type;

    /**
     * Kirjeldus.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Algus.
     */
    @JsonProperty(value = "startDateTime")
    private DateTime startDateTime;

    /**
     * Lõpp.
     */
    @JsonProperty(value = "endDateTime")
    private DateTime endDateTime;

    /**
     * Kohal.
     */
    @JsonProperty(value = "present")
    private Integer present;

    /**
     * Puudu.
     */
    @JsonProperty(value = "absent")
    private Integer absent;

    /**
     * Poolt.
     */
    @JsonProperty(value = "inFavor")
    private Integer inFavor;

    /**
     * Vastu.
     */
    @JsonProperty(value = "against")
    private Integer against;

    /**
     * Erapooletu.
     */
    @JsonProperty(value = "neutral")
    private Integer neutral;

    /**
     * Ei hääletanud.
     */
    @JsonProperty(value = "abstained")
    private Integer abstained;

    /**
     * Seotud eelnõu.
     */
    @JsonProperty(value = "relatedDraft")
    private DraftVolume relatedDraft;

    /**
     * Seotud dokument.
     */
    @JsonProperty(value = "relatedDocument")
    private BaseDocument relatedDocument;

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
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting with_links(List<Link> _links) {
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
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get hääletuse number.
     *
     * @return the votingNumber value
     */
    public Integer votingNumber() {
        return this.votingNumber;
    }

    /**
     * Set hääletuse number.
     *
     * @param votingNumber the votingNumber value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withVotingNumber(Integer votingNumber) {
        this.votingNumber = votingNumber;
        return this;
    }

    /**
     * Get tüüp.
     *
     * @return the type value
     */
    public ClassifierValue type() {
        return this.type;
    }

    /**
     * Set tüüp.
     *
     * @param type the type value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withType(ClassifierValue type) {
        this.type = type;
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
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get algus.
     *
     * @return the startDateTime value
     */
    public DateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set algus.
     *
     * @param startDateTime the startDateTime value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withStartDateTime(DateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get lõpp.
     *
     * @return the endDateTime value
     */
    public DateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set lõpp.
     *
     * @param endDateTime the endDateTime value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withEndDateTime(DateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Get kohal.
     *
     * @return the present value
     */
    public Integer present() {
        return this.present;
    }

    /**
     * Set kohal.
     *
     * @param present the present value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withPresent(Integer present) {
        this.present = present;
        return this;
    }

    /**
     * Get puudu.
     *
     * @return the absent value
     */
    public Integer absent() {
        return this.absent;
    }

    /**
     * Set puudu.
     *
     * @param absent the absent value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withAbsent(Integer absent) {
        this.absent = absent;
        return this;
    }

    /**
     * Get poolt.
     *
     * @return the inFavor value
     */
    public Integer inFavor() {
        return this.inFavor;
    }

    /**
     * Set poolt.
     *
     * @param inFavor the inFavor value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withInFavor(Integer inFavor) {
        this.inFavor = inFavor;
        return this;
    }

    /**
     * Get vastu.
     *
     * @return the against value
     */
    public Integer against() {
        return this.against;
    }

    /**
     * Set vastu.
     *
     * @param against the against value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withAgainst(Integer against) {
        this.against = against;
        return this;
    }

    /**
     * Get erapooletu.
     *
     * @return the neutral value
     */
    public Integer neutral() {
        return this.neutral;
    }

    /**
     * Set erapooletu.
     *
     * @param neutral the neutral value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withNeutral(Integer neutral) {
        this.neutral = neutral;
        return this;
    }

    /**
     * Get ei hääletanud.
     *
     * @return the abstained value
     */
    public Integer abstained() {
        return this.abstained;
    }

    /**
     * Set ei hääletanud.
     *
     * @param abstained the abstained value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withAbstained(Integer abstained) {
        this.abstained = abstained;
        return this;
    }

    /**
     * Get seotud eelnõu.
     *
     * @return the relatedDraft value
     */
    public DraftVolume relatedDraft() {
        return this.relatedDraft;
    }

    /**
     * Set seotud eelnõu.
     *
     * @param relatedDraft the relatedDraft value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withRelatedDraft(DraftVolume relatedDraft) {
        this.relatedDraft = relatedDraft;
        return this;
    }

    /**
     * Get seotud dokument.
     *
     * @return the relatedDocument value
     */
    public BaseDocument relatedDocument() {
        return this.relatedDocument;
    }

    /**
     * Set seotud dokument.
     *
     * @param relatedDocument the relatedDocument value to set
     * @return the PlenaryVoting object itself.
     */
    public PlenaryVoting withRelatedDocument(BaseDocument relatedDocument) {
        this.relatedDocument = relatedDocument;
        return this;
    }

}

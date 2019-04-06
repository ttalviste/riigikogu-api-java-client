/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Komisjoni liikme hääletus.
 */
public class CommitteeSittingVoting {
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
     * Dokumendi kirjeldus.
     */
    @JsonProperty(value = "documentDescription")
    private String documentDescription;

    /**
     * Dokumendi otsus.
     */
    @JsonProperty(value = "decision")
    private ClassifierValue decision;

    /**
     * Hääletus.
     */
    @JsonProperty(value = "voting")
    private String voting;

    /**
     * Asendusliige.
     */
    @JsonProperty(value = "substitute")
    private BaseUser substitute;

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
     * @return the CommitteeSittingVoting object itself.
     */
    public CommitteeSittingVoting with_links(List<Link> _links) {
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
     * @return the CommitteeSittingVoting object itself.
     */
    public CommitteeSittingVoting withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get dokumendi kirjeldus.
     *
     * @return the documentDescription value
     */
    public String documentDescription() {
        return this.documentDescription;
    }

    /**
     * Set dokumendi kirjeldus.
     *
     * @param documentDescription the documentDescription value to set
     * @return the CommitteeSittingVoting object itself.
     */
    public CommitteeSittingVoting withDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
        return this;
    }

    /**
     * Get dokumendi otsus.
     *
     * @return the decision value
     */
    public ClassifierValue decision() {
        return this.decision;
    }

    /**
     * Set dokumendi otsus.
     *
     * @param decision the decision value to set
     * @return the CommitteeSittingVoting object itself.
     */
    public CommitteeSittingVoting withDecision(ClassifierValue decision) {
        this.decision = decision;
        return this;
    }

    /**
     * Get hääletus.
     *
     * @return the voting value
     */
    public String voting() {
        return this.voting;
    }

    /**
     * Set hääletus.
     *
     * @param voting the voting value to set
     * @return the CommitteeSittingVoting object itself.
     */
    public CommitteeSittingVoting withVoting(String voting) {
        this.voting = voting;
        return this;
    }

    /**
     * Get asendusliige.
     *
     * @return the substitute value
     */
    public BaseUser substitute() {
        return this.substitute;
    }

    /**
     * Set asendusliige.
     *
     * @param substitute the substitute value to set
     * @return the CommitteeSittingVoting object itself.
     */
    public CommitteeSittingVoting withSubstitute(BaseUser substitute) {
        this.substitute = substitute;
        return this;
    }

}

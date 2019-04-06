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
 * Täiskogu istung (hääletus).
 */
public class PlenarySittingVoting {
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
     * Koosseis.
     */
    @JsonProperty(value = "membership")
    private Integer membership;

    /**
     * Toimumise aeg.
     */
    @JsonProperty(value = "sittingDateTime")
    private DateTime sittingDateTime;

    /**
     * Hääletused.
     */
    @JsonProperty(value = "votings")
    private List<PlenaryVoting> votings;

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
     * @return the PlenarySittingVoting object itself.
     */
    public PlenarySittingVoting with_links(List<Link> _links) {
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
     * @return the PlenarySittingVoting object itself.
     */
    public PlenarySittingVoting withUuid(String uuid) {
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
     * @return the PlenarySittingVoting object itself.
     */
    public PlenarySittingVoting withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get koosseis.
     *
     * @return the membership value
     */
    public Integer membership() {
        return this.membership;
    }

    /**
     * Set koosseis.
     *
     * @param membership the membership value to set
     * @return the PlenarySittingVoting object itself.
     */
    public PlenarySittingVoting withMembership(Integer membership) {
        this.membership = membership;
        return this;
    }

    /**
     * Get toimumise aeg.
     *
     * @return the sittingDateTime value
     */
    public DateTime sittingDateTime() {
        return this.sittingDateTime;
    }

    /**
     * Set toimumise aeg.
     *
     * @param sittingDateTime the sittingDateTime value to set
     * @return the PlenarySittingVoting object itself.
     */
    public PlenarySittingVoting withSittingDateTime(DateTime sittingDateTime) {
        this.sittingDateTime = sittingDateTime;
        return this;
    }

    /**
     * Get hääletused.
     *
     * @return the votings value
     */
    public List<PlenaryVoting> votings() {
        return this.votings;
    }

    /**
     * Set hääletused.
     *
     * @param votings the votings value to set
     * @return the PlenarySittingVoting object itself.
     */
    public PlenarySittingVoting withVotings(List<PlenaryVoting> votings) {
        this.votings = votings;
        return this;
    }

}

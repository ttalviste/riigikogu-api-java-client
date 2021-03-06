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
 * Päevakorrapunkt (muu küsimus).
 */
public class PEvakorrapunktMuuKSimus {
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
     * Toimumise aeg.
     */
    @JsonProperty(value = "sittingDateTime")
    private DateTime sittingDateTime;

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
     * @return the PEvakorrapunktMuuKSimus object itself.
     */
    public PEvakorrapunktMuuKSimus with_links(List<Link> _links) {
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
     * @return the PEvakorrapunktMuuKSimus object itself.
     */
    public PEvakorrapunktMuuKSimus withUuid(String uuid) {
        this.uuid = uuid;
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
     * @return the PEvakorrapunktMuuKSimus object itself.
     */
    public PEvakorrapunktMuuKSimus withSittingDateTime(DateTime sittingDateTime) {
        this.sittingDateTime = sittingDateTime;
        return this;
    }

}

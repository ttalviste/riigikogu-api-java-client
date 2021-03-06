/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Lugemine.
 */
public class Lugemine {
    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * Kood.
     */
    @JsonProperty(value = "readingCode")
    private String readingCode;

    /**
     * Menetlussündmused.
     */
    @JsonProperty(value = "proceedingEvents")
    private List<MenetlussNdmus> proceedingEvents;

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
     * @return the Lugemine object itself.
     */
    public Lugemine with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get kood.
     *
     * @return the readingCode value
     */
    public String readingCode() {
        return this.readingCode;
    }

    /**
     * Set kood.
     *
     * @param readingCode the readingCode value to set
     * @return the Lugemine object itself.
     */
    public Lugemine withReadingCode(String readingCode) {
        this.readingCode = readingCode;
        return this;
    }

    /**
     * Get menetlussündmused.
     *
     * @return the proceedingEvents value
     */
    public List<MenetlussNdmus> proceedingEvents() {
        return this.proceedingEvents;
    }

    /**
     * Set menetlussündmused.
     *
     * @param proceedingEvents the proceedingEvents value to set
     * @return the Lugemine object itself.
     */
    public Lugemine withProceedingEvents(List<MenetlussNdmus> proceedingEvents) {
        this.proceedingEvents = proceedingEvents;
        return this;
    }

}

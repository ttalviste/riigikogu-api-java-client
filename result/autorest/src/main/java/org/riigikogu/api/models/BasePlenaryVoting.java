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
 * Täiskogu hääletus (baas).
 */
public class BasePlenaryVoting {
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
     * @return the BasePlenaryVoting object itself.
     */
    public BasePlenaryVoting with_links(List<Link> _links) {
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
     * @return the BasePlenaryVoting object itself.
     */
    public BasePlenaryVoting withUuid(String uuid) {
        this.uuid = uuid;
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
     * @return the BasePlenaryVoting object itself.
     */
    public BasePlenaryVoting withType(ClassifierValue type) {
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
     * @return the BasePlenaryVoting object itself.
     */
    public BasePlenaryVoting withDescription(String description) {
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
     * @return the BasePlenaryVoting object itself.
     */
    public BasePlenaryVoting withStartDateTime(DateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

}

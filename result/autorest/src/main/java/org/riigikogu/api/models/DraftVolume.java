/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Eelnõu toimik (baas).
 */
public class DraftVolume {
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
     * @return the DraftVolume object itself.
     */
    public DraftVolume with_links(List<Link> _links) {
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
     * @return the DraftVolume object itself.
     */
    public DraftVolume withUuid(String uuid) {
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
     * @return the DraftVolume object itself.
     */
    public DraftVolume withTitle(String title) {
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
     * @return the DraftVolume object itself.
     */
    public DraftVolume withMark(Integer mark) {
        this.mark = mark;
        return this;
    }

}
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
 * Toimik (ERJK).
 */
public class ToimikERJK {
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
     * Viit.
     */
    @JsonProperty(value = "reference")
    private String reference;

    /**
     * Pealkiri.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Tüüp.
     */
    @JsonProperty(value = "volumeType")
    private String volumeType;

    /**
     * Loomise aeg.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * Dokumendid.
     */
    @JsonProperty(value = "documents")
    private List<DokumentERJK> documents;

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
     * @return the ToimikERJK object itself.
     */
    public ToimikERJK with_links(List<Link> _links) {
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
     * @return the ToimikERJK object itself.
     */
    public ToimikERJK withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get viit.
     *
     * @return the reference value
     */
    public String reference() {
        return this.reference;
    }

    /**
     * Set viit.
     *
     * @param reference the reference value to set
     * @return the ToimikERJK object itself.
     */
    public ToimikERJK withReference(String reference) {
        this.reference = reference;
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
     * @return the ToimikERJK object itself.
     */
    public ToimikERJK withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get tüüp.
     *
     * @return the volumeType value
     */
    public String volumeType() {
        return this.volumeType;
    }

    /**
     * Set tüüp.
     *
     * @param volumeType the volumeType value to set
     * @return the ToimikERJK object itself.
     */
    public ToimikERJK withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * Get loomise aeg.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Set loomise aeg.
     *
     * @param created the created value to set
     * @return the ToimikERJK object itself.
     */
    public ToimikERJK withCreated(DateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get dokumendid.
     *
     * @return the documents value
     */
    public List<DokumentERJK> documents() {
        return this.documents;
    }

    /**
     * Set dokumendid.
     *
     * @param documents the documents value to set
     * @return the ToimikERJK object itself.
     */
    public ToimikERJK withDocuments(List<DokumentERJK> documents) {
        this.documents = documents;
        return this;
    }

}

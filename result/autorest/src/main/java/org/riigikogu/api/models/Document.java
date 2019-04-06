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
 * Dokument.
 */
public class Document {
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
     * Dokumendi liik.
     */
    @JsonProperty(value = "documentType")
    private String documentType;

    /**
     * Loomise aeg.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * Koosseis.
     */
    @JsonProperty(value = "membership")
    private Integer membership;

    /**
     * Toimik.
     */
    @JsonProperty(value = "volume")
    private BaseVolume volume;

    /**
     * Seotud dokumendid.
     */
    @JsonProperty(value = "relatedDocuments")
    private List<BaseDocument> relatedDocuments;

    /**
     * Seotud toimikud.
     */
    @JsonProperty(value = "relatedVolumes")
    private List<BaseVolume> relatedVolumes;

    /**
     * Failid.
     */
    @JsonProperty(value = "files")
    private List<FileMetadata> files;

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
     * @return the Document object itself.
     */
    public Document with_links(List<Link> _links) {
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
     * @return the Document object itself.
     */
    public Document withUuid(String uuid) {
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
     * @return the Document object itself.
     */
    public Document withReference(String reference) {
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
     * @return the Document object itself.
     */
    public Document withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get dokumendi liik.
     *
     * @return the documentType value
     */
    public String documentType() {
        return this.documentType;
    }

    /**
     * Set dokumendi liik.
     *
     * @param documentType the documentType value to set
     * @return the Document object itself.
     */
    public Document withDocumentType(String documentType) {
        this.documentType = documentType;
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
     * @return the Document object itself.
     */
    public Document withCreated(DateTime created) {
        this.created = created;
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
     * @return the Document object itself.
     */
    public Document withMembership(Integer membership) {
        this.membership = membership;
        return this;
    }

    /**
     * Get toimik.
     *
     * @return the volume value
     */
    public BaseVolume volume() {
        return this.volume;
    }

    /**
     * Set toimik.
     *
     * @param volume the volume value to set
     * @return the Document object itself.
     */
    public Document withVolume(BaseVolume volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Get seotud dokumendid.
     *
     * @return the relatedDocuments value
     */
    public List<BaseDocument> relatedDocuments() {
        return this.relatedDocuments;
    }

    /**
     * Set seotud dokumendid.
     *
     * @param relatedDocuments the relatedDocuments value to set
     * @return the Document object itself.
     */
    public Document withRelatedDocuments(List<BaseDocument> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
        return this;
    }

    /**
     * Get seotud toimikud.
     *
     * @return the relatedVolumes value
     */
    public List<BaseVolume> relatedVolumes() {
        return this.relatedVolumes;
    }

    /**
     * Set seotud toimikud.
     *
     * @param relatedVolumes the relatedVolumes value to set
     * @return the Document object itself.
     */
    public Document withRelatedVolumes(List<BaseVolume> relatedVolumes) {
        this.relatedVolumes = relatedVolumes;
        return this;
    }

    /**
     * Get failid.
     *
     * @return the files value
     */
    public List<FileMetadata> files() {
        return this.files;
    }

    /**
     * Set failid.
     *
     * @param files the files value to set
     * @return the Document object itself.
     */
    public Document withFiles(List<FileMetadata> files) {
        this.files = files;
        return this;
    }

}
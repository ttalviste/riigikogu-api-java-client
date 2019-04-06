/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dokument (muudatusettepanek).
 */
public class ChangeProposalDocument {
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
     * @return the ChangeProposalDocument object itself.
     */
    public ChangeProposalDocument with_links(List<Link> _links) {
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
     * @return the ChangeProposalDocument object itself.
     */
    public ChangeProposalDocument withUuid(String uuid) {
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
     * @return the ChangeProposalDocument object itself.
     */
    public ChangeProposalDocument withReference(String reference) {
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
     * @return the ChangeProposalDocument object itself.
     */
    public ChangeProposalDocument withTitle(String title) {
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
     * @return the ChangeProposalDocument object itself.
     */
    public ChangeProposalDocument withDocumentType(String documentType) {
        this.documentType = documentType;
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
     * @return the ChangeProposalDocument object itself.
     */
    public ChangeProposalDocument withFiles(List<FileMetadata> files) {
        this.files = files;
        return this;
    }

}

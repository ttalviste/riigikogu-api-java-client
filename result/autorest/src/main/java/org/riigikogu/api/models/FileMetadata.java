/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Fail.
 */
public class FileMetadata {
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
     * Faili nimi.
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /**
     * Faililaiend.
     */
    @JsonProperty(value = "fileExtension")
    private String fileExtension;

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
     * @return the FileMetadata object itself.
     */
    public FileMetadata with_links(List<Link> _links) {
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
     * @return the FileMetadata object itself.
     */
    public FileMetadata withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get faili nimi.
     *
     * @return the fileName value
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set faili nimi.
     *
     * @param fileName the fileName value to set
     * @return the FileMetadata object itself.
     */
    public FileMetadata withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get faililaiend.
     *
     * @return the fileExtension value
     */
    public String fileExtension() {
        return this.fileExtension;
    }

    /**
     * Set faililaiend.
     *
     * @param fileExtension the fileExtension value to set
     * @return the FileMetadata object itself.
     */
    public FileMetadata withFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }

}

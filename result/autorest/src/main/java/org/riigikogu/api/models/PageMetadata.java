/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PageMetadata.
 */
public class PageMetadata {
    /**
     * The number property.
     */
    @JsonProperty(value = "number")
    private Long number;

    /**
     * The size property.
     */
    @JsonProperty(value = "size")
    private Long size;

    /**
     * The totalElements property.
     */
    @JsonProperty(value = "totalElements")
    private Long totalElements;

    /**
     * The totalPages property.
     */
    @JsonProperty(value = "totalPages")
    private Long totalPages;

    /**
     * Get the number value.
     *
     * @return the number value
     */
    public Long number() {
        return this.number;
    }

    /**
     * Set the number value.
     *
     * @param number the number value to set
     * @return the PageMetadata object itself.
     */
    public PageMetadata withNumber(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get the size value.
     *
     * @return the size value
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size value.
     *
     * @param size the size value to set
     * @return the PageMetadata object itself.
     */
    public PageMetadata withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the totalElements value.
     *
     * @return the totalElements value
     */
    public Long totalElements() {
        return this.totalElements;
    }

    /**
     * Set the totalElements value.
     *
     * @param totalElements the totalElements value to set
     * @return the PageMetadata object itself.
     */
    public PageMetadata withTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * Get the totalPages value.
     *
     * @return the totalPages value
     */
    public Long totalPages() {
        return this.totalPages;
    }

    /**
     * Set the totalPages value.
     *
     * @param totalPages the totalPages value to set
     * @return the PageMetadata object itself.
     */
    public PageMetadata withTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

}

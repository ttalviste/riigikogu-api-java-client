/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meedia.
 */
public class Meedia {
    /**
     * Tüüp.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * URL.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get tüüp.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set tüüp.
     *
     * @param type the type value to set
     * @return the Meedia object itself.
     */
    public Meedia withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get uRL.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set uRL.
     *
     * @param url the url value to set
     * @return the Meedia object itself.
     */
    public Meedia withUrl(String url) {
        this.url = url;
        return this;
    }

}

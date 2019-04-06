/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Toimiku tüüp.
 */
public class VolumeTypes {
    /**
     * Nimi.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Kood.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Get nimi.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set nimi.
     *
     * @param name the name value to set
     * @return the VolumeTypes object itself.
     */
    public VolumeTypes withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get kood.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set kood.
     *
     * @param code the code value to set
     * @return the VolumeTypes object itself.
     */
    public VolumeTypes withCode(String code) {
        this.code = code;
        return this;
    }

}

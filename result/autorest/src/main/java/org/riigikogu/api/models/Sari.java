/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sari.
 */
public class Sari {
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
     * Tähis.
     */
    @JsonProperty(value = "mark")
    private String mark;

    /**
     * Viit.
     */
    @JsonProperty(value = "reference")
    private String reference;

    /**
     * Alamsarjad.
     */
    @JsonProperty(value = "subseries")
    private List<Sari> subseries;

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
     * @return the Sari object itself.
     */
    public Sari withUuid(String uuid) {
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
     * @return the Sari object itself.
     */
    public Sari withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get tähis.
     *
     * @return the mark value
     */
    public String mark() {
        return this.mark;
    }

    /**
     * Set tähis.
     *
     * @param mark the mark value to set
     * @return the Sari object itself.
     */
    public Sari withMark(String mark) {
        this.mark = mark;
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
     * @return the Sari object itself.
     */
    public Sari withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get alamsarjad.
     *
     * @return the subseries value
     */
    public List<Sari> subseries() {
        return this.subseries;
    }

    /**
     * Set alamsarjad.
     *
     * @param subseries the subseries value to set
     * @return the Sari object itself.
     */
    public Sari withSubseries(List<Sari> subseries) {
        this.subseries = subseries;
        return this;
    }

}

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Haridus.
 */
public class Haridus {
    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * Algusaasta.
     */
    @JsonProperty(value = "startYear")
    private Integer startYear;

    /**
     * Lõpuaasta.
     */
    @JsonProperty(value = "endYear")
    private Integer endYear;

    /**
     * Haridusasutus.
     */
    @JsonProperty(value = "institution")
    private KlassifikaatoriVRtus institution;

    /**
     * Haridusaste.
     */
    @JsonProperty(value = "degree")
    private KlassifikaatoriVRtus degree;

    /**
     * Eriala.
     */
    @JsonProperty(value = "speciality")
    private String speciality;

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
     * @return the Haridus object itself.
     */
    public Haridus with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get algusaasta.
     *
     * @return the startYear value
     */
    public Integer startYear() {
        return this.startYear;
    }

    /**
     * Set algusaasta.
     *
     * @param startYear the startYear value to set
     * @return the Haridus object itself.
     */
    public Haridus withStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    /**
     * Get lõpuaasta.
     *
     * @return the endYear value
     */
    public Integer endYear() {
        return this.endYear;
    }

    /**
     * Set lõpuaasta.
     *
     * @param endYear the endYear value to set
     * @return the Haridus object itself.
     */
    public Haridus withEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }

    /**
     * Get haridusasutus.
     *
     * @return the institution value
     */
    public KlassifikaatoriVRtus institution() {
        return this.institution;
    }

    /**
     * Set haridusasutus.
     *
     * @param institution the institution value to set
     * @return the Haridus object itself.
     */
    public Haridus withInstitution(KlassifikaatoriVRtus institution) {
        this.institution = institution;
        return this;
    }

    /**
     * Get haridusaste.
     *
     * @return the degree value
     */
    public KlassifikaatoriVRtus degree() {
        return this.degree;
    }

    /**
     * Set haridusaste.
     *
     * @param degree the degree value to set
     * @return the Haridus object itself.
     */
    public Haridus withDegree(KlassifikaatoriVRtus degree) {
        this.degree = degree;
        return this;
    }

    /**
     * Get eriala.
     *
     * @return the speciality value
     */
    public String speciality() {
        return this.speciality;
    }

    /**
     * Set eriala.
     *
     * @param speciality the speciality value to set
     * @return the Haridus object itself.
     */
    public Haridus withSpeciality(String speciality) {
        this.speciality = speciality;
        return this;
    }

}
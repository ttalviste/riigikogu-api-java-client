/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Riigikogu liige (osavõtt).
 */
public class RiigikoguLiigeOsavTt {
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
     * Eesnimi.
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /**
     * Perekonnanimi.
     */
    @JsonProperty(value = "lastName")
    private String lastName;

    /**
     * Täisnimi.
     */
    @JsonProperty(value = "fullName")
    private String fullName;

    /**
     * Aktiivne.
     */
    @JsonProperty(value = "active")
    private Boolean active;

    /**
     * Fraktsioonid.
     */
    @JsonProperty(value = "factions")
    private List<KasutajagruppJaLiige> factions;

    /**
     * Istungite arv.
     */
    @JsonProperty(value = "sittings")
    private Integer sittings;

    /**
     * Osales.
     */
    @JsonProperty(value = "participated")
    private Integer participated;

    /**
     * Puudus.
     */
    @JsonProperty(value = "absent")
    private Integer absent;

    /**
     * Lähetused.
     */
    @JsonProperty(value = "secondments")
    private Integer secondments;

    /**
     * Haige.
     */
    @JsonProperty(value = "sick")
    private Integer sick;

    /**
     * Muu.
     */
    @JsonProperty(value = "other")
    private Integer other;

    /**
     * Detailid.
     */
    @JsonProperty(value = "details")
    private List<OsavTuPEv> details;

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
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt with_links(List<Link> _links) {
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
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get eesnimi.
     *
     * @return the firstName value
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set eesnimi.
     *
     * @param firstName the firstName value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get perekonnanimi.
     *
     * @return the lastName value
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set perekonnanimi.
     *
     * @param lastName the lastName value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get täisnimi.
     *
     * @return the fullName value
     */
    public String fullName() {
        return this.fullName;
    }

    /**
     * Set täisnimi.
     *
     * @param fullName the fullName value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get aktiivne.
     *
     * @return the active value
     */
    public Boolean active() {
        return this.active;
    }

    /**
     * Set aktiivne.
     *
     * @param active the active value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get fraktsioonid.
     *
     * @return the factions value
     */
    public List<KasutajagruppJaLiige> factions() {
        return this.factions;
    }

    /**
     * Set fraktsioonid.
     *
     * @param factions the factions value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withFactions(List<KasutajagruppJaLiige> factions) {
        this.factions = factions;
        return this;
    }

    /**
     * Get istungite arv.
     *
     * @return the sittings value
     */
    public Integer sittings() {
        return this.sittings;
    }

    /**
     * Set istungite arv.
     *
     * @param sittings the sittings value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withSittings(Integer sittings) {
        this.sittings = sittings;
        return this;
    }

    /**
     * Get osales.
     *
     * @return the participated value
     */
    public Integer participated() {
        return this.participated;
    }

    /**
     * Set osales.
     *
     * @param participated the participated value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withParticipated(Integer participated) {
        this.participated = participated;
        return this;
    }

    /**
     * Get puudus.
     *
     * @return the absent value
     */
    public Integer absent() {
        return this.absent;
    }

    /**
     * Set puudus.
     *
     * @param absent the absent value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withAbsent(Integer absent) {
        this.absent = absent;
        return this;
    }

    /**
     * Get lähetused.
     *
     * @return the secondments value
     */
    public Integer secondments() {
        return this.secondments;
    }

    /**
     * Set lähetused.
     *
     * @param secondments the secondments value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withSecondments(Integer secondments) {
        this.secondments = secondments;
        return this;
    }

    /**
     * Get haige.
     *
     * @return the sick value
     */
    public Integer sick() {
        return this.sick;
    }

    /**
     * Set haige.
     *
     * @param sick the sick value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withSick(Integer sick) {
        this.sick = sick;
        return this;
    }

    /**
     * Get muu.
     *
     * @return the other value
     */
    public Integer other() {
        return this.other;
    }

    /**
     * Set muu.
     *
     * @param other the other value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withOther(Integer other) {
        this.other = other;
        return this;
    }

    /**
     * Get detailid.
     *
     * @return the details value
     */
    public List<OsavTuPEv> details() {
        return this.details;
    }

    /**
     * Set detailid.
     *
     * @param details the details value to set
     * @return the RiigikoguLiigeOsavTt object itself.
     */
    public RiigikoguLiigeOsavTt withDetails(List<OsavTuPEv> details) {
        this.details = details;
        return this;
    }

}
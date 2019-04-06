/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Kasutajagrupp.
 */
public class Kasutajagrupp {
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
     * Nimi.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Lühinimi.
     */
    @JsonProperty(value = "shortName")
    private String shortName;

    /**
     * Tüüp.
     */
    @JsonProperty(value = "type")
    private KlassifikaatoriVRtus type;

    /**
     * Värv.
     */
    @JsonProperty(value = "colorHex")
    private String colorHex;

    /**
     * Sekretariaadi nimi.
     */
    @JsonProperty(value = "secretariatName")
    private String secretariatName;

    /**
     * Aktiivne.
     */
    @JsonProperty(value = "active")
    private Boolean active;

    /**
     * Liikmed.
     */
    @JsonProperty(value = "members")
    private List<Kasutaja> members;

    /**
     * Liige.
     */
    @JsonProperty(value = "membership")
    private KasutajagrupiLiige membership;

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
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp with_links(List<Link> _links) {
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
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

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
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get lühinimi.
     *
     * @return the shortName value
     */
    public String shortName() {
        return this.shortName;
    }

    /**
     * Set lühinimi.
     *
     * @param shortName the shortName value to set
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * Get tüüp.
     *
     * @return the type value
     */
    public KlassifikaatoriVRtus type() {
        return this.type;
    }

    /**
     * Set tüüp.
     *
     * @param type the type value to set
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp withType(KlassifikaatoriVRtus type) {
        this.type = type;
        return this;
    }

    /**
     * Get värv.
     *
     * @return the colorHex value
     */
    public String colorHex() {
        return this.colorHex;
    }

    /**
     * Set värv.
     *
     * @param colorHex the colorHex value to set
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp withColorHex(String colorHex) {
        this.colorHex = colorHex;
        return this;
    }

    /**
     * Get sekretariaadi nimi.
     *
     * @return the secretariatName value
     */
    public String secretariatName() {
        return this.secretariatName;
    }

    /**
     * Set sekretariaadi nimi.
     *
     * @param secretariatName the secretariatName value to set
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp withSecretariatName(String secretariatName) {
        this.secretariatName = secretariatName;
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
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get liikmed.
     *
     * @return the members value
     */
    public List<Kasutaja> members() {
        return this.members;
    }

    /**
     * Set liikmed.
     *
     * @param members the members value to set
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp withMembers(List<Kasutaja> members) {
        this.members = members;
        return this;
    }

    /**
     * Get liige.
     *
     * @return the membership value
     */
    public KasutajagrupiLiige membership() {
        return this.membership;
    }

    /**
     * Set liige.
     *
     * @param membership the membership value to set
     * @return the Kasutajagrupp object itself.
     */
    public Kasutajagrupp withMembership(KasutajagrupiLiige membership) {
        this.membership = membership;
        return this;
    }

}
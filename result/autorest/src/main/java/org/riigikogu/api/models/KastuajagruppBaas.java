/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Kastuajagrupp (baas).
 */
public class KastuajagruppBaas {
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
     * Aktiivne.
     */
    @JsonProperty(value = "active")
    private Boolean active;

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
     * @return the KastuajagruppBaas object itself.
     */
    public KastuajagruppBaas with_links(List<Link> _links) {
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
     * @return the KastuajagruppBaas object itself.
     */
    public KastuajagruppBaas withUuid(String uuid) {
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
     * @return the KastuajagruppBaas object itself.
     */
    public KastuajagruppBaas withName(String name) {
        this.name = name;
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
     * @return the KastuajagruppBaas object itself.
     */
    public KastuajagruppBaas withActive(Boolean active) {
        this.active = active;
        return this;
    }

}

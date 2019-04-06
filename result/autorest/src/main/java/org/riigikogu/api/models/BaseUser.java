/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Kasutaja (baas).
 */
public class BaseUser {
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
     * @return the BaseUser object itself.
     */
    public BaseUser with_links(List<Link> _links) {
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
     * @return the BaseUser object itself.
     */
    public BaseUser withUuid(String uuid) {
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
     * @return the BaseUser object itself.
     */
    public BaseUser withFirstName(String firstName) {
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
     * @return the BaseUser object itself.
     */
    public BaseUser withLastName(String lastName) {
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
     * @return the BaseUser object itself.
     */
    public BaseUser withFullName(String fullName) {
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
     * @return the BaseUser object itself.
     */
    public BaseUser withActive(Boolean active) {
        this.active = active;
        return this;
    }

}
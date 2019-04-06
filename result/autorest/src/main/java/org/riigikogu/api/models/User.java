/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Kasutaja.
 */
public class User {
    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * The membership property.
     */
    @JsonProperty(value = "membership")
    private UserGroupMember membership;

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
     * E-mail.
     */
    @JsonProperty(value = "email")
    private String email;

    /**
     * Telefon.
     */
    @JsonProperty(value = "phone")
    private String phone;

    /**
     * Pilt (väike).
     */
    @JsonProperty(value = "photo")
    private FileMetadata photo;

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
     * @return the User object itself.
     */
    public User with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get the membership value.
     *
     * @return the membership value
     */
    public UserGroupMember membership() {
        return this.membership;
    }

    /**
     * Set the membership value.
     *
     * @param membership the membership value to set
     * @return the User object itself.
     */
    public User withMembership(UserGroupMember membership) {
        this.membership = membership;
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
     * @return the User object itself.
     */
    public User withUuid(String uuid) {
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
     * @return the User object itself.
     */
    public User withFirstName(String firstName) {
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
     * @return the User object itself.
     */
    public User withLastName(String lastName) {
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
     * @return the User object itself.
     */
    public User withFullName(String fullName) {
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
     * @return the User object itself.
     */
    public User withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get e-mail.
     *
     * @return the email value
     */
    public String email() {
        return this.email;
    }

    /**
     * Set e-mail.
     *
     * @param email the email value to set
     * @return the User object itself.
     */
    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get telefon.
     *
     * @return the phone value
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set telefon.
     *
     * @param phone the phone value to set
     * @return the User object itself.
     */
    public User withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get pilt (väike).
     *
     * @return the photo value
     */
    public FileMetadata photo() {
        return this.photo;
    }

    /**
     * Set pilt (väike).
     *
     * @param photo the photo value to set
     * @return the User object itself.
     */
    public User withPhoto(FileMetadata photo) {
        this.photo = photo;
        return this;
    }

}
/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Kasutaja detailid (kontaktid).
 */
public class UserDetails {
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
     * Kasutajagrupp.
     */
    @JsonProperty(value = "userGroup")
    private UserGroupAndMembership userGroup;

    /**
     * Ametijuhend.
     */
    @JsonProperty(value = "jobDescriptionFile")
    private FileMetadata jobDescriptionFile;

    /**
     * Haridus.
     */
    @JsonProperty(value = "education")
    private List<Education> education;

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
     * @return the UserDetails object itself.
     */
    public UserDetails with_links(List<Link> _links) {
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
     * @return the UserDetails object itself.
     */
    public UserDetails withUuid(String uuid) {
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
     * @return the UserDetails object itself.
     */
    public UserDetails withFirstName(String firstName) {
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
     * @return the UserDetails object itself.
     */
    public UserDetails withLastName(String lastName) {
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
     * @return the UserDetails object itself.
     */
    public UserDetails withFullName(String fullName) {
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
     * @return the UserDetails object itself.
     */
    public UserDetails withActive(Boolean active) {
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
     * @return the UserDetails object itself.
     */
    public UserDetails withEmail(String email) {
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
     * @return the UserDetails object itself.
     */
    public UserDetails withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get kasutajagrupp.
     *
     * @return the userGroup value
     */
    public UserGroupAndMembership userGroup() {
        return this.userGroup;
    }

    /**
     * Set kasutajagrupp.
     *
     * @param userGroup the userGroup value to set
     * @return the UserDetails object itself.
     */
    public UserDetails withUserGroup(UserGroupAndMembership userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * Get ametijuhend.
     *
     * @return the jobDescriptionFile value
     */
    public FileMetadata jobDescriptionFile() {
        return this.jobDescriptionFile;
    }

    /**
     * Set ametijuhend.
     *
     * @param jobDescriptionFile the jobDescriptionFile value to set
     * @return the UserDetails object itself.
     */
    public UserDetails withJobDescriptionFile(FileMetadata jobDescriptionFile) {
        this.jobDescriptionFile = jobDescriptionFile;
        return this;
    }

    /**
     * Get haridus.
     *
     * @return the education value
     */
    public List<Education> education() {
        return this.education;
    }

    /**
     * Set haridus.
     *
     * @param education the education value to set
     * @return the UserDetails object itself.
     */
    public UserDetails withEducation(List<Education> education) {
        this.education = education;
        return this;
    }

}

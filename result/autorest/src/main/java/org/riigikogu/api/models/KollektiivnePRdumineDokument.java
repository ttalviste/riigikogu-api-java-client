/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Kollektiivne pöördumine (dokument).
 */
public class KollektiivnePRdumineDokument {
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
     * Viit.
     */
    @JsonProperty(value = "reference")
    private String reference;

    /**
     * Pealkiri.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Dokumendi liik.
     */
    @JsonProperty(value = "documentType")
    private String documentType;

    /**
     * Loomise aeg.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * Koosseis.
     */
    @JsonProperty(value = "membership")
    private Integer membership;

    /**
     * Toimik.
     */
    @JsonProperty(value = "volume")
    private ToimikBaas volume;

    /**
     * Seotud dokumendid.
     */
    @JsonProperty(value = "relatedDocuments")
    private List<DokumentBaas> relatedDocuments;

    /**
     * Seotud toimikud.
     */
    @JsonProperty(value = "relatedVolumes")
    private List<ToimikBaas> relatedVolumes;

    /**
     * Failid.
     */
    @JsonProperty(value = "files")
    private List<Fail> files;

    /**
     * Saatja.
     */
    @JsonProperty(value = "sender")
    private String sender;

    /**
     * Saatja viit.
     */
    @JsonProperty(value = "senderReference")
    private String senderReference;

    /**
     * Esitamise kuupäev.
     */
    @JsonProperty(value = "submittingDate")
    private LocalDate submittingDate;

    /**
     * Täitmise kuupäev.
     */
    @JsonProperty(value = "complianceDeadline")
    private LocalDate complianceDeadline;

    /**
     * Vastutav komisjon.
     */
    @JsonProperty(value = "responsibleCommittee")
    private KastuajagruppBaas responsibleCommittee;

    /**
     * Staatused / menetluskäik.
     */
    @JsonProperty(value = "statuses")
    private List<KollektiivsePRdumiseStaatus> statuses;

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
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument with_links(List<Link> _links) {
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
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withUuid(String uuid) {
        this.uuid = uuid;
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
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withReference(String reference) {
        this.reference = reference;
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
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get dokumendi liik.
     *
     * @return the documentType value
     */
    public String documentType() {
        return this.documentType;
    }

    /**
     * Set dokumendi liik.
     *
     * @param documentType the documentType value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * Get loomise aeg.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Set loomise aeg.
     *
     * @param created the created value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withCreated(DateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get koosseis.
     *
     * @return the membership value
     */
    public Integer membership() {
        return this.membership;
    }

    /**
     * Set koosseis.
     *
     * @param membership the membership value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withMembership(Integer membership) {
        this.membership = membership;
        return this;
    }

    /**
     * Get toimik.
     *
     * @return the volume value
     */
    public ToimikBaas volume() {
        return this.volume;
    }

    /**
     * Set toimik.
     *
     * @param volume the volume value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withVolume(ToimikBaas volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Get seotud dokumendid.
     *
     * @return the relatedDocuments value
     */
    public List<DokumentBaas> relatedDocuments() {
        return this.relatedDocuments;
    }

    /**
     * Set seotud dokumendid.
     *
     * @param relatedDocuments the relatedDocuments value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withRelatedDocuments(List<DokumentBaas> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
        return this;
    }

    /**
     * Get seotud toimikud.
     *
     * @return the relatedVolumes value
     */
    public List<ToimikBaas> relatedVolumes() {
        return this.relatedVolumes;
    }

    /**
     * Set seotud toimikud.
     *
     * @param relatedVolumes the relatedVolumes value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withRelatedVolumes(List<ToimikBaas> relatedVolumes) {
        this.relatedVolumes = relatedVolumes;
        return this;
    }

    /**
     * Get failid.
     *
     * @return the files value
     */
    public List<Fail> files() {
        return this.files;
    }

    /**
     * Set failid.
     *
     * @param files the files value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withFiles(List<Fail> files) {
        this.files = files;
        return this;
    }

    /**
     * Get saatja.
     *
     * @return the sender value
     */
    public String sender() {
        return this.sender;
    }

    /**
     * Set saatja.
     *
     * @param sender the sender value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withSender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get saatja viit.
     *
     * @return the senderReference value
     */
    public String senderReference() {
        return this.senderReference;
    }

    /**
     * Set saatja viit.
     *
     * @param senderReference the senderReference value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withSenderReference(String senderReference) {
        this.senderReference = senderReference;
        return this;
    }

    /**
     * Get esitamise kuupäev.
     *
     * @return the submittingDate value
     */
    public LocalDate submittingDate() {
        return this.submittingDate;
    }

    /**
     * Set esitamise kuupäev.
     *
     * @param submittingDate the submittingDate value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withSubmittingDate(LocalDate submittingDate) {
        this.submittingDate = submittingDate;
        return this;
    }

    /**
     * Get täitmise kuupäev.
     *
     * @return the complianceDeadline value
     */
    public LocalDate complianceDeadline() {
        return this.complianceDeadline;
    }

    /**
     * Set täitmise kuupäev.
     *
     * @param complianceDeadline the complianceDeadline value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withComplianceDeadline(LocalDate complianceDeadline) {
        this.complianceDeadline = complianceDeadline;
        return this;
    }

    /**
     * Get vastutav komisjon.
     *
     * @return the responsibleCommittee value
     */
    public KastuajagruppBaas responsibleCommittee() {
        return this.responsibleCommittee;
    }

    /**
     * Set vastutav komisjon.
     *
     * @param responsibleCommittee the responsibleCommittee value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withResponsibleCommittee(KastuajagruppBaas responsibleCommittee) {
        this.responsibleCommittee = responsibleCommittee;
        return this;
    }

    /**
     * Get staatused / menetluskäik.
     *
     * @return the statuses value
     */
    public List<KollektiivsePRdumiseStaatus> statuses() {
        return this.statuses;
    }

    /**
     * Set staatused / menetluskäik.
     *
     * @param statuses the statuses value to set
     * @return the KollektiivnePRdumineDokument object itself.
     */
    public KollektiivnePRdumineDokument withStatuses(List<KollektiivsePRdumiseStaatus> statuses) {
        this.statuses = statuses;
        return this;
    }

}

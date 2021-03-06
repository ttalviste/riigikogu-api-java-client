/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import org.joda.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Üksuse päevakord.
 */
public class _ksusePEvakord {
    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * Istungid.
     */
    @JsonProperty(value = "sittings")
    private List<Istung> sittings;

    /**
     * Pealkiri.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Nädala lõppkuupäev.
     */
    @JsonProperty(value = "weekEndDate")
    private LocalDate weekEndDate;

    /**
     * Nädala alguskuupäev.
     */
    @JsonProperty(value = "weekStartDate")
    private LocalDate weekStartDate;

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
     * @return the _ksusePEvakord object itself.
     */
    public _ksusePEvakord with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get istungid.
     *
     * @return the sittings value
     */
    public List<Istung> sittings() {
        return this.sittings;
    }

    /**
     * Set istungid.
     *
     * @param sittings the sittings value to set
     * @return the _ksusePEvakord object itself.
     */
    public _ksusePEvakord withSittings(List<Istung> sittings) {
        this.sittings = sittings;
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
     * @return the _ksusePEvakord object itself.
     */
    public _ksusePEvakord withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get nädala lõppkuupäev.
     *
     * @return the weekEndDate value
     */
    public LocalDate weekEndDate() {
        return this.weekEndDate;
    }

    /**
     * Set nädala lõppkuupäev.
     *
     * @param weekEndDate the weekEndDate value to set
     * @return the _ksusePEvakord object itself.
     */
    public _ksusePEvakord withWeekEndDate(LocalDate weekEndDate) {
        this.weekEndDate = weekEndDate;
        return this;
    }

    /**
     * Get nädala alguskuupäev.
     *
     * @return the weekStartDate value
     */
    public LocalDate weekStartDate() {
        return this.weekStartDate;
    }

    /**
     * Set nädala alguskuupäev.
     *
     * @param weekStartDate the weekStartDate value to set
     * @return the _ksusePEvakord object itself.
     */
    public _ksusePEvakord withWeekStartDate(LocalDate weekStartDate) {
        this.weekStartDate = weekStartDate;
        return this;
    }

}

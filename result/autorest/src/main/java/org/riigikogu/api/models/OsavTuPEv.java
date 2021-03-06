/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import org.joda.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Osavõtu päev.
 */
public class OsavTuPEv {
    /**
     * Kuupäev.
     */
    @JsonProperty(value = "date")
    private LocalDate dateProperty;

    /**
     * Istungid.
     */
    @JsonProperty(value = "sittings")
    private List<TIskoguIstungOsavTt> sittings;

    /**
     * Get kuupäev.
     *
     * @return the dateProperty value
     */
    public LocalDate dateProperty() {
        return this.dateProperty;
    }

    /**
     * Set kuupäev.
     *
     * @param dateProperty the dateProperty value to set
     * @return the OsavTuPEv object itself.
     */
    public OsavTuPEv withDateProperty(LocalDate dateProperty) {
        this.dateProperty = dateProperty;
        return this;
    }

    /**
     * Get istungid.
     *
     * @return the sittings value
     */
    public List<TIskoguIstungOsavTt> sittings() {
        return this.sittings;
    }

    /**
     * Set istungid.
     *
     * @param sittings the sittings value to set
     * @return the OsavTuPEv object itself.
     */
    public OsavTuPEv withSittings(List<TIskoguIstungOsavTt> sittings) {
        this.sittings = sittings;
        return this;
    }

}

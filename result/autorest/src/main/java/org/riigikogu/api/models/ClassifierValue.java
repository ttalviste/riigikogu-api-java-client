/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Klassifikaatori väärtus.
 */
public class ClassifierValue {
    /**
     * Kood.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Väärtus.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get kood.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set kood.
     *
     * @param code the code value to set
     * @return the ClassifierValue object itself.
     */
    public ClassifierValue withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get väärtus.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set väärtus.
     *
     * @param value the value value to set
     * @return the ClassifierValue object itself.
     */
    public ClassifierValue withValue(String value) {
        this.value = value;
        return this;
    }

}

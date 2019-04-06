/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package org.riigikogu.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PagedResources«Toimik (kirjalik küsimus)».
 */
public class PagedResourcesToimikKirjalikKSimus {
    /**
     * The _embedded property.
     */
    @JsonProperty(value = "_embedded")
    private List<ToimikKirjalikKSimus> _embedded;

    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * The page property.
     */
    @JsonProperty(value = "page")
    private PageMetadata page;

    /**
     * Get the _embedded value.
     *
     * @return the _embedded value
     */
    public List<ToimikKirjalikKSimus> _embedded() {
        return this._embedded;
    }

    /**
     * Set the _embedded value.
     *
     * @param _embedded the _embedded value to set
     * @return the PagedResourcesToimikKirjalikKSimus object itself.
     */
    public PagedResourcesToimikKirjalikKSimus with_embedded(List<ToimikKirjalikKSimus> _embedded) {
        this._embedded = _embedded;
        return this;
    }

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
     * @return the PagedResourcesToimikKirjalikKSimus object itself.
     */
    public PagedResourcesToimikKirjalikKSimus with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get the page value.
     *
     * @return the page value
     */
    public PageMetadata page() {
        return this.page;
    }

    /**
     * Set the page value.
     *
     * @param page the page value to set
     * @return the PagedResourcesToimikKirjalikKSimus object itself.
     */
    public PagedResourcesToimikKirjalikKSimus withPage(PageMetadata page) {
        this.page = page;
        return this;
    }

}

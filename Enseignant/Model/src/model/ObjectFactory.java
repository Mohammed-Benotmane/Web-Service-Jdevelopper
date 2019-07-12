
package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the model package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEnseignantFindAll_QNAME = new QName("http://model/", "getEnseignantFindAll");
    private final static QName _GetEnseignantFindAllResponse_QNAME =
        new QName("http://model/", "getEnseignantFindAllResponse");
    private final static QName _GetEnseignantFindEnseignantByID_QNAME =
        new QName("http://model/", "getEnseignantFindEnseignantByID");
    private final static QName _GetEnseignantFindEnseignantByIDResponse_QNAME =
        new QName("http://model/", "getEnseignantFindEnseignantByIDResponse");
    private final static QName _QueryByRange_QNAME = new QName("http://model/", "queryByRange");
    private final static QName _QueryByRangeResponse_QNAME = new QName("http://model/", "queryByRangeResponse");
    private final static QName _RemoveEnseignant_QNAME = new QName("http://model/", "removeEnseignant");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEnseignantFindAll }
     *
     */
    public GetEnseignantFindAll createGetEnseignantFindAll() {
        return new GetEnseignantFindAll();
    }

    /**
     * Create an instance of {@link GetEnseignantFindAllResponse }
     *
     */
    public GetEnseignantFindAllResponse createGetEnseignantFindAllResponse() {
        return new GetEnseignantFindAllResponse();
    }

    /**
     * Create an instance of {@link GetEnseignantFindEnseignantByID }
     *
     */
    public GetEnseignantFindEnseignantByID createGetEnseignantFindEnseignantByID() {
        return new GetEnseignantFindEnseignantByID();
    }

    /**
     * Create an instance of {@link GetEnseignantFindEnseignantByIDResponse }
     *
     */
    public GetEnseignantFindEnseignantByIDResponse createGetEnseignantFindEnseignantByIDResponse() {
        return new GetEnseignantFindEnseignantByIDResponse();
    }

    /**
     * Create an instance of {@link QueryByRange }
     *
     */
    public QueryByRange createQueryByRange() {
        return new QueryByRange();
    }

    /**
     * Create an instance of {@link QueryByRangeResponse }
     *
     */
    public QueryByRangeResponse createQueryByRangeResponse() {
        return new QueryByRangeResponse();
    }

    /**
     * Create an instance of {@link RemoveEnseignant }
     *
     */
    public RemoveEnseignant createRemoveEnseignant() {
        return new RemoveEnseignant();
    }

    /**
     * Create an instance of {@link Enseignant }
     *
     */
    public Enseignant createEnseignant() {
        return new Enseignant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnseignantFindAll }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnseignantFindAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://model/", name = "getEnseignantFindAll")
    public JAXBElement<GetEnseignantFindAll> createGetEnseignantFindAll(GetEnseignantFindAll value) {
        return new JAXBElement<GetEnseignantFindAll>(_GetEnseignantFindAll_QNAME, GetEnseignantFindAll.class, null,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnseignantFindAllResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnseignantFindAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://model/", name = "getEnseignantFindAllResponse")
    public JAXBElement<GetEnseignantFindAllResponse> createGetEnseignantFindAllResponse(GetEnseignantFindAllResponse value) {
        return new JAXBElement<GetEnseignantFindAllResponse>(_GetEnseignantFindAllResponse_QNAME,
                                                             GetEnseignantFindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnseignantFindEnseignantByID }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnseignantFindEnseignantByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://model/", name = "getEnseignantFindEnseignantByID")
    public JAXBElement<GetEnseignantFindEnseignantByID> createGetEnseignantFindEnseignantByID(GetEnseignantFindEnseignantByID value) {
        return new JAXBElement<GetEnseignantFindEnseignantByID>(_GetEnseignantFindEnseignantByID_QNAME,
                                                                GetEnseignantFindEnseignantByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnseignantFindEnseignantByIDResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnseignantFindEnseignantByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://model/", name = "getEnseignantFindEnseignantByIDResponse")
    public JAXBElement<GetEnseignantFindEnseignantByIDResponse> createGetEnseignantFindEnseignantByIDResponse(GetEnseignantFindEnseignantByIDResponse value) {
        return new JAXBElement<GetEnseignantFindEnseignantByIDResponse>(_GetEnseignantFindEnseignantByIDResponse_QNAME,
                                                                        GetEnseignantFindEnseignantByIDResponse.class,
                                                                        null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByRange }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryByRange }{@code >}
     */
    @XmlElementDecl(namespace = "http://model/", name = "queryByRange")
    public JAXBElement<QueryByRange> createQueryByRange(QueryByRange value) {
        return new JAXBElement<QueryByRange>(_QueryByRange_QNAME, QueryByRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByRangeResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryByRangeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://model/", name = "queryByRangeResponse")
    public JAXBElement<QueryByRangeResponse> createQueryByRangeResponse(QueryByRangeResponse value) {
        return new JAXBElement<QueryByRangeResponse>(_QueryByRangeResponse_QNAME, QueryByRangeResponse.class, null,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEnseignant }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveEnseignant }{@code >}
     */
    @XmlElementDecl(namespace = "http://model/", name = "removeEnseignant")
    public JAXBElement<RemoveEnseignant> createRemoveEnseignant(RemoveEnseignant value) {
        return new JAXBElement<RemoveEnseignant>(_RemoveEnseignant_QNAME, RemoveEnseignant.class, null, value);
    }

}

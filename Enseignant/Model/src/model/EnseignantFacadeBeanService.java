
package model;

import java.util.List;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebService(name = "EnseignantFacadeBeanService", targetNamespace = "http://model/")
@XmlSeeAlso({ ObjectFactory.class })
public interface EnseignantFacadeBeanService {


    /**
     *
     * @param arg0
     * @return
     *     returns java.util.List<model.Enseignant>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEnseignantFindEnseignantByID", targetNamespace = "http://model/",
                    className = "model.GetEnseignantFindEnseignantByID")
    @ResponseWrapper(localName = "getEnseignantFindEnseignantByIDResponse", targetNamespace = "http://model/",
                     className = "model.GetEnseignantFindEnseignantByIDResponse")
    @Action(input = "http://model/EnseignantFacadeBeanService/getEnseignantFindEnseignantByIDRequest",
            output = "http://model/EnseignantFacadeBeanService/getEnseignantFindEnseignantByIDResponse")
    public List<Enseignant> getEnseignantFindEnseignantByID(@WebParam(name = "arg0", targetNamespace = "") String arg0);

    /**
     *
     * @return
     *     returns java.util.List<model.Enseignant>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEnseignantFindAll", targetNamespace = "http://model/",
                    className = "model.GetEnseignantFindAll")
    @ResponseWrapper(localName = "getEnseignantFindAllResponse", targetNamespace = "http://model/",
                     className = "model.GetEnseignantFindAllResponse")
    @Action(input = "http://model/EnseignantFacadeBeanService/getEnseignantFindAllRequest",
            output = "http://model/EnseignantFacadeBeanService/getEnseignantFindAllResponse")
    public List<Enseignant> getEnseignantFindAll();

    /**
     *
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Object
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryByRange", targetNamespace = "http://model/", className = "model.QueryByRange")
    @ResponseWrapper(localName = "queryByRangeResponse", targetNamespace = "http://model/",
                     className = "model.QueryByRangeResponse")
    @Action(input = "http://model/EnseignantFacadeBeanService/queryByRangeRequest",
            output = "http://model/EnseignantFacadeBeanService/queryByRangeResponse")
    public Object queryByRange(@WebParam(name = "arg0", targetNamespace = "") String arg0,
                               @WebParam(name = "arg1", targetNamespace = "") int arg1,
                               @WebParam(name = "arg2", targetNamespace = "") int arg2);

    /**
     *
     * @param arg0
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "removeEnseignant", targetNamespace = "http://model/",
                    className = "model.RemoveEnseignant")
    @Action(input = "http://model/EnseignantFacadeBeanService/removeEnseignant")
    public void removeEnseignant(@WebParam(name = "arg0", targetNamespace = "") Enseignant arg0);

}

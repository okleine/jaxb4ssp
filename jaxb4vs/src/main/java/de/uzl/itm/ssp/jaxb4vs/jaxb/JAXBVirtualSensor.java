//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.24 um 11:11:31 PM CEST 
//


package de.uzl.itm.ssp.jaxb4vs.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VirtualSensorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VirtualSensorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sensor-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sensor-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feature-of-interest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observed-property" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sparql-query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSensorType", propOrder = {
    "sensorName",
    "sensorType",
    "featureOfInterest",
    "observedProperty",
    "sparqlQuery"
})
public class JAXBVirtualSensor {

    @XmlElement(name = "sensor-name", required = true)
    protected String sensorName;
    @XmlElement(name = "sensor-type", required = true)
    protected String sensorType;
    @XmlElement(name = "feature-of-interest", required = true)
    protected String featureOfInterest;
    @XmlElement(name = "observed-property", required = true)
    protected String observedProperty;
    @XmlElement(name = "sparql-query", required = true)
    protected String sparqlQuery;

    /**
     * Ruft den Wert der sensorName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorName() {
        return sensorName;
    }

    /**
     * Legt den Wert der sensorName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorName(String value) {
        this.sensorName = value;
    }

    /**
     * Ruft den Wert der sensorType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     * Legt den Wert der sensorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorType(String value) {
        this.sensorType = value;
    }

    /**
     * Ruft den Wert der featureOfInterest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureOfInterest() {
        return featureOfInterest;
    }

    /**
     * Legt den Wert der featureOfInterest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureOfInterest(String value) {
        this.featureOfInterest = value;
    }

    /**
     * Ruft den Wert der observedProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservedProperty() {
        return observedProperty;
    }

    /**
     * Legt den Wert der observedProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservedProperty(String value) {
        this.observedProperty = value;
    }

    /**
     * Ruft den Wert der sparqlQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSparqlQuery() {
        return sparqlQuery;
    }

    /**
     * Legt den Wert der sparqlQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSparqlQuery(String value) {
        this.sparqlQuery = value;
    }

}

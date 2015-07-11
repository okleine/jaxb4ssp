//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.11 um 01:38:55 PM CEST 
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
 *         &lt;element name="graph" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statements" type="{http://itm.uzl.de/ssp/jaxb4vs/jaxb}StatementListType"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "graph",
    "statementList",
    "query"
})
public class VirtualSensor {

    @XmlElement(required = true)
    protected String graph;
    @XmlElement(name = "statements", required = true)
    protected StatementList statementList;
    @XmlElement(required = true)
    protected String query;

    /**
     * Ruft den Wert der graph-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraph() {
        return graph;
    }

    /**
     * Legt den Wert der graph-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraph(String value) {
        this.graph = value;
    }

    /**
     * Ruft den Wert der statementList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getStatementList() {
        return statementList;
    }

    /**
     * Legt den Wert der statementList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setStatementList(StatementList value) {
        this.statementList = value;
    }

    /**
     * Ruft den Wert der query-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Legt den Wert der query-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

}

//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.11 um 01:38:55 PM CEST 
//


package de.uzl.itm.ssp.jaxb4vs.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.uzl.itm.ssp.jaxb4vs.jaxb package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.uzl.itm.ssp.jaxb4vs.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VirtualSensorList }
     * 
     */
    public VirtualSensorList createVirtualSensorList() {
        return new VirtualSensorList();
    }

    /**
     * Create an instance of {@link VirtualSensor }
     * 
     */
    public VirtualSensor createVirtualSensor() {
        return new VirtualSensor();
    }

    /**
     * Create an instance of {@link Statement }
     * 
     */
    public Statement createStatement() {
        return new Statement();
    }

    /**
     * Create an instance of {@link StatementList }
     * 
     */
    public StatementList createStatementList() {
        return new StatementList();
    }

}

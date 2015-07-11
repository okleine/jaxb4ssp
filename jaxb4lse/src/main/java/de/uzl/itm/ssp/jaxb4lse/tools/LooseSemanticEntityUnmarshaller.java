package de.uzl.itm.ssp.jaxb4lse.tools;

import de.uzl.itm.ssp.jaxb4lse.jaxb.ObjectFactory;
import de.uzl.itm.ssp.jaxb4lse.jaxb.SemanticEntityList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import java.io.InputStream;

/**
 * Unmarshaller for "loose" Semantic Entities, i.e. those "living" in the SSPs cache without any data origin
 *
 * @author Oliver Kleine
 */
public class LooseSemanticEntityUnmarshaller {

    private static Logger log = LoggerFactory.getLogger(LooseSemanticEntityUnmarshaller.class.getName());
    private static Unmarshaller unmarshaller;

    static{
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            unmarshaller = jaxbContext.createUnmarshaller();
        }
        catch(Exception ex){
            log.error("This should never happen!", ex);
        }
    }

    public static SemanticEntityList unmarshal(InputStream xmlStream) throws Exception{

        //create xml event reader for input stream
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(xmlStream);

        return unmarshaller.unmarshal(xmlEventReader, SemanticEntityList.class).getValue();
    }
}

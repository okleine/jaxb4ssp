package de.uzl.itm.ssp.jaxb4lse.tools;

import de.uzl.itm.ssp.jaxb4lse.jaxb.ObjectFactory;
import de.uzl.itm.ssp.jaxb4lse.jaxb.SemanticEntityList;
import javanet.staxutils.IndentingXMLEventWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import java.io.OutputStream;

/**
 * Marshaller for "loose" Semantic Entities, i.e. those "living" in the SSPs cache without any data origin
 *
 * @author Oliver Kleine
 */
public class LooseSemanticEntityMarshaller {

    private static Logger log = LoggerFactory.getLogger(LooseSemanticEntityMarshaller.class.getName());

    private static Marshaller marshaller;
    static{
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

            marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        }
        catch(Exception ex){
            log.error("This should never happen!", ex);
        }
    }

    public static void marshal(SemanticEntityList virtualSensors, OutputStream outputStream)
            throws Exception{

        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        IndentingXMLEventWriter xmlEventWriter =
                new IndentingXMLEventWriter(xmlOutputFactory.createXMLEventWriter(outputStream));

        marshaller.marshal(virtualSensors, xmlEventWriter);

    }
}

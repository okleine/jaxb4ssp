package de.uzl.itm.ssp.jaxb4vs.tools;

import de.uzl.itm.ssp.jaxb4vs.jaxb.ObjectFactory;
import de.uzl.itm.ssp.jaxb4vs.jaxb.VirtualSensorList;
import javanet.staxutils.IndentingXMLEventWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import java.io.OutputStream;

/**
 * Created by olli on 14.06.14.
 */
public class VirtualSensorsMarshaller {

    private static Logger log = LoggerFactory.getLogger(VirtualSensorsMarshaller.class.getName());

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

    public static void marshal(VirtualSensorList virtualSensors, OutputStream outputStream)
            throws Exception {

        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        IndentingXMLEventWriter xmlEventWriter =
                new IndentingXMLEventWriter(xmlOutputFactory.createXMLEventWriter(outputStream));

        marshaller.marshal(virtualSensors, xmlEventWriter);

    }
}

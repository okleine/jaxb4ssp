package de.uzl.itm.ssp.jaxb4vs.tools;

import de.uzl.itm.ssp.jaxb4vs.jaxb.ObjectFactory;
import de.uzl.itm.ssp.jaxb4vs.jaxb.VirtualSensorList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import java.io.InputStream;

/**
 * Created by olli on 14.06.14.
 */
public class VirtualSensorsUnmarshaller {

    private static Logger log = LoggerFactory.getLogger(VirtualSensorsUnmarshaller.class.getName());
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

    public static VirtualSensorList unmarshal(InputStream xmlStream) throws Exception {

        //create xml event reader for input stream
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(xmlStream);

        return unmarshaller.unmarshal(xmlEventReader, VirtualSensorList.class).getValue();
    }
}

package de.uzl.itm.ssp.jaxb4vs.tools;

import de.uzl.itm.ssp.jaxb4vs.jaxb.Statement;
import de.uzl.itm.ssp.jaxb4vs.jaxb.StatementList;
import de.uzl.itm.ssp.jaxb4vs.jaxb.VirtualSensor;
import de.uzl.itm.ssp.jaxb4vs.jaxb.VirtualSensorList;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by olli on 14.06.14.
 */
public class Tests {

    private static final int NUMBER_OF_ENTITIES = 1;
    private static final int MAX_NUMBER_OF_STATEMENTS = 3;

    private static VirtualSensorList expected;
    private static File xmlFile;
    private static VirtualSensorList actual;

    @BeforeClass
    public static void initialize() throws Exception{
        createSemanticEntityList();
        marshal();
        unmarshal();
    }

    private static String createResourceName(String prefix, int i, int j){
        return "http://example.org/#" + prefix + "-" + String.format("%02d", i+1) + "-" + String.format("%02d", j+1);
    }

    private static void createSemanticEntityList(){
        expected = new VirtualSensorList();

        //Virtual Sensors
        for(int i = 0; i < NUMBER_OF_ENTITIES; i++){
            VirtualSensor virtualSensor = new VirtualSensor();

            String graph = "http://example.org/#se-graph-" + String.format("%02d", i+1);
            virtualSensor.setGraph(graph);

            StatementList statements = new StatementList();
            for(int j = 0; j < MAX_NUMBER_OF_STATEMENTS; j++){
                Statement statement = new Statement();
                statement.setSubject(createResourceName("vs-sub", i, j));
                statement.setPredicate(createResourceName("vs-pre", i, j));
                statement.setObject(createResourceName("vs-obj", i, j));

                statements.getStatements().add(statement);
            }

            virtualSensor.setStatementList(statements);

            virtualSensor.setQuery("SELECT ?s WHERE { GRAPH <" + graph + "> { ?s ?p ?o }}");
            expected.getVirtualSensors().add(virtualSensor);
        }
    }


    private static void marshal() throws Exception{
        xmlFile = File.createTempFile("slse-test", ".xml");
        FileOutputStream outputStream = new FileOutputStream(xmlFile);
        VirtualSensorsMarshaller.marshal(expected, outputStream);

        BufferedReader reader = new BufferedReader(new FileReader(xmlFile));
        String line = reader.readLine();
        while(line != null){
            System.out.println(line);
            line = reader.readLine();
        }
        xmlFile.deleteOnExit();
    }


    private static void unmarshal() throws Exception{
        FileInputStream inputStream = new FileInputStream(xmlFile);
        actual = VirtualSensorsUnmarshaller.unmarshal(inputStream);
    }

    @Test
    public void testCount(){
        assertTrue(expected.getVirtualSensors().size() == NUMBER_OF_ENTITIES * 2);
        assertTrue(actual.getVirtualSensors().size() == NUMBER_OF_ENTITIES * 2);
    }

    @Test
    public void testEqualty(){
        for(int i = 0; i < NUMBER_OF_ENTITIES; i++){
//            SemanticEntity expectedEntity = (SemanticEntity) expected.getSemanticEntities().get(i);
//            SemanticEntity actualEntity = actual.getEntities().get(i);
//
//            assertTrue(expectedEntity.getUriPath().getValue().equals(actualEntity.getUriPath().getValue()));
//            assertTrue(expectedEntity.getSparqlQuery().getValue().equals(actualEntity.getSparqlQuery().getValue()));
        }
    }


}

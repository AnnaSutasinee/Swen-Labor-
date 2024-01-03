package mock;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestPatient {

    @Test 
    public void PatientNameIstLeer() {
        try {
            Patient patient = new Patient(1234, "");
            fail();
        } catch(Exception e) {
        assertEquals("Name darf nicht leer sein", e.getMessage());
        }

    }
}

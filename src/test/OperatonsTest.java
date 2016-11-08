import org.junit.Test;
import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;
import javax.ws.rs.core.Response;


import static org.junit.Assert.*;

/**
 * Created by Wael on 11/7/16.
 */
public class OperatonsTest {
    @Test
    public void add() throws Exception {

    }

    private Operations operations;

    @Before
    public void setup() {
        operations = new Operations();
    }

    @Test
    public void shouldSumGivenNumbers() {
        Response addResponse = operations.add(new Input(1, 2, 3));
        Truth.assertThat(addResponse.getEntity()).isEqualTo(6);
    }

    @Test
    public void shouldReturnErrorCodeIFNoNumbersProvided() {
        Response addResponse = operations.add(new Input());
        Truth.assertThat(addResponse.getStatus()).isEqualTo(Response.Status.BAD_REQUEST.getStatusCode());
    }

}


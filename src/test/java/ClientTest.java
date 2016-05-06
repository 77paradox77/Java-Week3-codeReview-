import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ClientTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();



  @Test
  public void client_instantiatesCorrectly_True() {
    Client testClient = new Client("Mary", "Smith", 1);
    assertEquals(true, testClient instanceof Client);
  }

  @Test
  public void getName_clientInstantiatesWithName_String() {
    Client testClient = new Client("Mary", "Smith", 1);
    assertEquals("Mary", testClient.getName());
  }

  @Test
  public void all_emptyAtFirst() {
    assertEquals(Client.all().size(), 0);
  }

  @Test
  public void equals_returnsTrueifNameIsTheSame() {
    Client firstClient = new Client("Simon", "Cowell", 1);
    Client secondClient = new Client("Simon", "Cowell", 1);
    assertTrue(firstClient.equals(secondClient));
  }
 // RETRIEVING THE ID TEST

  @Test
  public void save_assignsIdToObject() {
    Client testClient = new Client("Kelvin", "Cleif", 1);
    testClient.save();
    Client savedClient = Client.all()
  }
}

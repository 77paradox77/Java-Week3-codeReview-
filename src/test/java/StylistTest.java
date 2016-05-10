// import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class StylistTest {

// WILL NEED TO UNCOMMENT WHEN REPLACING BEFORE AND AFTER
  @Rule
  public DatabaseRule database = new DatabaseRule();

//   @Before
//   public void setUp() {
//     DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/hair_salon_test", null, null);
//   }
//
// @After
// public void tearDown() {
//   try(Connection con = DB.sql2o.open()) {
//     String deleteclientsQuery = "DELETE FROM clients *;";
//     String deleteStylistsQuery = "DELETE FROM stylists *;";
//     con.createQuery(deleteClientsQuery).executeUpdate();
//     con.createQuery(deleteStylistsQuery).executeUpdate();
//   }
// }

@Test
public void Stylist_instantiatesCorrectly_True() {
  Stylist testStylist = new Stylist("Niki");
  assertEquals(true, testStylist instanceof Stylist);
}

@Test
public void getStylistName_stylistInstantiatesWithStylistName_String() {
  Stylist testStylist = new Stylist("Niki");
  assertEquals("Niki", testStylist.getName());
}

@Test
public void all_emptyAtFirst() {
  assertEquals(Stylist.all().size(), 0);
}

@Test
public void equals_returnsTrueIfTypesAreTheSame() {
  Stylist firstStylist = new Stylist("Tyrone");
  Stylist secondStylist = new Stylist("Tyrone");
  assertTrue(firstStylist.equals(secondStylist));
}

@Test
public void save_returnsTrueIfDescriptionsAreTheSame() {
  Stylist myStylist = new Stylist("Melony");
  myStylist.save();
  assertTrue(Stylist.all().get(0).equals(myStylist));
}

// GET ID TESTING
@Test
public void save_assignsIdToObject() {
  Stylist myStylist = new Stylist("Tyrone");
  myStylist.save();
  Stylist savedStylist = Stylist.all().get(0);
  assertEquals(myStylist.getId(), savedStylist.getId());
}

// FIND Stylist IN DATABASE
@Test
public void find_findsStylistInDatabase_true() {
  Stylist myStylist = new Stylist("Melony");
  myStylist.save();
  Stylist savedStylist = Stylist.find(myStylist.getId());
  assertTrue(myStylist.equals(savedStylist));
}

 // @Test
 // public void getClient_retrievesAllClientsFromDatabase_ClientsList() {
 //   Stylist myStylist = new Stylist("Barth");
 //   myStylist.save();
 //   Client firstClient = new Client("Tiffany Winters", firstClient.getId());
 //   firstClient.save();
 //   Client secondClient = new Client("Bobby Fischer", secondClient.getId());
 //   secondClient.save();
 //   Client[] clients = new Client[] { firstClient, secondClient };
 //   assertTrue(firstClient.getStylistId().contains(firstClient, secondClient));
 // }
}

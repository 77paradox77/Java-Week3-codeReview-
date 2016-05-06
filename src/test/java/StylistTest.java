// import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class StylistTest {

// WILL NEED TO UNCOMMENT WHEN REPLACING BEFORE AND AFTER
  // @Rule
  // public DatabaseRule database = new DatabaseRule();

@Test
public void Stylist_instantiatesCorrectly_True() {
  Stylist testStylist = new Stylist("Niki");
  assertEquals(true, testStylist instanceof Stylist);
}

@Test
public void getStylistName_stylistInstantiatesWithStylistName_String() {
  Stylist testStylist = new Stylist("Niki");
  assertEquals("Niki", testStylist.getStylistName());
}

@Test
public void all_emptyAtFirst() {
  assertEquals(Stylist.all().size(), 0);
}
}

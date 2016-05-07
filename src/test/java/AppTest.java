import java.util.ArrayList;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Rule
  public DatabaseRule database = new DatabaseRule();
  // @Before
  // public void setUp() {
  //   DB.sql2o = new sql2o("jdbc:postgresql://localhost:5432/hair_salon_test", null, null);
  // }
  //
  // @After
  // public void tearDown() {
  //   try(Connection con = DB.spq2o.open()) {
  //     String deleteClientsQuery = "DELETE FROM clients *;";
  //     String deleteStylistsQuery = "DELETE FROM stylists *;";
  //     con.createQuery(deleteClientsQuery).executeUpdate();
  //     con.createQuery(deleteStylistsQuery).executeUpdate();
  //   }
  // }

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Hair Salon");
 }

  // @Test
  // public void stylistIsCreatedTest() {
  //   goTo("http://localhost:4567/");
  //   click("a", withText("Add a new Stylist"));
  //   fill("#name").with("Bethany");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Your new Hair Styler has been saved.");
  // }

  // @Test
  // public void clientsIsDisplayedTest() {
  //   Stylist myStylist = new Stylist("Niki");
  //   myStylist.save();
  //   String stylistPath = String.format("http://localhost:4567/%d", myStylist.getId());
  //   goTo(stylistPath);
  //   assertThat(pageSource()).contains("Household chores");
  // }

}

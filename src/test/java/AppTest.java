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

  @Test
    public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Hair Salon Database");
      assertThat(pageSource()).contains("Add a New Stylist");
      assertThat(pageSource()).contains("View Stylist List");
    }

    @Test
    public void stylistIsCreatedTest() {
      goTo("http://localhost:4567/");
      click("a", withText("Add a New Stylist"));
      fill("#input-stylist-name").with("Cherie");
      submit(".btn");
      assertThat(pageSource()).contains("Your stylist has been saved.");
    }

    @Test
    public void stylistIsDisplayedTest() {
      goTo("http://localhost:4567/stylists/new");
      fill("#input-stylist-name").with("Cherie");
      submit(".btn");
      click("a", withText("View Stylists"));
      assertThat(pageSource()).contains("Cherie");
    }

    @Test
    public void stylistShowPageDisplaysStylistName() {
      goTo("http://localhost:4567/stylists/new");
      fill("#input-stylist-name").with("Cherie");
      submit(".btn");
      click("a", withText("View Stylists"));
      click("a", withText("Cherie"));
      assertThat(pageSource()).contains("Cherie");
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

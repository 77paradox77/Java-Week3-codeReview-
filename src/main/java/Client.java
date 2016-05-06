import java.util.List;
import org.sql2o.*;
import java.util.Arrays;

public class Client {
  private int id;
  private String name;
  private String stylist_id;

  public Client(String name, int stylist_id) {
    this.name = name;
    this.stylist_id;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public int getStylistId() {
    return stylist_id;
  }

  public static List<Client> all() {
    String sql = "SELECT id, name FROM clients";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).executeAndFetch(Client.class);
    }
  }

  @Override
  public boolean equals(Object otherClient) {
    if(!(otherClient instanceof Client)) {
      return false;
    } else {
      Client newClient = (Client) otherClient;
      return this.getName().equals(newClient.getName()) &&
        this.getStylistId().equals(newClient.getStylistId());
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO clients(name, stylist_id) VALUES (:name, :stylist_id)";
      this.id = (int) con.createQuery(sql, true)
      .addParameter("name", this.name)
      .addParameter("stylist", this.stylist_id)
      .executeUpdate()
      .getKey();
    }
  }

  public static Client find(int id) {
   try(Connection con = DB.sql2o.open()) {
     String sql = "SELECT * FROM clients where id=:id";
     Client client = con.createQuery(sql)
     .addParameter("id", id)
     .executeAndFetchFirst(Client.class);
    return client;
   }
 }
}

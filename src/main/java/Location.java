import java.net.URL;

public class Location {
  private String name;
  private URL url;

  public Location() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public URL getUrl() {
    return url;
  }

  public void setUrl(URL url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Location{" +
        "name='" + name + '\'' +
        ", url=" + url +
        '}';
  }
}

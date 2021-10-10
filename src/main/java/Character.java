import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class Character {
  private int id;
  private String name;
  private String status;
  private String species;
  private String type;
  private String gender;
  private Location origin;
  private Location location;
  private URL image;
  private URL url;
  private String created;

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  private List<String> episode;

  public Character() {
  }

  public Character(int id, String name, String status, String species, String type,
                   String gender, Location originLocation, Location lastKnownLocation,
                   URL image, List<String> episodesUrl) {
    this.id = id;
    this.name = name;
    this.status = status;
    this.species = species;
    this.type = type;
    this.gender = gender;
    this.origin = originLocation;
    this.location = lastKnownLocation;
    this.image = image;
    this.episode = episodesUrl;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getStatus() {
    return status;
  }

  public String getSpecies() {
    return species;
  }

  public String getType() {
    return type;
  }

  public String getGender() {
    return gender;
  }

  public Location getOrigin() {
    return origin;
  }

  public Location getLocation() {
    return location;
  }

  public URL getImage() {
    return image;
  }

  public List<String> getEpisode() {
    return episode;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setOrigin(Location origin) {
    this.origin = origin;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public void setImage(URL image) {
    this.image = image;
  }

  public void setEpisode(List<String> episode) {
    this.episode = episode;
  }

  public URL getUrl() {
    return url;
  }

  public void setUrl(URL url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Character{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", status='" + status + '\'' +
        ", species='" + species + '\'' +
        ", type='" + type + '\'' +
        ", gender='" + gender + '\'' +
        ", origin=" + origin +
        ", location=" + location +
        ", image=" + image +
        ", url=" + url +
        ", created='" + created + '\'' +
        ", episode=" + episode.stream().limit(5).collect(Collectors.toList()) +
        '}';
  }
}
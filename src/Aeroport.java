import java.util.HashSet;
import java.util.Set;

public class Aeroport {
  private String iata;
  private double latitude;
  private double longitude;
  private Set<Vol> aeroportsSortants = new HashSet<>();

  public Aeroport() {}

  public Aeroport(String iata, double lat, double lon) {
    this.iata = iata;
    this.latitude = lat;
    this.longitude = lon;
  }


  public String getIata() {
    return iata;
  }

  public double getLatitude() {
    return latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setIata(String iata) {
    this.iata = iata;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  @Override
  public String toString() {
    return "Aeroport [iata=" + iata + ", lat=" + latitude + ", lon=" + longitude + "]";
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((iata == null) ? 0 : iata.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Aeroport other = (Aeroport) obj;
    if (iata == null) {
      if (other.iata != null)
        return false;
    } else if (!iata.equals(other.iata))
      return false;
    return true;
  }
}

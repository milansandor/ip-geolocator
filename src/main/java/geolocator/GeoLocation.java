package geolocator;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@lombok.Data
class GeoLocation {

    private String as;
    private String city;
    private String country;
    private String countryCode;
    private String isp;
    private double lat;
    private double lon;
    private String org;
    private String query;
    private String region;
    private String regionName;
    private String timezone;
    private String zip;

}

import java.util.Objects;

public class Address {

    protected String country;
    protected String city;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCountry() {

        return country;

    }

    public String getCity() {

        return city;

    }

    @Override
    public int hashCode(){
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        Address o = (Address) obj;
        return country.equals(o.country) && city.equals(o.city);
    }








}

import java.util.List;

public class Destination {
    private String country;
    private String city;
    private String weather;
    private String budget;
    private List<String> activities;

    public Destination(String country, String city, String weather, String budget, List<String> activities) {
        this.country = country;
        this.city = city;
        this.weather = weather;
        this.budget = budget;
        this.activities = activities;
    }

    public String getCountry() { 
        return country; 
    }
    public String getCity() { 
        return city; 
    }
    public String getWeather() { 
        return weather; 
    }
    public String getBudget() { 
        return budget; 
    }
    public List<String> getActivities() { 
        return activities; 
    }


    public String toString() {
        return "Destination: " + city + ", " + country + "\nWeather: " + weather + "\nBudget: " + budget + "\nActivities: " + activities;
    }
}

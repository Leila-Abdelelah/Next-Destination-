import java.util.List;

public class Destination {
    private String country;
    private String city;
    private String weather;
    private String budget;
    private List<String> activities;
    private String friendsAlone;

    public Destination(String country, String city, String weather, String budget, List<String> activities, String friendsAlone) {
        this.country = country;
        this.city = city;
        this.weather = weather;
        this.budget = budget;
        this.activities = activities;
        this.friendsAlone = friendsAlone;
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

    public String getFriendsAlone() { 
        return friendsAlone; 
    }

    public String toString() {
        return "Destination: " + city + ", " + country + "\nWeather: " + weather + "\nBudget: " + budget + "\nActivities: " + activities;
    }
}

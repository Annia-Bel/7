
public void setTimezone(Integer timezone) {
        this.timezone = timezone;
        }

public Long getSunrise() {
        return sunrise;
        }

public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
        }

public Long getSunset() {
        return sunset;
        }

public void setSunset(Long sunset) {
        this.sunset = sunset;
        }

@Override
public String toString() {
        return "город " + name + "(" + country+")";
        }

package ixigo.example.apple.ixigohack.objects.placePicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 08/04/17.
 */

public class PlacePickerResponse implements Parcelable {

    @SerializedName("data")
    private Data data;

    protected PlacePickerResponse(Parcel in) {
        data = in.readParcelable(Data.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(data, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PlacePickerResponse> CREATOR = new Creator<PlacePickerResponse>() {
        @Override
        public PlacePickerResponse createFromParcel(Parcel in) {
            return new PlacePickerResponse(in);
        }

        @Override
        public PlacePickerResponse[] newArray(int size) {
            return new PlacePickerResponse[size];
        }
    };

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class PlacesToVisit implements Parcelable, Comparable<PlacesToVisit> {
        @SerializedName("address")
        private String address;
        @SerializedName("categoryNames")
        private List<String> categoryNames;
        @SerializedName("cityName")
        private String cityName;
        @SerializedName("countryName")
        private String countryName;
        @SerializedName("description")
        private String description;
        @SerializedName("howToReach")
        private String howToReach;
        @SerializedName("cityId")
        private String cityId;
        @SerializedName("xid")
        private int xid;
        @SerializedName("keyImageUrl")
        private String keyImageUrl;
        @SerializedName("whyToVisit")
        private String whyToVisit;
        @SerializedName("latitude")
        private double latitude;
        @SerializedName("longitude")
        private double longitude;
        @SerializedName("name")
        private String name;
        @SerializedName("stateName")
        private String stateName;
        @SerializedName("shortDescription")
        private String shortDescription;
        @SerializedName("id")
        private String id;

        Integer activityStartHour, activityStartMinute;
        Integer activityEndHour, activityEndMinute;

        protected PlacesToVisit(Parcel in) {
            address = in.readString();
            categoryNames = in.createStringArrayList();
            cityName = in.readString();
            countryName = in.readString();
            description = in.readString();
            howToReach = in.readString();
            cityId = in.readString();
            xid = in.readInt();
            keyImageUrl = in.readString();
            whyToVisit = in.readString();
            latitude = in.readDouble();
            longitude = in.readDouble();
            name = in.readString();
            stateName = in.readString();
            shortDescription = in.readString();
            id = in.readString();
            activityStartHour = (Integer) in.readValue(Integer.class.getClassLoader());
            activityStartMinute = (Integer) in.readValue(Integer.class.getClassLoader());
            activityEndHour = (Integer) in.readValue(Integer.class.getClassLoader());
            activityEndMinute = (Integer) in.readValue(Integer.class.getClassLoader());
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(address);
            dest.writeStringList(categoryNames);
            dest.writeString(cityName);
            dest.writeString(countryName);
            dest.writeString(description);
            dest.writeString(howToReach);
            dest.writeString(cityId);
            dest.writeInt(xid);
            dest.writeString(keyImageUrl);
            dest.writeString(whyToVisit);
            dest.writeDouble(latitude);
            dest.writeDouble(longitude);
            dest.writeString(name);
            dest.writeString(stateName);
            dest.writeString(shortDescription);
            dest.writeString(id);
            dest.writeValue(activityStartHour);
            dest.writeValue(activityStartMinute);
            dest.writeValue(activityEndHour);
            dest.writeValue(activityEndMinute);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<PlacesToVisit> CREATOR = new Creator<PlacesToVisit>() {
            @Override
            public PlacesToVisit createFromParcel(Parcel in) {
                return new PlacesToVisit(in);
            }

            @Override
            public PlacesToVisit[] newArray(int size) {
                return new PlacesToVisit[size];
            }
        };

        public Integer getActivityStartHour() {
            return activityStartHour;
        }

        public void setActivityStartHour(Integer activityStartHour) {
            this.activityStartHour = activityStartHour;
        }

        public Integer getActivityStartMinute() {
            return activityStartMinute;
        }

        public void setActivityStartMinute(Integer activityStartMinute) {
            this.activityStartMinute = activityStartMinute;
        }

        public Integer getActivityEndHour() {
            return activityEndHour;
        }

        public void setActivityEndHour(Integer activityEndHour) {
            this.activityEndHour = activityEndHour;
        }

        public Integer getActivityEndMinute() {
            return activityEndMinute;
        }

        public void setActivityEndMinute(Integer activityEndMinute) {
            this.activityEndMinute = activityEndMinute;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public List<String> getCategoryNames() {
            return categoryNames;
        }

        public void setCategoryNames(List<String> categoryNames) {
            this.categoryNames = categoryNames;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getHowToReach() {
            return howToReach;
        }

        public void setHowToReach(String howToReach) {
            this.howToReach = howToReach;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public int getXid() {
            return xid;
        }

        public void setXid(int xid) {
            this.xid = xid;
        }

        public String getKeyImageUrl() {
            return keyImageUrl;
        }

        public void setKeyImageUrl(String keyImageUrl) {
            this.keyImageUrl = keyImageUrl;
        }

        public String getWhyToVisit() {
            return whyToVisit;
        }

        public void setWhyToVisit(String whyToVisit) {
            this.whyToVisit = whyToVisit;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public String getName() {
            return name;
        }

        public String getDisplayedActivityTime() {
            return activityStartHour + ":" + activityStartMinute + " to " + activityEndHour + ":" + activityEndMinute;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStateName() {
            return stateName;
        }

        public void setStateName(String stateName) {
            this.stateName = stateName;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public int compareTo(@NonNull PlacesToVisit o) {
           int ans = 0;



            return ans;
        }
    }

    public static class Data implements Parcelable {
        @SerializedName("Places To Visit")
        private ArrayList<PlacesToVisit> PlacesToVisit;
        @SerializedName("Things To Do")
        private ArrayList<PlacesToVisit> ThingsToDo;

        protected Data(Parcel in) {
            PlacesToVisit = in.createTypedArrayList(PlacePickerResponse.PlacesToVisit.CREATOR);
            ThingsToDo = in.createTypedArrayList(PlacePickerResponse.PlacesToVisit.CREATOR);
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeTypedList(PlacesToVisit);
            dest.writeTypedList(ThingsToDo);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<Data> CREATOR = new Creator<Data>() {
            @Override
            public Data createFromParcel(Parcel in) {
                return new Data(in);
            }

            @Override
            public Data[] newArray(int size) {
                return new Data[size];
            }
        };

        public ArrayList<PlacesToVisit> getPlacesToVisit() {
            return PlacesToVisit;
        }

        public void setPlacesToVisit(ArrayList<PlacesToVisit> PlacesToVisit) {
            this.PlacesToVisit = PlacesToVisit;
        }

        public ArrayList<PlacesToVisit> getThingsToDo() {
            return ThingsToDo;
        }

        public void setThingsToDo(ArrayList<PlacesToVisit> ThingsToDo) {
            this.ThingsToDo = ThingsToDo;
        }
    }
}

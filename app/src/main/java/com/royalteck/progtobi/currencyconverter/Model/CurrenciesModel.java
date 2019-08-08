
package com.royalteck.progtobi.currencyconverter.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//Currency Model to get Values from the Api Call and Write into the Parcelable
public class CurrenciesModel implements Parcelable
{

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("rates")
    @Expose
    private Rates rates;
    public final static Creator<CurrenciesModel> CREATOR = new Creator<CurrenciesModel>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CurrenciesModel createFromParcel(Parcel in) {
            return new CurrenciesModel(in);
        }

        public CurrenciesModel[] newArray(int size) {
            return (new CurrenciesModel[size]);
        }

    }
    ;

    protected CurrenciesModel(Parcel in) {
        this.success = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.timestamp = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.base = ((String) in.readValue((String.class.getClassLoader())));
        this.date = ((String) in.readValue((String.class.getClassLoader())));
        this.rates = ((Rates) in.readValue((Rates.class.getClassLoader())));
    }

    public CurrenciesModel() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(success);
        dest.writeValue(timestamp);
        dest.writeValue(base);
        dest.writeValue(date);
        dest.writeValue(rates);
    }

    public int describeContents() {
        return  0;
    }

}

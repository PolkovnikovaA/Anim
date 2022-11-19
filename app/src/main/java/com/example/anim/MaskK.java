package com.example.anim;

import android.os.Parcel;
import android.os.Parcelable;

public class MaskK implements Parcelable {

    private int ID;
    private String Breed;
    private String Country;
    private String Image;

    protected MaskK(Parcel in) {
        ID = in.readInt();
        Breed = in.readString();
        Country = in.readString();
        Image = in.readString();
    }

    public static final Creator<MaskK> CREATOR = new Creator<MaskK>() {
        @Override
        public MaskK createFromParcel(Parcel in) {
            return new MaskK(in);
        }

        @Override
        public MaskK[] newArray(int size) {
            return new MaskK[size];
        }
    };

    public MaskK(int ID, String breed, String country, String image) {
        this.ID = ID;
        Breed = breed;
        Country = country;
        Image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(ID);
        parcel.writeString(Breed);
        parcel.writeString(Country);
        parcel.writeString(Image);
    }

    public int getID() {
        return ID;
    }

    public String getBreed() {
        return Breed;
    }

    public String getCountry() {
        return Country;
    }

    public String getImage() {
        return Image;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setImage(String image) {
        Image = image;
    }
}

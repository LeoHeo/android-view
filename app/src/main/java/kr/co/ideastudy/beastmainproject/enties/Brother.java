package kr.co.ideastudy.beastmainproject.enties;

import android.os.Parcel;
import android.os.Parcelable;


public class Brother implements Parcelable{
    private int brotherId;
    private String brotherName;
    private String brotherWhyJoin;
    private String brotherPicture;
    private String brotherMajor;
    private String brotherCrossSemester;
    private String brotherFunFact;

    public Brother(int brotherId, String brotherName, String brotherWhyJoin, String brotherPicture, String brotherMajor, String brotherCrossSemester, String brotherFunFact) {
        this.brotherId = brotherId;
        this.brotherName = brotherName;
        this.brotherWhyJoin = brotherWhyJoin;
        this.brotherPicture = brotherPicture;
        this.brotherMajor = brotherMajor;
        this.brotherCrossSemester = brotherCrossSemester;
        this.brotherFunFact = brotherFunFact;
    }

    protected Brother(Parcel in) {
        brotherId = in.readInt();
        brotherName = in.readString();
        brotherWhyJoin = in.readString();
        brotherPicture = in.readString();
        brotherMajor = in.readString();
        brotherCrossSemester = in.readString();
        brotherFunFact = in.readString();
    }

    public static final Creator<Brother> CREATOR = new Creator<Brother>() {
        @Override
        public Brother createFromParcel(Parcel in) {
            return new Brother(in);
        }

        @Override
        public Brother[] newArray(int size) {
            return new Brother[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(brotherId);
        dest.writeString(brotherName);
        dest.writeString(brotherWhyJoin);
        dest.writeString(brotherMajor);
        dest.writeString(brotherCrossSemester);
        dest.writeString(brotherPicture);
        dest.writeString(brotherFunFact);
    }

    public int getBrotherId() {
        return brotherId;
    }

    public String getBrotherName() {
        return brotherName;
    }

    public String getBrotherWhyJoin() {
        return brotherWhyJoin;
    }

    public String getBrotherPicture() {
        return brotherPicture;
    }

    public String getBrotherMajor() {
        return brotherMajor;
    }

    public String getBrotherCrossSemester() {
        return brotherCrossSemester;
    }

    public String getBrotherFunFact() {
        return brotherFunFact;
    }
}

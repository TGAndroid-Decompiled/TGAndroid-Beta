package q4;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new x(0);
    public final int f53827a;
    public final float f53828b;
    public Rating f53829c;

    public y(int i7, float f10) {
        this.f53827a = i7;
        this.f53828b = f10;
    }

    public static y c(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new y(6, f10);
        }
        h2.a.c("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static y d(float f10, int i7) {
        float f11;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    h2.a.c("Rating", "Invalid rating style (" + i7 + ") for a star rating");
                    return null;
                }
                f11 = 5.0f;
            } else {
                f11 = 4.0f;
            }
        } else {
            f11 = 3.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new y(i7, f10);
        }
        h2.a.c("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i7 = this.f53827a;
        if ((i7 == 3 || i7 == 4 || i7 == 5) && b()) {
            return this.f53828b;
        }
        return -1.0f;
    }

    public final boolean b() {
        if (this.f53828b >= 0.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final int describeContents() {
        return this.f53827a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f53827a);
        sb2.append(" rating=");
        float f10 = this.f53828b;
        if (f10 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f10);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f53827a);
        parcel.writeFloat(this.f53828b);
    }
}

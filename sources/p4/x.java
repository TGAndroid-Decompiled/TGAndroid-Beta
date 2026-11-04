package p4;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new n8.g(15);
    public final int f53203a;
    public final float f53204b;
    public Rating f53205c;

    public x(int i3, float f10) {
        this.f53203a = i3;
        this.f53204b = f10;
    }

    public static x c(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new x(6, f10);
        }
        g2.a.c("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static x d(float f10, int i3) {
        float f11;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 5) {
                    g2.a.c("Rating", "Invalid rating style (" + i3 + ") for a star rating");
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
            return new x(i3, f10);
        }
        g2.a.c("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i3 = this.f53203a;
        if ((i3 == 3 || i3 == 4 || i3 == 5) && b()) {
            return this.f53204b;
        }
        return -1.0f;
    }

    public final boolean b() {
        if (this.f53204b >= 0.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final int describeContents() {
        return this.f53203a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f53203a);
        sb2.append(" rating=");
        float f10 = this.f53204b;
        if (f10 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f10);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f53203a);
        parcel.writeFloat(this.f53204b);
    }
}

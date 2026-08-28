package x5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new w7.i(2);
    public final int f48890a;
    public final String f48891b;

    public d(int i9, String str) {
        this.f48890a = i9;
        this.f48891b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f48890a == this.f48890a && l.l(dVar.f48891b, this.f48891b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48890a;
    }

    public final String toString() {
        return this.f48890a + ":" + this.f48891b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f48890a);
        p8.l(parcel, 2, this.f48891b);
        p8.r(parcel, q10);
    }
}

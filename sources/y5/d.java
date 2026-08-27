package y5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w7.f(10);

    public final int f49607a;

    public final String f49608b;

    public d(int i10, String str) {
        this.f49607a = i10;
        this.f49608b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f49607a == this.f49607a && l.l(dVar.f49608b, this.f49608b);
    }

    public final int hashCode() {
        return this.f49607a;
    }

    public final String toString() {
        return this.f49607a + ":" + this.f49608b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f49607a);
        r8.l(parcel, 2, this.f49608b);
        r8.r(parcel, iQ);
    }
}

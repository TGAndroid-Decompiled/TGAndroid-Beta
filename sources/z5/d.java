package z5;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new w5.k(14);
    public final int f50590a;
    public final String f50591b;

    public d(int i10, String str) {
        this.f50590a = i10;
        this.f50591b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f50590a == this.f50590a && l.l(dVar.f50591b, this.f50591b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50590a;
    }

    public final String toString() {
        return this.f50590a + ":" + this.f50591b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f50590a);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f50591b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}

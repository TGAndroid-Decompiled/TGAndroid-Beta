package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f51793a;
    public final String f51794b;
    public final int f51795c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f51793a = str;
        this.f51794b = str2;
        this.f51795c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f51793a.equals(this.f51793a);
    }

    public final int hashCode() {
        return this.f51793a.hashCode();
    }

    public final String toString() {
        StringBuilder x10 = a1.g.x("Node{", this.f51794b, ", id=", this.f51793a, ", hops=");
        x10.append(this.f51795c);
        x10.append(", isNearby=");
        x10.append(this.d);
        x10.append("}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f51793a);
        w7.d0.l(parcel, 3, this.f51794b);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.f51795c);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}

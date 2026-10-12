package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f52025a;
    public final String f52026b;
    public final int f52027c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f52025a = str;
        this.f52026b = str2;
        this.f52027c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f52025a.equals(this.f52025a);
    }

    public final int hashCode() {
        return this.f52025a.hashCode();
    }

    public final String toString() {
        StringBuilder x10 = a1.g.x("Node{", this.f52026b, ", id=", this.f52025a, ", hops=");
        x10.append(this.f52027c);
        x10.append(", isNearby=");
        x10.append(this.d);
        x10.append("}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 2, this.f52025a);
        w7.c0.l(parcel, 3, this.f52026b);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.f52027c);
        w7.c0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.c0.r(parcel, q6);
    }
}

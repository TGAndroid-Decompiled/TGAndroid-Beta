package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j0 extends o6.a {
    public static final Parcelable.Creator<j0> CREATOR = new c(29);
    public final String f54238a;
    public final String f54239b;
    public final int f54240c;
    public final boolean d;

    public j0(int i10, String str, String str2, boolean z10) {
        this.f54238a = str;
        this.f54239b = str2;
        this.f54240c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        return ((j0) obj).f54238a.equals(this.f54238a);
    }

    public final int hashCode() {
        return this.f54238a.hashCode();
    }

    public final String toString() {
        StringBuilder v = a1.g.v("Node{", this.f54239b, ", id=", this.f54238a, ", hops=");
        v.append(this.f54240c);
        v.append(", isNearby=");
        v.append(this.d);
        v.append("}");
        return v.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 2, this.f54238a);
        w7.h0.l(parcel, 3, this.f54239b);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.f54240c);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.h0.r(parcel, q6);
    }
}

package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f50512a;
    public final String f50513b;
    public final int f50514c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f50512a = str;
        this.f50513b = str2;
        this.f50514c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f50512a.equals(this.f50512a);
    }

    public final int hashCode() {
        return this.f50512a.hashCode();
    }

    public final String toString() {
        StringBuilder x10 = a4.a.x("Node{", this.f50513b, ", id=", this.f50512a, ", hops=");
        x10.append(this.f50514c);
        x10.append(", isNearby=");
        x10.append(this.d);
        x10.append("}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f50512a);
        w7.g0.l(parcel, 3, this.f50513b);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.f50514c);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}

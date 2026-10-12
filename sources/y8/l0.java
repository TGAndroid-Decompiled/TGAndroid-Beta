package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f48632a;
    public final String f48633b;
    public final int f48634c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f48632a = str;
        this.f48633b = str2;
        this.f48634c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f48632a.equals(this.f48632a);
    }

    public final int hashCode() {
        return this.f48632a.hashCode();
    }

    public final String toString() {
        StringBuilder w9 = a1.g.w("Node{", this.f48633b, ", id=", this.f48632a, ", hops=");
        w9.append(this.f48634c);
        w9.append(", isNearby=");
        w9.append(this.d);
        w9.append("}");
        return w9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f48632a);
        w7.g0.l(parcel, 3, this.f48633b);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.f48634c);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}

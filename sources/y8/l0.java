package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f46652a;
    public final String f46653b;
    public final int f46654c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f46652a = str;
        this.f46653b = str2;
        this.f46654c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f46652a.equals(this.f46652a);
    }

    public final int hashCode() {
        return this.f46652a.hashCode();
    }

    public final String toString() {
        StringBuilder x10 = a4.a.x("Node{", this.f46653b, ", id=", this.f46652a, ", hops=");
        x10.append(this.f46654c);
        x10.append(", isNearby=");
        x10.append(this.d);
        x10.append("}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f46652a);
        w7.f0.l(parcel, 3, this.f46653b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f46654c);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}

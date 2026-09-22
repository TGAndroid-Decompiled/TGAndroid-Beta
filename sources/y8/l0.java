package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f46380a;
    public final String f46381b;
    public final int f46382c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f46380a = str;
        this.f46381b = str2;
        this.f46382c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f46380a.equals(this.f46380a);
    }

    public final int hashCode() {
        return this.f46380a.hashCode();
    }

    public final String toString() {
        StringBuilder x10 = a4.a.x("Node{", this.f46381b, ", id=", this.f46380a, ", hops=");
        x10.append(this.f46382c);
        x10.append(", isNearby=");
        x10.append(this.d);
        x10.append("}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f46380a);
        w7.e0.l(parcel, 3, this.f46381b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f46382c);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}

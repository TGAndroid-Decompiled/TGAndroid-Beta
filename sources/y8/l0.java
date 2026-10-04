package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f50496a;
    public final String f50497b;
    public final int f50498c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f50496a = str;
        this.f50497b = str2;
        this.f50498c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f50496a.equals(this.f50496a);
    }

    public final int hashCode() {
        return this.f50496a.hashCode();
    }

    public final String toString() {
        StringBuilder w10 = a4.a.w("Node{", this.f50497b, ", id=", this.f50496a, ", hops=");
        w10.append(this.f50498c);
        w10.append(", isNearby=");
        w10.append(this.d);
        w10.append("}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f50496a);
        w7.g0.l(parcel, 3, this.f50497b);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.f50498c);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}

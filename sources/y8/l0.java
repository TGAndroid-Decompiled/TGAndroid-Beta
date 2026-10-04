package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f50497a;
    public final String f50498b;
    public final int f50499c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f50497a = str;
        this.f50498b = str2;
        this.f50499c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f50497a.equals(this.f50497a);
    }

    public final int hashCode() {
        return this.f50497a.hashCode();
    }

    public final String toString() {
        StringBuilder w10 = a4.a.w("Node{", this.f50498b, ", id=", this.f50497a, ", hops=");
        w10.append(this.f50499c);
        w10.append(", isNearby=");
        w10.append(this.d);
        w10.append("}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f50497a);
        w7.g0.l(parcel, 3, this.f50498b);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.f50499c);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}

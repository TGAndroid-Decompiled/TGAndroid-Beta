package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f46407a;
    public final String f46408b;
    public final int f46409c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f46407a = str;
        this.f46408b = str2;
        this.f46409c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f46407a.equals(this.f46407a);
    }

    public final int hashCode() {
        return this.f46407a.hashCode();
    }

    public final String toString() {
        StringBuilder w10 = a4.a.w("Node{", this.f46408b, ", id=", this.f46407a, ", hops=");
        w10.append(this.f46409c);
        w10.append(", isNearby=");
        w10.append(this.d);
        w10.append("}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f46407a);
        w7.e0.l(parcel, 3, this.f46408b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f46409c);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}

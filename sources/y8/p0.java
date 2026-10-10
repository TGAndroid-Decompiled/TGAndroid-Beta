package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(2);
    public final int f51855a;
    public final String f51856b;

    public p0(int i10, String str) {
        this.f51855a = i10;
        this.f51856b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51855a);
        w7.d0.l(parcel, 3, this.f51856b);
        w7.d0.r(parcel, q6);
    }
}

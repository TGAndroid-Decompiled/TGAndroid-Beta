package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(17);
    public int f47495a;
    public String f47496b;
    public double f47497c;
    public String d;
    public long e;
    public int f47498f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f47495a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f47496b);
        double d = this.f47497c;
        g0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        g0.l(parcel, 5, this.d);
        long j10 = this.e;
        g0.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f47498f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        g0.r(parcel, q6);
    }
}

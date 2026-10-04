package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(19);
    public int f48900a;
    public String f48901b;
    public double f48902c;
    public String d;
    public long f48903e;
    public int f48904f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f48900a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f48901b);
        double d = this.f48902c;
        g0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        g0.l(parcel, 5, this.d);
        long j3 = this.f48903e;
        g0.s(parcel, 6, 8);
        parcel.writeLong(j3);
        int i12 = this.f48904f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        g0.r(parcel, q6);
    }
}

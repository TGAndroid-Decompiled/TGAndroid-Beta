package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(19);
    public int f48915a;
    public String f48916b;
    public double f48917c;
    public String d;
    public long f48918e;
    public int f48919f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f48915a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f48916b);
        double d = this.f48917c;
        g0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        g0.l(parcel, 5, this.d);
        long j3 = this.f48918e;
        g0.s(parcel, 6, 8);
        parcel.writeLong(j3);
        int i12 = this.f48919f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        g0.r(parcel, q6);
    }
}

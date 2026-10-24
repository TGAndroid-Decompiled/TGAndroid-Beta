package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(17);
    public int f49328a;
    public String f49329b;
    public double f49330c;
    public String d;
    public long e;
    public int f49331f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f49328a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f49329b);
        double d = this.f49330c;
        f0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        f0.l(parcel, 5, this.d);
        long j10 = this.e;
        f0.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f49331f;
        f0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        f0.r(parcel, q6);
    }
}

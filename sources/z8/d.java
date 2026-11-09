package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f60017a;
    public String f60018b;
    public double f60019c;
    public String d;
    public long f60020e;
    public int f60021f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f60017a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f60018b);
        double d = this.f60019c;
        xb.q(parcel, 4, 8);
        parcel.writeDouble(d);
        xb.l(parcel, 5, this.d);
        long j3 = this.f60020e;
        xb.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f60021f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        xb.s(parcel, r10);
    }
}

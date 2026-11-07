package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f59914a;
    public String f59915b;
    public double f59916c;
    public String d;
    public long f59917e;
    public int f59918f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f59914a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f59915b);
        double d = this.f59916c;
        xb.q(parcel, 4, 8);
        parcel.writeDouble(d);
        xb.l(parcel, 5, this.d);
        long j3 = this.f59917e;
        xb.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f59918f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        xb.s(parcel, r10);
    }
}

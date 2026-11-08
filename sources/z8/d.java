package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f60007a;
    public String f60008b;
    public double f60009c;
    public String d;
    public long f60010e;
    public int f60011f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f60007a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f60008b);
        double d = this.f60009c;
        xb.q(parcel, 4, 8);
        parcel.writeDouble(d);
        xb.l(parcel, 5, this.d);
        long j3 = this.f60010e;
        xb.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f60011f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        xb.s(parcel, r10);
    }
}

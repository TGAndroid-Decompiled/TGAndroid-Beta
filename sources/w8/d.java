package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(19);
    public int f43852a;
    public String f43853b;
    public double f43854c;
    public String d;
    public long e;
    public int f43855f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f43852a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f43853b);
        double d = this.f43854c;
        e0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        e0.l(parcel, 5, this.d);
        long j3 = this.e;
        e0.s(parcel, 6, 8);
        parcel.writeLong(j3);
        int i12 = this.f43855f;
        e0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        e0.r(parcel, q6);
    }
}

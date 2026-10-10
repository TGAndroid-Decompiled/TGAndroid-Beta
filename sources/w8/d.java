package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.d0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(19);
    public int f50241a;
    public String f50242b;
    public double f50243c;
    public String d;
    public long f50244e;
    public int f50245f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f50241a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.l(parcel, 3, this.f50242b);
        double d = this.f50243c;
        d0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        d0.l(parcel, 5, this.d);
        long j3 = this.f50244e;
        d0.s(parcel, 6, 8);
        parcel.writeLong(j3);
        int i12 = this.f50245f;
        d0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        d0.r(parcel, q6);
    }
}

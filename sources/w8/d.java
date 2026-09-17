package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(19);
    public int f48355a;
    public String f48356b;
    public double f48357c;
    public String d;
    public long f48358e;
    public int f48359f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f48355a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f48356b);
        double d = this.f48357c;
        e0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        e0.l(parcel, 5, this.d);
        long j3 = this.f48358e;
        e0.s(parcel, 6, 8);
        parcel.writeLong(j3);
        int i12 = this.f48359f;
        e0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        e0.r(parcel, q6);
    }
}

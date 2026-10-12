package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.c0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(19);
    public int f50424a;
    public String f50425b;
    public double f50426c;
    public String d;
    public long f50427e;
    public int f50428f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f50424a;
        c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        c0.l(parcel, 3, this.f50425b);
        double d = this.f50426c;
        c0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        c0.l(parcel, 5, this.d);
        long j3 = this.f50427e;
        c0.s(parcel, 6, 8);
        parcel.writeLong(j3);
        int i12 = this.f50428f;
        c0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        c0.r(parcel, q6);
    }
}

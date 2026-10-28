package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(17);
    public int f51749a;
    public String f51750b;
    public double f51751c;
    public String d;
    public long e;
    public int f51752f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f51749a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f51750b);
        double d = this.f51751c;
        df.s(parcel, 4, 8);
        parcel.writeDouble(d);
        df.l(parcel, 5, this.d);
        long j10 = this.e;
        df.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f51752f;
        df.s(parcel, 7, 4);
        parcel.writeInt(i12);
        df.r(parcel, q5);
    }
}

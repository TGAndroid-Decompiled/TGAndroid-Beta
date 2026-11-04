package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new w8.b(25);
    public int f59332a;
    public String f59333b;
    public double f59334c;
    public String d;
    public long f59335e;
    public int f59336f;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f59332a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.f59333b);
        double d = this.f59334c;
        j8.a.r(parcel, 4, 8);
        parcel.writeDouble(d);
        j8.a.m(parcel, 5, this.d);
        long j10 = this.f59335e;
        j8.a.r(parcel, 6, 8);
        parcel.writeLong(j10);
        int i11 = this.f59336f;
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(i11);
        j8.a.t(parcel, s6);
    }
}

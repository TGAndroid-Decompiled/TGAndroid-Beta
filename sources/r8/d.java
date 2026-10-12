package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.m(10);
    public h f43986a;
    public String f43987b;
    public String f43988c;
    public i[] d;
    public f[] e;
    public String[] f43989f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f43986a, i10);
        g0.l(parcel, 3, this.f43987b);
        g0.l(parcel, 4, this.f43988c);
        g0.o(parcel, 5, this.d, i10);
        g0.o(parcel, 6, this.e, i10);
        g0.m(parcel, 7, this.f43989f);
        g0.o(parcel, 8, this.h, i10);
        g0.r(parcel, q6);
    }
}

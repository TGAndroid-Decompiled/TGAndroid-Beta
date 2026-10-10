package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.j(12);
    public h f47095a;
    public String f47096b;
    public String f47097c;
    public i[] d;
    public f[] f47098e;
    public String[] f47099f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 2, this.f47095a, i10);
        d0.l(parcel, 3, this.f47096b);
        d0.l(parcel, 4, this.f47097c);
        d0.o(parcel, 5, this.d, i10);
        d0.o(parcel, 6, this.f47098e, i10);
        d0.m(parcel, 7, this.f47099f);
        d0.o(parcel, 8, this.h, i10);
        d0.r(parcel, q6);
    }
}

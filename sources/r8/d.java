package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.j(12);
    public h f47265a;
    public String f47266b;
    public String f47267c;
    public i[] d;
    public f[] f47268e;
    public String[] f47269f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 2, this.f47265a, i10);
        c0.l(parcel, 3, this.f47266b);
        c0.l(parcel, 4, this.f47267c);
        c0.o(parcel, 5, this.d, i10);
        c0.o(parcel, 6, this.f47268e, i10);
        c0.m(parcel, 7, this.f47269f);
        c0.o(parcel, 8, this.h, i10);
        c0.r(parcel, q6);
    }
}

package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.j(12);
    public h f41323a;
    public String f41324b;
    public String f41325c;
    public i[] d;
    public f[] e;
    public String[] f41326f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f41323a, i10);
        e0.l(parcel, 3, this.f41324b);
        e0.l(parcel, 4, this.f41325c);
        e0.o(parcel, 5, this.d, i10);
        e0.o(parcel, 6, this.e, i10);
        e0.m(parcel, 7, this.f41326f);
        e0.o(parcel, 8, this.h, i10);
        e0.r(parcel, q6);
    }
}

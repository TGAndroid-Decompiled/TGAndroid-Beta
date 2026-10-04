package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.j(12);
    public h f45884a;
    public String f45885b;
    public String f45886c;
    public i[] d;
    public f[] f45887e;
    public String[] f45888f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f45884a, i10);
        g0.l(parcel, 3, this.f45885b);
        g0.l(parcel, 4, this.f45886c);
        g0.o(parcel, 5, this.d, i10);
        g0.o(parcel, 6, this.f45887e, i10);
        g0.m(parcel, 7, this.f45888f);
        g0.o(parcel, 8, this.h, i10);
        g0.r(parcel, q6);
    }
}

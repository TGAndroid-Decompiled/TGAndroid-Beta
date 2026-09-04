package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.j(12);
    public h f44984a;
    public String f44985b;
    public String f44986c;
    public i[] d;
    public f[] f44987e;
    public String[] f44988f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f44984a, i10);
        e0.l(parcel, 3, this.f44985b);
        e0.l(parcel, 4, this.f44986c);
        e0.o(parcel, 5, this.d, i10);
        e0.o(parcel, 6, this.f44987e, i10);
        e0.m(parcel, 7, this.f44988f);
        e0.o(parcel, 8, this.h, i10);
        e0.r(parcel, q6);
    }
}

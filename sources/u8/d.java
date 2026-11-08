package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h f56404a;
    public String f56405b;
    public String f56406c;
    public i[] d;
    public f[] f56407e;
    public String[] f56408f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f56404a, i7);
        xb.l(parcel, 3, this.f56405b);
        xb.l(parcel, 4, this.f56406c);
        xb.o(parcel, 5, this.d, i7);
        xb.o(parcel, 6, this.f56407e, i7);
        xb.m(parcel, 7, this.f56408f);
        xb.o(parcel, 8, this.h, i7);
        xb.s(parcel, r10);
    }
}

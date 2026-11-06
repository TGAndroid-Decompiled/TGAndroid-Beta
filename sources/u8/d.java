package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h f56314a;
    public String f56315b;
    public String f56316c;
    public i[] d;
    public f[] f56317e;
    public String[] f56318f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f56314a, i7);
        xb.l(parcel, 3, this.f56315b);
        xb.l(parcel, 4, this.f56316c);
        xb.o(parcel, 5, this.d, i7);
        xb.o(parcel, 6, this.f56317e, i7);
        xb.m(parcel, 7, this.f56318f);
        xb.o(parcel, 8, this.h, i7);
        xb.s(parcel, r10);
    }
}

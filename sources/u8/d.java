package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h f56415a;
    public String f56416b;
    public String f56417c;
    public i[] d;
    public f[] f56418e;
    public String[] f56419f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f56415a, i7);
        xb.l(parcel, 3, this.f56416b);
        xb.l(parcel, 4, this.f56417c);
        xb.o(parcel, 5, this.d, i7);
        xb.o(parcel, 6, this.f56418e, i7);
        xb.m(parcel, 7, this.f56419f);
        xb.o(parcel, 8, this.h, i7);
        xb.s(parcel, r10);
    }
}

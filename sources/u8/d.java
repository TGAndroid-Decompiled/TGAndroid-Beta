package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h f57914a;
    public String f57915b;
    public String f57916c;
    public i[] d;
    public f[] f57917e;
    public String[] f57918f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f57914a, i7);
        yb.l(parcel, 3, this.f57915b);
        yb.l(parcel, 4, this.f57916c);
        yb.o(parcel, 5, this.d, i7);
        yb.o(parcel, 6, this.f57917e, i7);
        yb.m(parcel, 7, this.f57918f);
        yb.o(parcel, 8, this.h, i7);
        yb.s(parcel, r10);
    }
}

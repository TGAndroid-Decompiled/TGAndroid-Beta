package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h f56290a;
    public String f56291b;
    public String f56292c;
    public i[] d;
    public f[] f56293e;
    public String[] f56294f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.f56290a, i7);
        wb.l(parcel, 3, this.f56291b);
        wb.l(parcel, 4, this.f56292c);
        wb.o(parcel, 5, this.d, i7);
        wb.o(parcel, 6, this.f56293e, i7);
        wb.m(parcel, 7, this.f56294f);
        wb.o(parcel, 8, this.h, i7);
        wb.s(parcel, r10);
    }
}

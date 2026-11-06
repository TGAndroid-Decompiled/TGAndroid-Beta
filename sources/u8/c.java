package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String f56310a;
    public String f56311b;
    public String f56312c;
    public String d;
    public String f56313e;
    public b f56314f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f56310a);
        wb.l(parcel, 3, this.f56311b);
        wb.l(parcel, 4, this.f56312c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.f56313e);
        wb.k(parcel, 7, this.f56314f, i7);
        wb.k(parcel, 8, this.h, i7);
        wb.s(parcel, r10);
    }
}

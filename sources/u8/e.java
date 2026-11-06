package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new o(6);
    public String D;
    public String f56320a;
    public String f56321b;
    public String f56322c;
    public String d;
    public String f56323e;
    public String f56324f;
    public String h;
    public String f56325n;
    public String f56326r;
    public String f56327s;
    public String f56328w;
    public String f56329x;
    public String f56330y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f56320a);
        wb.l(parcel, 3, this.f56321b);
        wb.l(parcel, 4, this.f56322c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.f56323e);
        wb.l(parcel, 7, this.f56324f);
        wb.l(parcel, 8, this.h);
        wb.l(parcel, 9, this.f56325n);
        wb.l(parcel, 10, this.f56326r);
        wb.l(parcel, 11, this.f56327s);
        wb.l(parcel, 12, this.f56328w);
        wb.l(parcel, 13, this.f56329x);
        wb.l(parcel, 14, this.f56330y);
        wb.l(parcel, 15, this.D);
        wb.s(parcel, r10);
    }
}

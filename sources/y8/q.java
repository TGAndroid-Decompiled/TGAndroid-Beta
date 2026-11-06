package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f59195a;
    public String f59196b;
    public String f59197c;
    public String d;
    public String f59198e;
    public String f59199f;
    public String h;
    public String f59200n;
    public String f59201r;
    public boolean f59202s;
    public String f59203w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59195a);
        wb.l(parcel, 3, this.f59196b);
        wb.l(parcel, 4, this.f59197c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.f59198e);
        wb.l(parcel, 7, this.f59199f);
        wb.l(parcel, 8, this.h);
        wb.l(parcel, 9, this.f59200n);
        wb.l(parcel, 10, this.f59201r);
        boolean z9 = this.f59202s;
        wb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.l(parcel, 12, this.f59203w);
        wb.s(parcel, r10);
    }
}

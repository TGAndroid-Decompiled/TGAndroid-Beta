package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f59220a;
    public String f59221b;
    public String f59222c;
    public String d;
    public String f59223e;
    public String f59224f;
    public String h;
    public String f59225n;
    public String f59226r;
    public boolean f59227s;
    public String f59228w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59220a);
        wb.l(parcel, 3, this.f59221b);
        wb.l(parcel, 4, this.f59222c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.f59223e);
        wb.l(parcel, 7, this.f59224f);
        wb.l(parcel, 8, this.h);
        wb.l(parcel, 9, this.f59225n);
        wb.l(parcel, 10, this.f59226r);
        boolean z9 = this.f59227s;
        wb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.l(parcel, 12, this.f59228w);
        wb.s(parcel, r10);
    }
}

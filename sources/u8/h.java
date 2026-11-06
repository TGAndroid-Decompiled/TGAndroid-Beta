package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new o(7);
    public String f56336a;
    public String f56337b;
    public String f56338c;
    public String d;
    public String f56339e;
    public String f56340f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f56336a);
        wb.l(parcel, 3, this.f56337b);
        wb.l(parcel, 4, this.f56338c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.f56339e);
        wb.l(parcel, 7, this.f56340f);
        wb.l(parcel, 8, this.h);
        wb.s(parcel, r10);
    }
}
